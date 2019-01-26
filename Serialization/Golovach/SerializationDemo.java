package Clone;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        { // порождение сущности
            Object[] src = new Object[0];
            Object[] dst = copy(src);
            System.out.println(src != dst);
        }
        { // глубокое копирование - атономный граф
            Object[] src = {new Object[0]};
            Object[] dst = copy(src);
            System.out.println(src[0] != dst[0]);
        }
        { // сохранение графа объектор
            Object[] src0 = {new Object[1]};
            Object[] src1 = {src0};
            src0[0] = src1;
            Object[] dst = copy(src0);
            System.out.println(((Object[]) dst[0])[0] == dst);
        }
    }

    public static <T extends Serializable> T copy(T obj) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream buff = new ByteArrayOutputStream(); // изменяемый массив byte - поток для записи
        ObjectOutput objectOutput = new ObjectOutputStream(buff); // адаптер Stream в ObjectOutputStream
        objectOutput.writeObject(obj); // пишем в поток произвольный объект
        objectOutput.flush();
        objectOutput.close();
        byte[] rawData = buff.toByteArray(); // "выдавливаем" из потока свой массив байт

        ObjectInput objectInput = new ObjectInputStream(new ByteArrayInputStream(rawData)); // подаем массив сырых байт
        // в конструктор к InputStream (используем адаптер ByteArrayInputStream), и результирующий поток подаем в
        // к конструктор к ObjectInputStream, который меет читать из байт произвольный объект
        return (T) objectInput.readObject(); // читаем обюъект и возвращаем его из метода
    }
}
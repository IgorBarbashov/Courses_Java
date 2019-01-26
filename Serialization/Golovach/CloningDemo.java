package Clone;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class CloninDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        { // порождение сущности
            Object[] src = new Object[0];
            Object[] dst = copy(src);
            System.out.println(src != dst);
        }
        { // поверхностное копирование - ??????????? граф
            Object[] src = {new Object[0]};
            Object[] dst = copy(src);
            System.out.println(src[0] == dst[0]); // здесь разница в условии сравнения
        }
        { // сохранение графа объектор
            Object[] src0 = {new Object[1]};
            Object[] src1 = {src0};
            src0[0] = src1;
            Object[] dst = copy(src0);
            System.out.println(((Object[]) dst[0])[0] != dst); // здесь разница в условии сравнения
            System.out.println(((Object[]) dst[0])[0] == src0); // попал не в копию, а в исходник
        }
    }

    public static <T extends Serializable> T copy(T obj) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method m = Object.class.getDeclaredMethod("clone");
        m.setAccessible(true);
        return (T) m.invoke(obj);
    }
}
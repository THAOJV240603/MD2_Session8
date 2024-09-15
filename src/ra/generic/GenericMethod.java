package ra.generic;

public class GenericMethod {
    //E kiểu dữ kiệu Element
    public <E> void printElementOfArray(E[] array) {
        for (E e : array) {
            System.out.println(e);
        }
    }
}

package ra.generic;

public class TestGenericMethod {
    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        //Khai báo mảng
        Integer[] array1 = {1,2,3,4,5};
        String[] array2 = {"Main","CPU"};

        genericMethod.printElementOfArray(array1);
        genericMethod.printElementOfArray(array2);
    }
}

package ra.generic;

public class Test {
    public static void main(String[] args) {
        DemoGeneric<String> generic = new DemoGeneric<>();
        generic.setElement("Chuỗi");

        DemoGeneric<Integer> demoGeneric = new DemoGeneric<>();
        demoGeneric.setElement(10);

        //Dictionary
        Dictionary<String, String> dictionary = new Dictionary<>();
        dictionary.setKey("love");
        dictionary.setValue("yêu");
        System.out.println(dictionary.getKey() + " : " + dictionary.getValue());

        Dictionary<Integer, String> dictionary1 = new Dictionary<>();
        dictionary1.setKey(1);
        dictionary1.setValue("One");
        System.out.println(dictionary1.getKey() + " : " + dictionary1.getValue());
    }
}

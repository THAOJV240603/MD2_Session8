package ra.collection;

public class Cat {
    private String catName;
    private int age;

    public Cat() {
    }

    public Cat(String catName, int age) {
        this.catName = catName;
        this.age = age;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

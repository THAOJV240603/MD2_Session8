package ra.generic;

//Định nghĩa class có kiểu dữ liệu T
public class DemoGeneric<T> {
    private T element;

    //Getter, setter

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}

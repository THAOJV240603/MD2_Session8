package ra.collection;

import java.util.ArrayList;
import java.util.List;

public class ListArrayList {
    public static void main(String[] args) {
        List<Cat> listCat = new ArrayList<>();

        Cat cat1 = new Cat("Mèo Tom", 84);
        Cat cat2 = new Cat("Mèo Mướp", 19);
        Cat cat3 = new Cat("Mèo Mướp", 19);

        //Thêm phần tử vào list phương thức add(E) thêm phần tử vào cuối danh sách
        listCat.add(cat1);
        listCat.add(cat2);

        //Phương thức trả về kích cỡ của danh sách
        System.out.println(listCat.size());

        //Phương thức kiểm tra xem danh sách có rỗng không
        System.out.println("Kiểm tra rỗng: " + listCat.isEmpty());

        //Kiểm tra 1 đối tượng có nằm trong danh sách hay không
        System.out.println(listCat.contains(cat3));

        //Chuyển collection thành mảng array
        listCat.toArray();

        //Xóa phần tử khỏi danh sách
        listCat.remove(cat1);
        System.out.println(listCat.size());

        //Xóa toàn bộ removeAll

        //Duyệt
        for (Cat cat : listCat) {
            System.out.println(cat.getCatName());
        }
    }
}

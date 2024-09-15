package ra.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap();

        //Thêm phần tử vào map
        map.put(1,"Nguyễn Mai");
        map.put(2,"An");
        map.put(3,"Ánh");

        //Truy cập lấy ra theo key
        System.out.println(map.get(1));

        //Xóa phần tử theo key
        map.remove(3);
    }
}

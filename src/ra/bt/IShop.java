package ra.bt;

import ra.bt.entity.Category;

import java.util.List;
import java.util.Scanner;

public interface IShop {

    //Phương thức nhập thông tin
    public void inputData(Scanner sc, List<Category> categories);

    //Phương thức hiển thị thông tin
    public void displayData();
}

package ra.bt.entity;

import ra.bt.IShop;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Category implements IShop {
    private int catalogId;
    private String catalogName;
    private boolean status;

    //Constructor
    public Category() {
    }

    public Category(int catalogId, String catalogName, boolean status) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.status = status;
    }

    //Getter, setter
    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner sc, List<Category> categories) {
        System.out.println("Nhập thông tin danh mục:");
        //regex dữ liệu dùng vòng lặp do while
        do{
            System.out.print("Mã danh mục: ");
            //Mã danh mục là số nguyên lớn hơn và không trùng lặp
            String id = sc.nextLine();
            if(Pattern.matches("[1-9]{1,100}", id)){
                this.catalogId = Integer.parseInt(id);
                //Kiểm tra trùng lặp
                if(!checkIdExist(this.catalogId,categories)){
                    break;
                }
                System.out.println("ID đã tồn tại");

            }else{
                System.out.println("Phải là số nguyên duương");
            }
        }while(true);

        do{
            System.out.print("Tên danh mục: ");
            //Tên danh mục không trùng lặp
            String name = sc.nextLine();
                //Kiểm tra trùng lặp
                if(!checkNameExist(name,categories)){
                    this.catalogName = name;
                    break;
                }else{
                    System.out.println("Tên danh mục đã tồn tại");
                }
        }while(true);

        System.out.print("Tình trạng: ");
        this.status = Boolean.parseBoolean(sc.nextLine());
    }

    //Phương thức kiểm tra xem id đã tồn tại hay chưa
    public boolean checkIdExist(int id, List<Category> categories){
        for (Category category : categories) {
            if(category.getCatalogId() == id){
                return true;
            }
        }
        return false;
    }

    //Phương thức kiểm tra xem tên danh mục đã tồn tại hay chưa
    public boolean checkNameExist(String name, List<Category> categories){
        for (Category category : categories) {
            if(category.getCatalogName().equals(name)){
                return true;
            }
        }
        return false;
    }
    @Override
    public void displayData() {
        System.out.println("======== Thông tin danh mục ========");
        System.out.println("Mã danh mục: " + this.catalogId);
        System.out.println("Tên danh mục: " + this.catalogName);
        System.out.println("Tình trạng: " + (this.status ? "Còn hàng" : "Hết hàng"));
    }
}

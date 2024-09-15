package ra.bt.entity;

import ra.bt.IShop;

import java.util.List;
import java.util.Scanner;

public class Product implements IShop {
    private String productId;
    private String productName;
    private float price;
    private String title;
    private int catalogId;
    private boolean status;

    //Constructor
    public Product() {
    }

    public Product(String productId, String productName, float price, String title, int catalogId, boolean status) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.title = title;
        this.catalogId = catalogId;
        this.status = status;
    }

    //Getter, setter
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner sc, List<Category> categories) {
        System.out.println("Nhập thông tin sản phẩm:");
        System.out.print("Mã sản phẩm: ");
        this.productId = sc.nextLine();
        System.out.print("Tên sản phẩm: ");
        this.productName = sc.nextLine();
        System.out.print("Giá: ");
        this.price = Float.parseFloat(sc.nextLine());
        System.out.print("Tiêu đề sản phẩm: ");
        this.title = sc.nextLine();
        System.out.print("Mã danh mục: ");
        this.catalogId = Integer.parseInt(sc.nextLine());
        System.out.print("Tình trạng: ");
        this.status = Boolean.parseBoolean(sc.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("======= Thông tin sản phẩm ========");
        System.out.println("Mã sản phẩm: " + this.productId);
        System.out.println("Tên sản phẩm: " + this.productName);
        System.out.println("Giá: " + this.price);
        System.out.println("Tiêu đề: " + this.title);
        System.out.println("Mã danh mục: " + this.catalogId);
        System.out.println("Tình trạng: " + (this.status ? "Còn hàng" : "Hết hàng"));
    }
}

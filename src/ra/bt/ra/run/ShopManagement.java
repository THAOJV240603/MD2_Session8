package ra.bt.ra.run;

import ra.bt.entity.Category;
import ra.bt.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopManagement {
    //Regex ko trùng lặp
    private static List<Category> categories = new ArrayList<>();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Menu 2 cấp
        do {
            System.out.println("*************************SHOP MANAGEMENT***************\n" +
                    "1. Quản lý danh mục sản phẩm\n" + "2. Quản lý sản phẩm\n" +
                    "3. Thoát");
            System.out.println("Mời bạn chọn 1 - 3");
            int choice = Integer.parseInt(sc.nextLine());
            //Tạo flag để quay lại menu đầu
            boolean check = true;
            switch (choice) {
                case 1:
                    do{
                        System.out.println("***************** CATALOG MANAGEMENT**************\n" +
                                "1. Thêm mới danh mục\n" +
                                "2. Hiển thị thông tin các danh mục\n" +
                                "3. Cập nhật tên danh mục theo mã danh mục\n" +
                                "4. Xóa danh mục theo mã danh mục (Danh mục chưa chứa sản phẩm)\n" +
                                "5. Thoát (Quay lại Shop Management)");
                        System.out.println("Mời bạn chọn 1 - 5");
                        int choice2 = Integer.parseInt(sc.nextLine());

                        switch (choice2) {
                            case 1:
                                //Thêm mới
                                System.out.println("Thêm mới danh mục");
                                Category category = new Category();
                                category.inputData(sc, categories);
                                categories.add(category);
                                break;
                            case 2:
                                //Hiển thị
                                System.out.println("Danh sách danh mục:");
                                for (Category category1 : categories) {
                                    category1.displayData();
                                }
                                break;
                            case 3:
                                //Cập nhật
                                System.out.println("Nhập vào mã danh mục cần cập nhật:");
                                int categoryId = Integer.parseInt(sc.nextLine());
                                for (Category category1 : categories) {
                                    if(category1.getCatalogId() == categoryId) {
                                        //category1.inputData(sc, categories);
                                        ShopManagement.updateCategory(category1, sc, categories);
                                    }
                                }
                                break;
                            case 4:
                                //Xóa
                                System.out.println("Nhập vào mã danh mục cần xóa:");
                                int idDelete = sc.nextInt();
                                for (Category category2 : categories) {
                                    if(category2.getCatalogId() == idDelete) {
                                        categories.remove(category2);
                                    }
                                }
                                break;
                            case 5:
                                check = false;
                                break;
                        }

                    }while(check);
                    break;

                case 2:
                    do{
                        System.out.println("***************** PRODUCT MANAGEMENT**************\n" +
                                "1. Thêm mới sản phẩm (Khi thêm cho phép chọn danh mục sản phẩm\n" +
                                "mà sản phẩm thuộc về)\n" +
                                "2. Hiển thị thông tin sản phẩm\n" +
                                "3. Cập nhật giá sản phẩm theo mã sản phẩm\n" +
                                "4. Xóa sản phẩm theo mã sản phẩm\n" +
                                "5. Sắp xếp sản phẩm theo giá sản phẩm tăng dần\n" +
                                "6. Sắp xếp sản phẩm theo tên tăng dần\n" +
                                "7. Thống kê số lượng sản phẩm theo danh mục sản phẩm\n" +
                                "8. Tìm kiếm sản phẩm theo tên sản phẩm\n" +
                                "9. Thoát (Quay lại Shop Management)");
                        System.out.println("Mời bạn chọn 1 - 9");
                        int choice3 = Integer.parseInt(sc.nextLine());

                        switch (choice3) {
                            case 1:
                                System.out.println("Thêm mới");
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                break;
                            case 9:
                                check = false;
                                break;
                        }

                    }while(check);
                    break;

                case 3:
                    System.exit(0);
                default:
                    System.out.println("Sai lựa chọn");
            }

        }while(true);
    }

    //Phương thức check Id update
    public static boolean checkIdUpdateCategory(int inputId, int idCategory, List<Category> list) {
        if (idCategory == inputId) {
            return true;
        }
        for (Category category : list) {
            if(category.getCatalogId() == inputId){
                return false;
            }
        }
        return true;
    }

    //Phương thức update
    public static boolean updateCategory(Category category, Scanner sc, List<Category> categories){
        do{
            System.out.print("Nhập mã danh mục: ");
            int idInput = Integer.parseInt(sc.nextLine());
            if (checkIdUpdateCategory(idInput, category.getCatalogId(), categories)) {
                //Set lại giá trị mới cho id của danh mục
                category.setCatalogId(idInput);
                return true;
            }
            System.err.println("ID đã tồn tại");
        }while (true);
    }
}

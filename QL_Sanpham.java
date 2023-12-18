import java.util.Scanner;
public class QL_Sanpham {
    private DS_Sanpham dssp = new DS_Sanpham(0);
    Scanner scanner = new Scanner(System.in);
    public void menu(){
        dssp.DocFileJava("../src/Sanpham.txt");
        int choice;

        do {
            System.out.println("===== Menu =====");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Xuất danh sách sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Sửa thông tin sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm");
            System.out.println("6. Thống kê sản phẩm");
            System.out.println("7. Thoát");

            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    dssp.them();
                    break;
                case 2:
                    dssp.xuat();
                    break;
                case 3:
                    dssp.xoa();
                    break;
                case 4:
                    dssp.sua();
                    break;
                case 5:
                    dssp.find();
                    break;
                case 6:
                    dssp.thongke();
                    break;
                case 7:
                    System.out.println("Chương trình kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
                    break;
            }
        } while (choice != 7);

    }
}

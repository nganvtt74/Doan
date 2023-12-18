import java.util.Scanner;

public class QL_NV {
    private DS_NV dss;
    Scanner input = new Scanner(System.in);
    public void menu() {
        dss = new DS_NV();
        dss.DocFileJava("../src/NhanVien.txt");

        boolean flag = true;
        while (flag) {
            System.out.println("----------------Menu----------------");
            System.out.println("1: Them Nhan Vien");
            System.out.println("2: Xoa Nhan Vien theo Ma Nhan Vien");
            System.out.println("3: Sua thong tin Nhan Vien");
            System.out.println("4: Tim kiem Nhan Vien");
            System.out.println("5: Xuat danh sach Nhan Vien");
            System.out.println("6: Thong ke danh sach");
            System.out.println("7: Ket thuc chuong trinh.");
            System.out.print("Chon thao tac: ");
            int choice;
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    dss.them();
                    System.out.println("----------------Thong tin Nhan Vien----------------");
                    dss.xuat();
                    break;
                case 2:
                    dss.xoa();
                    System.out.println("----------------Thong tin Nhan Vien----------------");
                    dss.xuat();
                    break;
                case 3:
                    dss.sua();
                    System.out.println("----------------Thong tin Nhan Vien----------------");
                    dss.xuat();
                    break;
                case 4:
                    dss.timKiem();
                    break;
                case 5:
                    System.out.println("----------------Thong tin Nhan Vien----------------");
                    dss.xuat();
                    break;
                case 6:
                    dss.thongKe();
                    break;
                default:
                    System.out.println("--------------Ket thuc chuong trinh!---------------");
                    flag = false;
                    break;
            }
        }
    // dss.them(new O_NhanVien("NV1", "Nguyen Van", "A", "2000/01/01", 20.0, "Nam"));
    // dss.them(new O_NhanVien("NV2", "Nguyen Thi Mai", "Trang", "2001/02/02", 19.5, "Nu"));
    // dss.them(new O_NhanVien("NV3", "Le Van", "Minh", "1996/03/03", 19.0, "Nam"));
    // dss.them(new O_NhanVien("NV4", "Pham Thi", "Kim", "1993/04/04", 18.5, "Nu"));
    // dss.them(new O_NhanVien("NV5", "Tran Van", "Long", "2000/05/05", 18.0, "Nam"));
    // dss.them(new O_NhanVien("NV6", "Nguyen Thi", "Hoa", "1999/06/06", 17.5, "Nu"));
    // dss.them(new O_NhanVien("NV7", "Le Thi", "Lan", "1993/07/07", 17.0, "Nam"));
    // dss.them(new O_NhanVien("NV8", "Pham Van", "Quang", "1993/08/08", 16.5, "Nu"));
    // dss.them(new O_NhanVien("NV9", "Nguyen Van", "An", "1996/09/09", 16.0, "Nam"));
    // dss.them(new O_NhanVien("NV10", "Tran Thi", "Thu", "2000/10/10", 15.5, "Nu"));
    // dss.them(new O_NhanVien("NV11", "Le Van", "Tuan", "2002/11/11", 15.0, "Nam"));
    // dss.them(new O_NhanVien("NV12", "Nguyen Thi", "Linh", "2002/12/12", 14.5, "Nu"));
    // dss.them(new O_NhanVien("NV13", "Pham Van", "Phong", "2003/01/13", 14.0, "Nam"));
    // dss.them(new O_NhanVien("NV14", "Tran Thi", "Ngoc", "2003/02/14", 13.5, "Nu"));
    // dss.them(new O_NhanVien("NV15", "Le Van", "Duong", "2001/03/15", 13.0, "Nam"));
    // dss.them(new O_NhanVien("NV16", "Nguyen Thi", "Anh", "2001/04/16", 12.5, "Nu"));
    // dss.them(new O_NhanVien("NV17", "Pham Van", "Thang", "2001/05/17", 12.0, "Nam"));
    // dss.them(new O_NhanVien("NV18", "Tran Thi", "Huong", "1998/06/18", 11.5, "Nu"));
    // dss.them(new O_NhanVien("NV19", "Le Van", "Thanh", "1992/07/19", 11.0, "Nam"));
    // dss.them(new O_NhanVien("NV20", "Nguyen Thi", "Ha", "1993/08/20", 10.5, "Nu"));   
    // dss.xuat();
    // dss.GhiFileJava("../src/NhanVien.txt"); 
    }
}

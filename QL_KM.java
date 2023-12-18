import java.util.Scanner;
public class QL_KM {
    private DS_KM ds;
    Scanner input = new Scanner(System.in);

    public void menu() {
        ds = new DS_KM();
        
//         ds.DocFileJava("../src/KhuyenMai.txt");
//         ds.xuat();

//         boolean flag = true;
//         while(flag) {
//             System.out.println("----------------Menu----------------");
//             System.out.println("1: Them Khuyen Mai");
//             System.out.println("2: Xoa Khuyen Mai");
//             System.out.println("3: Sua thong tin Khuyen Mai");
//             System.out.println("4: Tim kiem Khuyen Mai");
//             System.out.println("5: Xuat danh sach Khuyen Mai");
//             System.out.println("6: Thong ke danh sach Khuyen Mai");
//             System.out.println("7: Ket thuc chuong trinh.");
//             System.out.print("Chon thao tac: ");
//             int choice;
//             choice = input.nextInt();
//             input.nextLine();
            
//             switch (choice) {
//                 case 1:
//                     ds.them();
//                     System.out.println("----------------Thong tin Khuyen Mai----------------");
//                     ds.xuat();
//                     break;
//                 case 2:
//                     ds.xoa();
//                     System.out.println("----------------Thong tin Khuyen Mai----------------");
//                     ds.xuat();
//                     break;
//                 case 3:
//                     ds.sua();
//                     System.out.println("----------------Thong tin Khuyen Mai----------------");
//                     ds.xuat();
//                     break;
//                 case 4:
//                     ds.timKiem();
//                     break;
//                 case 5:
//                     System.out.println("----------------Thong tin Khuyen Mai----------------");
//                     ds.xuat();
//                     break;
//                 case 6:
//                     ds.thongKe();
//                     break;
//                 default:
//                     System.out.println("--------------Ket thuc chuong trinh!---------------");
//                     flag = false;
//                     break;
//             }
//         }
        ds.them(new O_KhuyenMaiTheoSP("CT01", "KM01", 5, 1));
        ds.them(new O_KhuyenMaiTheoSP("CT02", "KM02", 10, 2));
        ds.them(new O_KhuyenMaiTheoSP("CT03", "KM03", 5, 3));
        ds.them(new O_KhuyenMaiTheoSP("CT04", "KM04", 15, 4));
        ds.them(new O_KhuyenMaiTheoSP("CT05", "KM05", 20, 5));
        ds.them(new O_KhuyenMaiTheoSP("CT01", "KM06", 20, 6));
        ds.them(new O_KhuyenMaiTheoSP("CT02", "KM07", 5, 7));
        ds.them(new O_KhuyenMaiTheoSP("CT03", "KM08", 10, 8));
        ds.them(new O_KhuyenMaiTheoSP("CT04", "KM09", 15, 9));
        ds.them(new O_KhuyenMaiTheoSP("CT05", "KM10", 20, 10));
        ds.them(new O_KhuyenMaiTheoSP("CT01", "KM11", 5, 11));
        ds.them(new O_KhuyenMaiTheoSP("CT01", "KM12", 10, 12));
        ds.them(new O_KhuyenMaiTheoSP("CT02", "KM13", 15, 13));
        ds.them(new O_KhuyenMaiTheoSP("CT03", "KM14", 20, 14));
        ds.them(new O_KhuyenMaiTheoSP("CT04", "KM15", 5, 15));
        ds.them(new O_KhuyenMaiTheoSP("CT05", "KM16", 10, 16));
        ds.them(new O_KhuyenMaiTheoSP("CT01", "KM17", 15, 17));
        ds.them(new O_KhuyenMaiTheoSP("CT02", "KM18", 20, 18));
        ds.them(new O_KhuyenMaiTheoSP("CT03", "KM19", 5, 19));
        ds.them(new O_KhuyenMaiTheoSP("CT04", "KM20", 50, 20));
        ds.them(new O_KhuyenMaiTheoSP("CT05", "KM21", 50, 21));
        ds.them(new O_KhuyenMaiTheoSP("CT01", "KM22", 70, 22));
        ds.them(new O_KhuyenMaiTheoSP("CT02", "KM23", 70, 23));
        ds.them(new O_KhuyenMaiTheoSP("CT03", "KM24", 5, 24));
        ds.them(new O_KhuyenMaiTheoSP("CT04", "KM25", 10, 25));
        ds.them(new O_KhuyenMaiTheoSP("CT05", "KM26", 15, 26));
        ds.them(new O_KhuyenMaiTheoSP("CT01", "KM27", 20, 27));
        ds.them(new O_KhuyenMaiTheoSP("CT02", "KM28", 50, 28));
        ds.them(new O_KhuyenMaiTheoSP("CT03", "KM29", 50, 29));
        ds.them(new O_KhuyenMaiTheoSP("CT04", "KM30", 70, 30));
        ds.them(new O_KhuyenMaiTheoSP("CT05", "KM31", 70, 31));
        ds.them(new O_KhuyenMaiTheoSP("CT01", "KM32", 5, 32));
        ds.them(new O_KhuyenMaiTheoSP("CT02", "KM33", 10, 33));
        ds.them(new O_KhuyenMaiTheoSP("CT03", "KM34", 15, 34));
        ds.them(new O_KhuyenMaiTheoSP("CT04", "KM35", 20, 35));
        ds.them(new O_KhuyenMaiTheoSP("CT05", "KM36", 50, 36));
        ds.them(new O_KhuyenMaiTheoSP("CT01", "KM37", 50, 37));
        ds.them(new O_KhuyenMaiTheoSP("CT02", "KM38", 70, 38));
        ds.them(new O_KhuyenMaiTheoSP("CT03", "KM39", 70, 39));
        ds.them(new O_KhuyenMaiTheoSP("CT04", "KM40", 5, 40));
        ds.them(new O_KhuyenMaiTheoSP("CT05", "KM41", 10, 41));
        ds.them(new O_KhuyenMaiTheoSP("CT01", "KM42", 15, 42));
        ds.them(new O_KhuyenMaiTheoSP("CT02", "KM43", 20, 43));
        ds.them(new O_KhuyenMaiTheoSP("CT03", "KM44", 5, 44));
        ds.them(new O_KhuyenMaiTheoSP("CT04", "KM45", 10, 45));
        ds.them(new O_KhuyenMaiTheoSP("CT05", "KM46", 20, 46));
        ds.them(new O_KhuyenMaiTheoSP("CT01", "KM47", 20, 47));
        ds.them(new O_KhuyenMaiTheoSP("CT02", "KM48", 50, 48));
        ds.them(new O_KhuyenMaiTheoSP("CT03", "KM49", 50, 49));
        ds.them(new O_KhuyenMaiTheoSP("CT04", "KM50", 5, 50));
        ds.them(new O_KhuyenMaiTheoHoaDon("CT01", "KM51", 10, 100));
        ds.them(new O_KhuyenMaiTheoHoaDon("CT02", "KM52", 20, 200));
        ds.them(new O_KhuyenMaiTheoHoaDon("CT03", "KM53", 50, 500));
        ds.them(new O_KhuyenMaiTheoHoaDon("CT04", "KM54", 10, 100));
        ds.them(new O_KhuyenMaiTheoHoaDon("CT05", "KM55", 20, 200));
        ds.them(new O_KhuyenMaiTheoHoaDon("CT01", "KM56", 50, 500));
        ds.them(new O_KhuyenMaiTheoHoaDon("CT02", "KM57", 10, 100));
        ds.them(new O_KhuyenMaiTheoHoaDon("CT03", "KM58", 20, 200));
        ds.them(new O_KhuyenMaiTheoHoaDon("CT04", "KM59", 50, 500));
        ds.them(new O_KhuyenMaiTheoHoaDon("CT05", "KM60", 10, 100));
        ds.them(new O_KhuyenMaiTheoHoaDon("CT01", "KM61", 20, 200));
        ds.them(new O_KhuyenMaiTheoHoaDon("CT02", "KM62", 50, 500));
        ds.them(new O_KhuyenMaiTheoHoaDon("CT03", "KM63", 10, 100));
        ds.them(new O_KhuyenMaiTheoHoaDon("CT04", "KM64", 20, 200));
        ds.them(new O_KhuyenMaiTheoHoaDon("CT05", "KM65", 50, 500));
        ds.them(new O_KhuyenMaiTheoHoaDon("CT01", "KM66", 10, 100));
        ds.them(new O_KhuyenMaiTheoHoaDon("CT02", "KM67", 20, 200));
        ds.them(new O_KhuyenMaiTheoHoaDon("CT03", "KM68", 50, 500));
        ds.them(new O_KhuyenMaiTheoHoaDon("CT04", "KM69", 10, 100));
        ds.them(new O_KhuyenMaiTheoHoaDon("CT05", "KM70", 20, 200));

        ds.GhiFileJava("../src/KhuyenMai.txt");
        ds.xuat();
    }
}

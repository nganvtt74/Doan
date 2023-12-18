import java.util.Scanner;

public class QL_NCC {
    private DS_NCC dss;
    Scanner input = new Scanner(System.in);

    public void menu() {
        dss = new DS_NCC();
        dss.DocFileJava("../src/NhaCungCap.txt");

        boolean flag = true;
        while (flag) {
        System.out.println("--Menu--");
        System.out.println("1: Them Nha Cung Cap");
        System.out.println("2: Xoa Nha Cung Cap theo Ma Nha Cung Cap");
        System.out.println("3: Sua thong tin Nha Cung Cap");
        System.out.println("4: Tim kiem Nha Cung Cap");
        System.out.println("5: Xuat danh sach Nha Cung Cap");
        System.out.println("6: Ket thuc chuong trinh");
        System.out.print("Chon thao tac: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                dss.them();
                System.out.println("----------------Thong tin Nha Cung Cap----------------");
                dss.xuat();
                break;
            case 2:
                dss.xoa();
                System.out.println("----------------Thong tin Nha Cung Cap----------------");
                dss.xuat();
                break;
            case 3:
                dss.sua();
                System.out.println("----------------Thong tin Nha Cung Cap----------------");
                dss.xuat();
                break;
            case 4:
                dss.timKiem();
                break;
            case 5:
                System.out.println("----------------Thong tin Nha Cung Cap----------------");
                dss.xuat();
                break;
            default:
                System.out.println("--------------Ket thuc chuong trinh!---------------");
                flag = false;
                break;
            }
        }

        // dss.them(new O_NhaCungCap("NCC001","Cong Ty TNHH ABC","123 Duong Nguyen Trai Quan 1 TPHCM","0123456789","abc@congty.com"));
        // dss.them(new O_NhaCungCap("NCC002","Cong Ty TNHH DEF","456 Duong Le Loi Quan 1 TPHCM","0234567891","def@congty.com"));
        // dss.them(new O_NhaCungCap("NCC003","Cong Ty TNHH GHI","789 Duong Hai Ba Trung Quan 3 TPHCM","0345678912","ghi@congty.com"));
        // dss.them(new O_NhaCungCap("NCC004","Cong Ty TNHH JKL","321 Duong Cach Mang Thang Tam Quan 3 TPHCM","0456789123","jkl@congty.com"));
        // dss.them(new O_NhaCungCap("NCC005","Cong Ty TNHH MNO","654 Duong Vo Van Tan Quan 3 TPHCM","0567891234","mno@congty.com"));
        // dss.them(new O_NhaCungCap("NCC006","Cong Ty TNHH PQR","987 Duong Dien Bien Phu Quan 10 TPHCM","0678912345","pqr@congty.com"));
        // dss.them(new O_NhaCungCap("NCC007","Cong Ty TNHH STU","135 Duong 3 Thang 2 Quan 10 TPHCM","0789123456","stu@congty.com"));
        // dss.them(new O_NhaCungCap("NCC008","Cong Ty TNHH VWX","246 Duong Ly Thuong Kiet Quan 10 TPHCM","0891234567","vwx@congty.com"));
        // dss.them(new O_NhaCungCap("NCC009","Cong Ty TNHH YZ","357 Duong Le Hong Phong Quan 5 TPHCM","0912345678","yz@congty.com"));
        // dss.them(new O_NhaCungCap("NCC010","Cong Ty TNHH AAA","468 Duong Tran Hung Dao Quan 5 TPHCM","0123456789","aaa@congty.com"));
        // dss.them(new O_NhaCungCap("NCC011","Cong Ty TNHH BBB","579 Duong Nguyen Van Cu Quan 5 TPHCM","0234567891","bbb@congty.com"));
        // dss.them(new O_NhaCungCap("NCC012","Cong Ty TNHH CCC","681 Duong Tran Nhat Duat Quan 4 TPHCM","0345678912","ccc@congty.com"));
        // dss.them(new O_NhaCungCap("NCC013","Cong Ty TNHH DDD","792 Duong Khanh Hoi Quan 4 TPHCM","0456789123","ddd@congty.com"));
        // dss.them(new O_NhaCungCap("NCC014","Cong Ty TNHH EEE","813 Duong Ton Dan Quan 4 TPHCM","0567891234","eee@congty.com"));
        // dss.them(new O_NhaCungCap("NCC015","Cong Ty TNHH FFF","924 Duong Nguyen Tat Thanh Quan 4 TPHCM","0678912345","fff@congty.com"));
        // dss.them(new O_NhaCungCap("NCC016","Cong Ty TNHH GGG","135 Duong Hoang Dieu Quan 4 TPHCM","0789123456","ggg@congty.com"));
        // dss.them(new O_NhaCungCap("NCC017","Cong Ty TNHH HHH","246 Duong Doan Van Bo Quan 4 TPHCM","0891234567","hhh@congty.com"));
        // dss.them(new O_NhaCungCap("NCC018","Cong Ty TNHH III","357 Duong Ben Van Don Quan 4 TPHCM","0912345678","iii@congty.com"));
        // dss.them(new O_NhaCungCap("NCC019","Cong Ty TNHH JJJ","468 Duong Nguyen Huu Tho Quan 7 TPHCM","0123456789","jjj@congty.com"));
        // dss.them(new O_NhaCungCap("NCC020","Cong Ty TNHH KKK","579 Duong Le Van Luong Quan 7 TPHCM","0234567891","kkk@congty.com"));
        // dss.xuat();
        // dss.GhiFileJava("../src/NhaCungCap.txt"); 

    }
}

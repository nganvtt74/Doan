import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class O_ChuongTrinhKhuyenMai implements Object{
    private String MaCT;
    private String TenCT;
    private String NgayBatDau;
    private String NgayKetThuc;
    Scanner input = new Scanner(System.in);

    public O_ChuongTrinhKhuyenMai() {}

    public O_ChuongTrinhKhuyenMai(String MaCT, String TenCT, String NgayBatDau, String NgayKetThuc) {
        this.MaCT = MaCT;
        this.TenCT = TenCT;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
    }

    public O_ChuongTrinhKhuyenMai(O_ChuongTrinhKhuyenMai thongTin) {
        MaCT = thongTin.MaCT;
        TenCT = thongTin.TenCT;
        NgayBatDau = thongTin.NgayBatDau;
        NgayKetThuc = thongTin.NgayKetThuc;
    }

    public String getMaCT() {
        return MaCT;
    }

    public String getTenCT() {
        return TenCT;
    }

    public String getNgayBatDau() {
        return NgayBatDau;
    }

    public String getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setMaCT(String MaCT) {
        this.MaCT = MaCT;
    }

    public void setTenCT(String TenCT) {
        this.TenCT = TenCT;
    }

    public void setNgayBatDau(String NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public void setNgayKetThuc(String NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
    }

    public void nhap() {
        System.out.print("Nhap ma chuong trinh:");
        MaCT = input.nextLine();
        System.out.print("Nhap ten chuong trinh:");
        TenCT = input.nextLine();
        System.out.print("Nhap ngay bat dau:");
        NgayBatDau = input.nextLine();
        while (checkDay(NgayBatDau) != true) {
            System.out.print("Vui long nhap lai Ngay Bat Dau:");
            NgayBatDau = input.nextLine();
        }
        System.out.print("Nhap ngay ket thuc:");
        NgayKetThuc = input.nextLine();
        while (checkDay(NgayKetThuc) != true) {
            System.out.print("Vui long nhap lai Ngay Ket Thuc:");
            NgayKetThuc = input.nextLine();
        }
    }

    public void xuat() {
        System.out.println("================================================");
        System.out.format("MaCT:%-8s TenCT:%-20s NgayBatDau:%-20s NgayKetThuc:%-20s\n",MaCT, TenCT, NgayBatDau, NgayKetThuc);
    }
    public void xuatkm() {
        DS_KM km = new DS_KM();
        km.DocFileJava("../KhuyenMai.txt");
        km.xuat(MaCT);
    }

    
    public void GhiFile(String filename)throws IOException{
        try(DataOutputStream dos= new DataOutputStream(new FileOutputStream(filename,true))){
            dos.writeUTF(MaCT);
            dos.writeUTF(TenCT);
            dos.writeUTF(NgayBatDau);
            dos.writeUTF(NgayKetThuc);
        }
    }

    public int[] Date(String ngay) {
        String[] date = ngay.split("/");
        int[] dateInt = new int[date.length];
        for (int i = 0; i < date.length; i++) {
            dateInt[i] = Integer.parseInt(date[i]);
        }
        return dateInt;
    }
    public boolean checkDay(String ngay) {
        int[] date = Date(ngay);
        int year = date[0];
        int month = date[1];
        int day = date[2];
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day < 1 || day > 30) {
                return false;
            }
        }
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day < 1 || day > 31) {
                return false;
            }
        }
        if (month == 2) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                if (day < 1 || day > 29) {
                    return false;
                }
            } else {
                if (day < 1 || day > 28) {
                    return false;
                }
            }
        }
        return true;
    }
    
}

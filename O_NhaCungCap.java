import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class O_NhaCungCap {
    private String MaNCC;
    private String TenNCC;
    private String DiaChi;
    private String Sdt;
    private String Email;
    Scanner input = new Scanner(System.in);

    public O_NhaCungCap() {}
    public O_NhaCungCap(String MaNCC, String TenNCC, String DiaChi, String Sdt, String Email) {
        this.MaNCC = MaNCC;
        this.TenNCC = TenNCC;
        this.DiaChi = DiaChi;
        this.Sdt = Sdt;
        this.Email = Email;
    }
    public O_NhaCungCap(O_NhaCungCap thongTin) {
        MaNCC = thongTin.MaNCC;
        TenNCC = thongTin.TenNCC;
        DiaChi = thongTin.DiaChi;
        Sdt = thongTin.Sdt;
        Email = thongTin.Email;
    }

    public String getMaNCC() {
        return MaNCC;
    }
    public String getTenNCC() {
        return TenNCC;
    }
    public String getDiaChi() {
        return DiaChi;
    }
    public String getSdt() {
        return Sdt;
    }
    public String getEmail() {
        return Email;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    } 
    public void setTenNCC(String TenNCC) {
        this.TenNCC = TenNCC;
    }
    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void nhap() {
        System.out.print("Nhap ma nha cung cap:");
        MaNCC = input.nextLine();
        System.out.print("Nhap ten nha cung cap:");
        TenNCC = input.nextLine();
        System.out.print("Nhap dia chi:");
        DiaChi = input.nextLine();
        System.out.print("Nhap so dien thoai:");
        Sdt = input.nextLine();
        System.out.print("Nhap Email:");
        Email = input.nextLine();
    }

    public void xuat() {        
        System.out.format("%-8s %-20s %-45s %-15s %-20s%n",MaNCC, TenNCC, DiaChi, Sdt, Email);
    }
    public void GhiFile(String filename) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename, true))) {
            dos.writeUTF(MaNCC);
            dos.writeUTF(TenNCC);
            dos.writeUTF(DiaChi);
            dos.writeUTF(Sdt);
            dos.writeUTF(Email);
        }
    }
}
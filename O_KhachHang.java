import java.util.Scanner;

public class KhachHang implements Object{
    private String maKhachHang;
    private String Hodem;
    private String Ten;
    private int SoDienThoai;
    private String DiaChi;

    public KhachHang() {
    }

    public KhachHang(String maKhachHang, String Hodem, String Ten, int SoDienThoai, String DiaChi) {
        this.maKhachHang = maKhachHang;
        this.Hodem = Hodem;
        this.Ten = Ten;
        this.SoDienThoai = SoDienThoai;
        this.DiaChi = DiaChi;
    }

    public String getmaKhackHang() {
        return maKhachHang;
    }

    public String getHodem() {
        return Hodem;
    }

    public String getTen() {
        return Ten;
    }

    public int getSoDienThoai() {
        return SoDienThoai;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setmaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public void setHodem(String Hodem) {
        this.Hodem = Hodem;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public void setSoDienThoai(int SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma khach hang: ");
        maKhachHang = sc.nextLine();
        System.out.print("Nhap ho dem: ");
        Hodem = sc.nextLine();
        System.out.print("Nhap ten: ");
        Ten = sc.nextLine();
        System.out.print("Nhap so dien thoai: ");
        SoDienThoai = sc.nextInt();
        System.out.print("Nhap dia chi: ");
        DiaChi = sc.nextLine();
        sc.close();
    }

    public void xuat() {
        System.out.println("---------------THONG TIN KHACH HANG--------------- ");
        System.out.println("Ma khach hang: " + maKhachHang);
        System.out.println("Ho va ten: " + Hodem + " " + Ten);
        System.out.println("SDT: " + SoDienThoai);
        System.out.println("Dia chi: " + DiaChi);
        System.out.println();
    }
    
}

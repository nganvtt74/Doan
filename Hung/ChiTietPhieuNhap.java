import java.util.Scanner;

public class ChiTietPhieuNhap {
	private String MaPN;
	private String MaSP;
	private int SoLuong;
	private int DonGia;
	public ChiTietPhieuNhap() {}
	public ChiTietPhieuNhap(PhieuNhap MaPN,String MaSP, int SoLuong, int DonGia) {
		this.MaPN = MaPN;
		this.MaSP = MaSP;
		this.SoLuong = SoLuong;
		this.DonGia = DonGia;
	}
	public void setMaPN(String MaPN) {
		this.MaPN = MaPN;
	}
	public void setMaSP(String MaSP) {
		this.MaSP = MaSP;
	}
	public void setSoLuong(int SoLuong) {
		this.SoLuong = SoLuong;
	}
	public void setDonGia(int DonGia) {
		this.DonGia = DonGia;
	}
	public String getMaPN() {
		return MaPN;
	}
	public String getMaSP() {
		return MaSP;
	}
	public int getSoLuong() {
		return SoLuong;
	}
	public int getDonGia() {
		return DonGia;
	}
	public void ChiTietPhieuNhap(ChiTietPhieuNhap ctpn) {
		MaPN = ctpn.MaPN;
		MaSP = ctpn.MaSP;
		SoLuong = ctpn.SoLuong;
		DonGia = ctpn.DonGia;
	}
	public void nhap(int id) {
		Scanner scanner = new Scanner(System.in);
		MaPN = id;
		System.out.println("Nhập chi tiết phiếu nhập có mã: "+MaPN);
		System.out.println("Nhập mã sản phẩm:");
		MaSP = scanner.nextLine();
		System.out.println("Nhập số lượng: ");
		SoLuong = scanner.nextInt();
		System.out.println("Nhập đơn giá: ");
		DonGia = scanner.nextInt();
	}
	public void xuat() {
		System.out.println("Mã phiếu nhập: " +MaPN);
		System.out.println("Mã sản phẩm: "+MaSP);
		System.out.println("Số lượng: "+SoLuong);
		System.out.println("Đơn giá: "+DonGia);
		System.out.println("Thành tiền: "+DonGia * SoLuong);
	}
}  

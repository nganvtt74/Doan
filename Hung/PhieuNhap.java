import java.util.Scanner;

public class PhieuNhap {
	// private int n;
	private String MaPN;
	private String MaNV;
	private String MaNCC;
	private String NgayLap;
	public PhieuNhap() {}
	public PhieuNhap(String MaPN, String MaNV, String MaNCC, String NgayLap) {
		this.MaPN = MaPN;
		this.MaNV = MaNV;
		this.MaNCC = MaNCC;
		this.NgayLap = NgayLap;
	}
	public void PhieuNhap(PhieuNhap PN) {
		MaPN = PN.MaPN;
		MaNV = PN.MaNV;
		MaNCC = PN.MaNCC;
		NgayLap = PN.NgayLap;
	}
	public void setMaPN(String MaPN) {
		this.MaPN = MaPN;
	}
	public void setMaNV(String MaNV) {
		this.MaNV = MaNV;
	}
	public void setMaNCC(String MaNCC) {
		this.MaNCC = MaNCC;
	}
	public void setNgayLap(String NgayLap) {
		this.NgayLap = NgayLap;
	}
	public String getMaPN() {
		return MaPN;
	}
	public String getMaNV() {
		return MaNV;
	}
	public String getMaNCC() {
		return MaNCC;
	}
	public String getNgayLap() {
		return NgayLap;
	}
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Số lượng hàng nhập trong phiếu: ");
		int n = scanner.nextInt();
        CTPN = new ChiTietPhieuNhap[n];
		System.out.println("Nhập mã phiếu nhập: ");
		MaPN = scanner.nextLine();
        // for (int i=0; i<=n; i++) {
        //     CTPN[i] = new ChiTietPhieuNhap();
        //     CTPN[i].nhap();
		// 	CTPN[i].setMaPN(MaPN)
        // }
        System.out.println("Nhập mã nhân viên: ");
		MaNV = scanner.nextLine();
		System.out.println("Nhập mã nhà cung cấp: ");
		MaNCC = scanner.nextLine();
		System.out.println("Ngày lập phiếu nhập: ");
		NgayLap = scanner.nextLine();
	}
    public void xuat() {
		System.out.println("Mã phiếu nhập: "+MaPN);
		System.out.println("Mã nhân viên: "+MaNV);
		System.out.println("Mã nhà cung cấp: "+MaNCC);
		System.out.println("Ngày lập phiếu nhập: "+NgayLap);
		System.out.println("Thông tin chi tiết của phiếu nhập có mã: "+MaPN);
		// for (int i = 0; i<n; i++) {
		// 	if (CTPN[i].getMaPN().equals(MaPN)) {
		// 		CTPN[i].xuat();
		// 	}
		// }
    }
}

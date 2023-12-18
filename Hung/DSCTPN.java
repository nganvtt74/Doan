import java.util.Scanner;

public class DSCTPN {
    private n;
    private ChiTietPhieuNhap[] CTPN;
    public DSCTPN() {}
	public DSCTPN(int n) {
		this.n = n;
		this.CTPN = new ChiTietPhieuNhap[n];
	}
    public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số chi tiết phiếu nhập: ")
        n = scanner.nextInt();
        CTPN = new ChiTietPhieuNhap[n];
        for (int i=0; i<=n; i++) {
            CTPN[i] = new ChiTietPhieuNhap();
            CTPN[i].nhap();
        }
    }
    public void xuat() {
        for(int i=0;i<n;i++){
			System.out.println("Danh sách chi tiết phiếu nhập");
			CTPN[i].xuat();
		}
	}
    public void them() {
        Scanner scanner = new scanner(System.in);
		System.out.println("Nhập chi tiết phiếu nhập cần thêm");
		ChiTietPhieuNhap newCTPN = new ChiTietPhieuNhap();
        newCTPN.nhap();
        boolean ktrMaPN=false;
		for(int i=0;i<n;i++){
			if (CTPN[i].getMaPN().equals(newCTPN.getMaPN)) {
				ktrMaPN=true;
				System.out.println("Mã chi tiết phiếu nhập đã tồn tại");
				break;
			}
		}
		if (!ktrMaPN) {
			CTPN[n] = newCTPN;
			n++;
			System.out.println("Đã thêm chi tiết phiếu nhập thành công");
		}
    }
    public void xoa() {
        String x;
		boolean daTimThay = false;
		System.out.print("Nhập Mã chi tiết phiếu nhập cần xóa: ");
		Scanner scanner = new Scanner(System.in);
		x=scanner.nextLine();
		for (int i=0;i<n ;i++ ) {
			if (sv[i].getMaPN().equals(x)) {
				for(int j=i;j<n-1;j++){
					CTPN[j]=CTPN[j+1];
				}
			n--;
			daTimThay = true;
			System.out.println("Chi tiết phiếu nhập đã được xóa ");
			break;
			}
		}
		if (!daTimThay) {
			System.out.println("Không tìm thấy mã chi tiết phiếu nhập: "+x);
		}
    }  
    public void timkiem(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("=============================================");
		System.out.println("Chọn cách tìm kiếm:  ");
				System.out.println("1.Tìm theo Mã chi tiết phiếu nhập");
				System.out.println("2.Tìm theo Mã sản phẩm");   
                System.out.print("Vui lòng chọn: ");
                int s=scanner.nextInt();
                switch (s) {
                    case 1:
                        System.out.println("=============================================");
                        System.out.print("Nhập Mã chi tiết phiếu nhập cần tìm: ");
						Scanner.nextLine();
                        int tempMaPN=scanner.nextLine();
                        tempMaPN=tempMaPN.trim();
                        tempMaPN=tempMaPN.replaceAll("\\s+"," ");
                        boolean daTimThayMaPN = false;
                        for (int i=0;i<n ;i++ ) {
                            if (CTPN[i].getMssv().equals(tempMaPN)) {
                                System.out.println("Đã tìm thấy chi tiết phiếu nhập:");
                                daTimThayMaPN=true;
                                CTPN[i].xuat();
                                break;
                            }
                        }
                        if (!daTimThayMaPN) {
                            System.out.println("Không tìm thấy chi tiết phiếu nhập có mã: "+tempMaPN);
                        }
                        break;
                    case 2:
                        System.out.println("=============================================");
                        System.out.print("Nhập mã sản phẩm: ");
                        String tempMaSP=scanner.nextLine();
                        tempMaSP=tempMaSP.trim();
                        tempMaSP=tempMaSP.replaceAll("\\s+"," ");
                        boolean datimthayten =false;
                        for (int i=0;i<n ;i++ ) {
                            if (CTPN[i].getMaSP().toLowerCase().equals(tempMaSP.toLowerCase())) {
                                System.out.println("Đã tìm thấy mã sản phẩm ");
                                datimthayten=true;
                                CTPN[i].xuat();
                            }
                        }
                        if (!datimthayten) {
                            System.out.println("Không tìm thấy mã sản phẩm: "+tempMaSP);
                        }
                        break;
                        default:
                            System.out.println("Thoát chương trình: ");
                            break;
                }
        }
    public void sua() {
        int s;
        String x;
		System.out.println("=============================================");
		System.out.println("Chọn Mã chi tiết phiếu nhập cần sửa: ");
		Scanner scanner = new Scanner(System.in);
		x=scanner.nextLine();
		for (int i=0;i<n ;i++ ) {
			if (CTPN[i].getMssv().equals(x)) {
				System.out.println("Chọn thông tin cần thay đổi: ");
				System.out.println("1.Mã chi tiết phiếu nhập");
				System.out.println("2.Mã sản phẩm");
				System.out.println("3.Số lượng");
				System.out.println("4.Giá");
				s=Scanner.nextInt();
				switch (s) {
					case 1:
						System.out.print("Nhập mã chi tiết phiếu nhập mới: ");
						Scanner.nextLine();
						String CTPN2=scanner.nextLine();
						CTPN2=CTPN2.trim();
						CTPN2=CTPN2.replaceAll("\\s+"," ");
						CTPN[i].setMaPN(CTPN2);
					break;
					case 2:
						System.out.println("Nhập mã sản phẩm mới: ");
						Scanner.nextLine();
						String SP2=scanner.nextLine();
						SP2=SP2.trim();
						SP2=SP2.replaceAll("\\s+"," ");
						CTPN[i].setMaSP(SP2);
						break;
					case 3:
						System.out.print("Nhập số lượng: ");
						int sl2=scanner.nextInt();
						CTPN[i].setSoLuong(sl2);
						break;
					case 4:
						System.out.println("Nhập đơn giá: ");
						int dongia2=scanner.nextInt();
						CTPN[i].setDonGia(dongia2);
						break;
                
                }
			}
            else {
                System.out.println("Mã chi tiết phiếu nhập này không tồn tại");
            }
        }    
    }
	public void thongke() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập khoảng đơn giá muốn thống kê");
		System.out.println("Nhập giá trị bắt đầu thống kê");
		int s = scanner.nextInt();
		System.out.println("Nhập giá trị kết thúc thông kê");
		int e = scanner.nextInt;
		if (s>e) {
			int temp;
			temp = s;
			s= e;
			e = temp;
		}
		int count = 0;
		for (int i = 0;i<n;i++) {
			if (getDonGia()>s && getDonGia()<e) {
				count++;
				System.out.println("Đã tìm thấy "+count+ "sản phẩm có đơn giá phù hợp")
				System.out.println("Danh sách các sản phẩm có đơn giá phù hợp")
				CTPN[i].xuat();
			}

		}
	}
	public int getLength() {
        return n;
    }
    public CTPN[] getMang() {
        return l;
    }
}   
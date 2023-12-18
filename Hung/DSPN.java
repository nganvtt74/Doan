import java.util.Arrays;
import java.util.Scanner;

public class DSPN {
    private int n;
    private PhieuNhap[] PN;
    public DSPN() {

	}
    public DSPN(int n) {
        this.n = n;
        this.PN = new PhieuNhap[n];
    }
    public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số phiếu nhập: ");
        n = scanner.nextInt();
        PN = new PhieuNhap[n];
        for (int i=0; i<=n; i++) {
            PN[i] = new PhieuNhap();
            PN[i].nhap();
        }
    }
    public void xuat() {
        for(int i=0;i<n;i++){
			System.out.println("Danh sách phiếu nhập");
			PN[i].xuat();
		}
    }
    public void them() {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập phiếu nhập cần thêm");
		PhieuNhap newPN = new PhieuNhap();
        newPN.nhap();
        boolean ktrMaPN=false;
			if (PN[i].getMaPN().equals(newPN.getMaPN)) {
				ktrMaPN=true;
				System.out.println("Mã phiếu nhập đã tồn tại");
				break;
			}
			PN=Arrays.copyOf(PN, PN.length+1);
			PN[n]=newPN;
			n++;
		
	}

		public void them(PhieuNhap PN) {	
				PN=Arrays.copyOf(PN, PN.length+1);		
				this.PN[n] = PN;
				n++;
		if (!ktrMaPN) {
			PN[n] = newPN;
			n++;
			System.out.println("Đã thêm phiếu nhập thành công");
		}
	}
    
    public void xoa() {
        String x;
		boolean daTimThay = false;
		System.out.print("Nhập mã phiếu nhập cần xóa: ");
		Scanner scanner = new Scanner(System.in);
		x=scanner.nextLine();
		for (int i=0;i<n ;i++ ) {
			if (PN[i].getMaPN().equals(x)) {
				for(int j=i;j<n-1;j++){
					PN[j]=PN[j+1];
				}
			n--;
			daTimThay = true;
			System.out.println("Phiếu nhập đã được xóa ");
			break;
			}
		}
		if (!daTimThay) {
			System.out.println("Không tìm thấy mã phiếu nhập: "+x);
		}
    }
	public void timkiem(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("=============================================");
		System.out.println("Chọn cách tìm kiếm:  ");
				System.out.println("1.Tìm theo Mã chi tiết phiếu nhập");
				System.out.println("2.Tìm theo Mã nhân viên");
				System.out.println("3.Tìm theo Mã nhà cung cấp"); 
                System.out.print("Vui lòng chọn: ");
                int s=scanner.nextInt();
                switch (s) {
                    case 1:
						int tempMaPN;
                        System.out.println("=============================================");
                        System.out.print("Nhập Mã chi tiết phiếu nhập cần tìm: ");
						scanner.nextLine();
                        tempMaPN=scanner.nextLine();
                        tempMaPN=tempMaPN.trim();
                        tempMaPN=tempMaPN.replaceAll("\\s+"," ");
                        boolean daTimThayMaPN = false;
                        for (int i=0;i<n ;i++ ) {
                            if (PN[i].getMaPN().equals(tempMaPN)) {
                                System.out.println("Đã tìm thấy chi tiết phiếu nhập:");
                                daTimThayMaPN=true;
                                PN[i].xuat();
                                break;
                            }
                        }
                        if (!daTimThayMaPN) {
                            System.out.println("Không tìm thấy chi tiết phiếu nhập có mã: "+tempMaPN);
                        }
                        break;
                    case 2:
                        System.out.println("=============================================");
                        System.out.print("Nhập mã nhân viên: ");
                        String tempMaSP=scanner.nextLine();
                        tempMaSP=tempMaSP.trim();
                        tempMaSP=tempMaSP.replaceAll("\\s+"," ");
                        boolean datimthayten =false;
                        for (int i=0;i<n ;i++ ) {
                            if (PN[i].getMaNV().toLowerCase().equals(tempMaNV.toLowerCase())) {
                                System.out.println("Đã tìm thấy mã nhân viên ");
                                datimthayten=true;
                                CTPN[i].xuat();
                            }
                        }
                        if (!datimthayten) {
                            System.out.println("Không tìm thấy mã sản phẩm: "+tempMaSP);
                        }
                        break;
						case 3:
                        System.out.println("=============================================");
                        System.out.print("Nhập mã nhà cung cấp: ");
                        String tempMaNCC=scanner.nextLine();
                        tempMaSP=tempMaNCC.trim();
                        tempMaSP=tempMaNCC.replaceAll("\\s+"," ");
                        boolean datimthayten =false;
                        for (int i=0;i<n ;i++ ) {
                            if (PN[i].getMaNCC().toLowerCase().equals(tempMaNCC.toLowerCase())) {
                                System.out.println("Đã tìm thấy mã nhân viên ");
                                datimthayten=true;
                                PN[i].xuat();
                            }
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
			System.out.println("Chọn Mã phiếu nhập cần sửa: ");
			Scanner scanner = new Scanner(System.in);
			x=scanner.nextLine();
			for (int i=0;i<n ;i++ ) {
				if (PN[i].getMssv().equals(x)) {
					System.out.println("Chọn thông tin cần thay đổi: ");
					System.out.println("1.Mã phiếu nhập");
					System.out.println("2.Mã nhân viên");
					System.out.println("3.Mã nhà cung cấp");
					System.out.println("4.Ngày lập");
					s=Scanner.nextInt();
					switch (s) {
						case 1:
							System.out.print("Nhập mã phiếu nhập mới: ");
							Scanner.nextLine();
							String PN2=scanner.nextLine();
							PN2=PN2.trim();
							PN2=PN2.replaceAll("\\s+"," ");
							CTPN[i].setMaPN(CTPN2);
						break;
						case 2:
							System.out.println("Nhập mã nhân viên mới: ");
							Scanner.nextLine();
							String SP2=scanner.nextLine();
							MaNV2=MaNV2.trim();
							MaNV2=MaNV2.replaceAll("\\s+"," ");
							PN[i].setMaNV(MaNV2);
							break;
						case 3:
							System.out.print("Nhập mã nhà cung cấp mới: ");
							String MaNCC2=scanner.nextLine();
							MaNCC2=MaNCC2.trim();
							MaNCC2=MaNCC2.replaceAll("\\s+"," ");
							PN[i].setMaNCC(MaNCC2);
							break;
						case 4:
							System.out.println("Nhập ngày lập mới: ");
							String NgayLap2=scanner.nextInt();
							PN[i].setNgayLap(NgayLap2);
							break;
					
					}
				}
				else {
					System.out.println("Mã phiếu nhập này không tồn tại");
				}
			}    
		}
}
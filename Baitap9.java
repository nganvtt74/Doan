// taoj lop sinh vien toi thieu 5 thuoc tinh mssv , ho , ten , ngaysinh
// tao lop danh sach sinh vien : mang sinh vien va n 
// them (1 hoac n sv ), sua , xoa , tim kim 
// thong ke sinh vien theo gioi tinh , do tuoi 
import java.util.Scanner;

public class Baitap9_c2{
	public static void main(String[] args) {
		DSSV ds = new DSSV();
		ds.nhapds();
		ds.themsv(new Sinhvien(101, "Le Thi Thuy", "Duy", 1221, "nu", 9, 9, 2003));
        ds.themsv(new Sinhvien(102, "Vo Thuy", "Duong", 1222, "nu", 2, 2, 2003));
        ds.themsv(new Sinhvien(103, "Nguyen Van", "Tung", 1223, "nu", 3, 3, 2004));
        ds.themsv(new Sinhvien(104, "Vu Thi Thanh", "Ngan", 1221, "nu", 7, 4, 2004));
        ds.themsv(new Sinhvien(105, "Tran Uyen", "Nhi", 1221, "nu", 27, 6, 2003));
        ds.themsv(new Sinhvien(106, "Dao Ngoc", "Linh", 1223, "nu", 6, 6, 2005));
        ds.themsv(new Sinhvien(107, "Nguyen Vinh", "Huy", 1223, "nam", 7, 7, 2004));
        ds.themsv(new Sinhvien(108, "Nguyen Quoc", "Anh", 1224, "nam", 8, 8, 2004));
        ds.themsv(new Sinhvien(109, "Le Ta Tan", "Luc", 1221, "nam", 19, 9, 2001));
        ds.themsv(new Sinhvien(110, "Vu Van", "Nhi", 1222, "nu", 10, 10, 2004));
		ds.themsv1();
		ds.xoasvtheomssv();
		ds.xuatds();
		ds.suathongtin();
		ds.xuatds();
		ds.timkim();
		ds.sapxep();
		ds.xuatds();
		}
}
class Sinhvien{
	private int mssv;
	private String hodem;
	private String ten;
	private int lop;
	private String gioitinh;
	private int ngaysinh;
	private int thangsinh;
	private int namsinh;
	public Sinhvien(){

	}
	public Sinhvien(int mssv,String hodem,String ten,int lop,String gioitinh,int ngaysinh ,int thangsinh,int namsinh){
		this.mssv=mssv;
		this.hodem=hodem;
		this.ten=ten;
		this.lop=lop;
		this.gioitinh=gioitinh;
		this.ngaysinh=ngaysinh;
		this.thangsinh=thangsinh;
		this.namsinh=namsinh;
	}
	public Sinhvien(Sinhvien sv){
		mssv=sv.mssv;
		hodem=sv.hodem;
		ten=sv.ten;
		lop=sv.lop;
		gioitinh=sv.gioitinh;
		ngaysinh = sv.ngaysinh;
		thangsinh=sv.thangsinh;
		namsinh=sv.namsinh;
	}
	public void nhap(){
		Scanner Scanner = new Scanner(System.in);
		boolean mssvDaTonTai = false;
    	System.out.print("Nhap MSSV");
    	mssv=Scanner.nextInt();
		Scanner.nextLine();
		System.out.print("Nhap hodem: ");
		hodem=Scanner.nextLine();
		System.out.print("Nhapten: ");
		ten=Scanner.nextLine();
		System.out.print("Nhap lop: ");
		lop=Scanner.nextInt();
		Scanner.nextLine();
		boolean kiemtranamnu = false;
		do{
		System.out.print("Nhap gioi tinh(nam/nu): ");
		gioitinh=Scanner.nextLine();
		gioitinh=gioitinh.trim();
        gioitinh=gioitinh.toLowerCase();
        gioitinh=gioitinh.replace(" ","");
        if (gioitinh.equals("nam") || gioitinh.equals("nu")) {
        	kiemtranamnu=true;
        	break;
        }
        else{
        	System.out.println("Gioi tinh khong hop le ");
        }
	}while (!gioitinh.equals("nam") && !gioitinh.equals("nu"));
		do {
            System.out.print("Nhap nam sinh (>= 1900): ");
            namsinh = Scanner.nextInt();
        } while (namsinh < 1900);
		do {
            System.out.print("Nhap thang sinh (1-12): ");
            thangsinh = Scanner.nextInt();
        } while (thangsinh < 1 || thangsinh > 12);
		do {
            System.out.print("Nhap ngay sinh (1-31): ");
            ngaysinh = Scanner.nextInt();
        } while (ngaysinh < 1 || ngaysinh > 31 || (thangsinh == 9 && ngaysinh > 30) || (thangsinh == 2 && !laNamNhuan(namsinh) && ngaysinh > 28) || (thangsinh == 2 && laNamNhuan(namsinh) && ngaysinh > 29));

        hodem=hodem.trim();
        hodem=hodem.replaceAll("\\s+"," ");
        ten=ten.trim();
        

	}
	private boolean laNamNhuan(int nam) {
        return (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
    }
    public void xuat(){
    	System.out.println("=============================================");
    	System.out.println("MSSV: "+mssv);
    	System.out.println("Ho va ten: "+hodem+" "+ten);
    	System.out.println("Lop: "+lop);
    	System.out.println("Gioitinh: "+gioitinh);
    	System.out.println("Ngay Sinh: "+ngaysinh+"/"+thangsinh+"/"+namsinh);
    }
    public void SetMssv(int mssv){
    	this.mssv=mssv;
    }
    public void SetHodem(String hodem){
    	this.hodem=hodem;
    }
    public void SetTen(String ten){
    	this.ten=ten;
    }
    public void SetLop(int lop){
    	this.lop=lop;
    }
    public void SetGioitinh(String gioitinh){
    	this.gioitinh=gioitinh;
    }
    public void SetNgaysinh(int ngaysinh){
    	this.ngaysinh=ngaysinh;
    }
    public void SetThangsinh(int thangsinh){
    	this.thangsinh=thangsinh;
    }
    public void SetNamsinh(int namsinh){
    	this.namsinh=namsinh;
    }

    public int getMssv(){
    	return mssv;
    }
    public String getHodem(){
    	return hodem;
    }
    public String getTen(){
    	return ten;
    }
    public int getLop(){
    	return lop;
    }
    public String getGioitinh(){
    	return gioitinh;
    }
    public int getNgaysinh(){
    	return ngaysinh;
    }
    public int getThangsinh(){
    	return thangsinh;
    }
    public int getNamsinh(){
    	return namsinh;
    }
}
class DSSV{
	private int n;
	private Sinhvien[] sv;
	private int max=42;
	public DSSV(){

	}

	public void nhapds(){
		Scanner Scanner= new Scanner(System.in);
		System.out.print("Nhap so luong sv: ");
		n=Scanner.nextInt();
		sv = new Sinhvien[max];
		for (int i=0;i<n ;i++ ) {
			sv[i]=new Sinhvien();
			sv[i].nhap();
		}
	}
	public void xuatds(){
		for(int i=0;i<n;i++){
			System.out.println("Danh sach sinh vien");
			sv[i].xuat();
		}
	}
	public void themsv(Sinhvien sv){
		if (n < max) {
        this.sv[n] = sv;
        n++;
    } else {
        System.out.println("Danh sách đã đầy.");
    }
	}
	public void themsv1(){
		if(n<max){
		Scanner Scanner = new Scanner(System.in);
		System.out.println("=============================================");
		System.out.println("Nhap thong tin sinh tien can them: ");
		sv[n]=new Sinhvien();
		sv[n].nhap();
		n++;
	}
		else{
			System.out.println("Danh sach da day: ");
		}
	}
	public void xoasvtheomssv(){
		int x;
		boolean daTimThay = false;
		System.out.println("=============================================");
		System.out.print("nhap mssv can xoa: ");
		Scanner Scanner = new Scanner(System.in);
		x=Scanner.nextInt();
		for (int i=0;i<n ;i++ ) {
			if (sv[i].getMssv()==x) {
				for(int j=i;j<n-1;j++){
					sv[j]=sv[j+1];
				}
			n--;
			daTimThay = true;
			System.out.println("Sinh vien da duoc xoa ");
			break;
			}
		}
		if (!daTimThay) {
			System.out.println("Khong tim thay sinh vien voi mssv: "+x);
		}
	}
	private boolean laNamNhuan(int nam) {
        return (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
    }
	public void suathongtin(){
		int x,s;
		System.out.println("=============================================");
		System.out.println("Chon mssv can sua: ");
		Scanner Scanner = new Scanner(System.in);
		x=Scanner.nextInt();
		for (int i=0;i<n ;i++ ) {
			if (sv[i].getMssv()==x) {
				System.out.println("Chon thong tin can thay doi: ");
				System.out.println("1.Hodem");
				System.out.println("2.Ten");
				System.out.println("3.Lop");
				System.out.println("4.Gioitinh");
				System.out.println("5.Ngaysinh");
				s=Scanner.nextInt();
				switch (s) {
					case 1:
						System.out.print("Nhap hodem moi: ");
						Scanner.nextLine();
						String hodem2=Scanner.nextLine();
						hodem2=hodem2.trim();
						hodem2=hodem2.replaceAll("\\s+"," ");
						sv[i].SetHodem(hodem2);
					break;
					case 2:
						System.out.println("Nhap ten moi: ");
						Scanner.nextLine();
						String ten2=Scanner.nextLine();
						ten2=ten2.trim();
						ten2=ten2.replaceAll("\\s+"," ");
						sv[i].SetTen(ten2);
						break;
					case 3:
						System.out.print("Nhap lop moi: ");
						int lop2=Scanner.nextInt();
						sv[i].SetLop(lop2);
						break;
					case 4:
						System.out.println("Nhap gioi tinh moi: ");
						Scanner.nextLine();
						String gioitinh2=Scanner.nextLine();
						gioitinh2=gioitinh2.trim();
						gioitinh2=gioitinh2.replaceAll("\\s+"," ");
						sv[i].SetGioitinh(gioitinh2);
						break;
					case 5:
						int namsinh2,thangsinh2,ngaysinh2;
						System.out.println("Nhap ngay sinh moi: ");	
						do {
           				System.out.print("Nhap nam sinh (>= 1900): ");
            			 namsinh2 = Scanner.nextInt();
        				} while (namsinh2 < 1900);
						do {
            			System.out.print("Nhap thang sinh (1-12): ");
            			 thangsinh2 = Scanner.nextInt();
        				} while (thangsinh2 < 1 || thangsinh2 > 12);
						do {
            			System.out.print("Nhap ngay sinh (1-31): ");
            			 ngaysinh2 = Scanner.nextInt();
        				} while (ngaysinh2 < 1 || ngaysinh2 > 31 || (thangsinh2 == 9 && ngaysinh2 > 30) || (thangsinh2 == 2 && !laNamNhuan(namsinh2) && ngaysinh2 > 28) || (thangsinh2 == 2 && laNamNhuan(namsinh2) && ngaysinh2 > 29));					
						sv[i].SetNgaysinh(ngaysinh2);
						sv[i].SetThangsinh(thangsinh2);
						sv[i].SetNamsinh(namsinh2);
						break;
					default:
						System.out.println("Thoat chinh sua");
							
				}

			}
		}
	}
	public void timkim(){
		Scanner Scanner = new Scanner(System.in);
		System.out.println("=============================================");
		System.out.println("Chon cach tim kiem:  ");
				System.out.println("1.Tim theo MSSV");
				System.out.println("2.Tim theo Ten");
				int s=Scanner.nextInt();
			switch (s) {
				case 1:
					System.out.println("=============================================");
					System.out.print("Nhap MSSV can tim: ");
					int tempMSSV=Scanner.nextInt();
					boolean daTimThaymssv = false;
					for (int i=0;i<n ;i++ ) {
						if (sv[i].getMssv()==tempMSSV) {
							System.out.println("Da tim thay sinh vien");
							daTimThaymssv=true;
							sv[i].xuat();
							break;
						}
					}
					if (!daTimThaymssv) {
						System.out.println("Khong tim thay sinh vien co mssv: "+tempMSSV);
					}
					break;
				case 2:
					System.out.println("=============================================");
					System.out.println("Nhap ten can tim ");
					Scanner.nextLine();
					String tempTen=Scanner.nextLine();
					tempTen=tempTen.trim();
					tempTen=tempTen.replaceAll("\\s+"," ");
					boolean datimthayten =false;
					for (int i=0;i<n ;i++ ) {
						if (sv[i].getTen().equals(tempTen)) {
							System.out.println("Da tim thay Ten sv ");
							datimthayten=true;
							sv[i].xuat();
						}
					}
					if (!datimthayten) {
						System.out.println("Khong tim thay sinh vien co ten: "+tempTen);
					}
					break;
					default:
						System.out.println("Thoat chuong trinh: ");
						break;

			}
	}
	public void sapxep(){
		Scanner Scanner = new Scanner(System.in);
		System.out.println("=============================================");
		System.out.println("Chon cach sap xep  ");
				System.out.println("1.Sap xep theo Ten");
				System.out.println("2.Sap xep theo MSSV");
				int s=Scanner.nextInt();
				switch (s) {
					case 1:
						for (int i=0;i<n-1 ;i++ ) {
							for (int j=0;j<n-i-1 ;j++ ) {
								if (sv[j].getTen().compareTo(sv[j+1].getTen())>0) {
									Sinhvien temp = sv[j];
									sv[j]=sv[j+1];
									sv[j+1]=temp;
								}
							}
						}
						break;
					case 2:
						for (int i=0;i<n-1 ;i++ ) {
							for (int j=0;j<n-i-1 ;j++ ) {
								
							
							if (sv[j].getMssv()>sv[j+1].getMssv()) {
								Sinhvien temp = sv[j];
								sv[j]=sv[j+1];
								sv[j+1]=temp;
							}
						}
					}
						break;
					default:
						System.out.println("Thoat chuong trinh ");
						break;
				}
	}
	public void thongke(){

	}




}

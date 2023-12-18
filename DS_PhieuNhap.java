import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
public class DS_PhieuNhap implements DanhSach{
    private int n;
    private O_PhieuNhap[] pn;
    private DS_ctpn ctpn = new DS_ctpn(0);
    Scanner scanner = new Scanner(System.in);
    public DS_PhieuNhap(){

    }
    public DS_PhieuNhap(int n){
        this.n=n;
        pn = new O_PhieuNhap[n];
    }
    public void nhap(){
        System.out.println("Thêm phiếu nhập: ");
            them();    
    }        
    public void them(){
        pn = Arrays.copyOf(pn, pn.length+1);
        pn[n]=new O_PhieuNhap();
        pn[n].nhap();
        ctpn.nhap(pn[n].getMaPN());
        n++;
    }
    public void xuat(){
        for(int i=0;i<n;i++){
            pn[i].xuat();
            ctpn.xuat(pn[i].getMaPN());
        }
    }
    public void GhiFile(){
        ctpn.GhiFileJava("../src/Chitietphieunhap.txt");
    }
    public void Docfile(){
        ctpn.DocFileJava("../src/Chitietphieunhap.txt");
    }
    public void GhiFileJava(String filename){
        try{
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename));
            dos.writeInt(n);
            try{
                for(int i=0;i<n;i++){
                    pn[i].GhiFile(filename);
                }
            }catch(NullPointerException npe){

            }
            dos.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void DocFileJava(String filename){
        int i=0;
        try{
            DataInputStream dis = new DataInputStream(new FileInputStream(filename));
            n=dis.readInt();
            pn=new O_PhieuNhap[n];
            try{
                while (i<n) {
                    String MaPN = dis.readUTF();
                    String MaNV = dis.readUTF();
                    String MaNCC = dis.readUTF();
                    String NgayLap = dis.readUTF();
                    int Tongtien = dis.readInt();
                    pn[i]=new O_PhieuNhap(MaPN,MaNV,MaNCC,NgayLap,Tongtien);
                    i++;
                }
            }catch(EOFException e){

            }finally{
                dis.close();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    // public void nhap() {
    //     Scanner Scanner = new Scanner(System.in);
    //     System.out.println("Nhập số lượng phiếu nhập: ");
    //     n=Scanner.nextInt();
    //     pn = new PhieuNhap[n];
    //     for (int i=0; i<n; i++) {
    //         pn[i] = new PhieuNhap();
    //         sp[i].nhap();
    //     }
    // } 

    // public void them(PhieuNhap sp1) {
	// 	pn = Arrays.copyOf(pn, pn.length + 1);
	// 		this.pn[n]=pn1;
	// 		n++;
	
	// }

    // public void them() {
	// 	if (n<max) {
	// 		pn = Arrays.copyOf(pn, pn.length + 1);
	// 		pn[n].nhap();
    //     }
    // }



//Xai
    public void sua() {
        boolean daTimThay = false;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Điền mã phiếu nhập cần sửa");
        String temp = Scanner.nextLine();
        for (int i = 0; i<n; i++) {
            if (pn[i].getMaPN().equals(temp) ) {
                System.out.println("Chọn thuộc tính cần sửa");
                System.out.println("1: Sửa mã phiếu nhập");
                System.out.println("2: Sửa mã nhân viên");
                System.out.println("3: Sửa mã nhà cung cấp");
                System.out.println("4: Sửa ngày lập");
                System.out.println("Vui lòng nhập từ 1-4: ");
                int c = Scanner.nextInt();
                switch (c) {
                    case 1:
                        System.out.println("Nhập mã phiếu nhập mới: ");
                        String tempMaPN = Scanner.nextLine();
                        pn[i].setMaPN(tempMaPN);
                        break;
                    case 2: 
                        System.out.println("Nhập mã nhân viên mới: "); 
                        String tempMaNV = Scanner.nextLine();   
                        pn[i].setMaNV(tempMaNV);
                        break;
                    case 3:                
                        System.out.println("Nhập mã nhà cung cấp mới: "); 
                        String tempMaNCC = Scanner.nextLine();   
                        pn[i].setMaNV(tempMaNCC);
                        break; 
                    case 4:
                        System.out.println("Nhập ngày lập mới: ");     
                        String tempNgayLap = Scanner.nextLine();
                        pn[i].setNgayLap(tempNgayLap);                      
                    default:
                        break;
                }
                daTimThay = true;
            }
        }
        if (!daTimThay) {
			System.out.println("Không tìm thấy mã phiếu nhập: ");
		}
    }

    public void timkiem() {
        Scanner Scanner = new Scanner(System.in); 
        System.out.println("Chọn phương thức tìm kiếm");
        System.out.println("1: Tìm kiếm theo mã phiếu nhập");
        System.out.println("2: Tìm kiếm theo mã nhân viên");
        System.out.println("3: Tìm kiếm theo mã nhà cung cấp");
        System.out.println("4: Tìm kiếm theo ngày lập");
        System.out.println("Vui lòng chon từ 1-4");
        int c = Scanner.nextInt();
        switch (c) {
            case 1:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhập mã phiếu nhập cần tìm: ");
                int tempMaPN = scanner.nextInt();
                for (int i = 0; i < n; i++) {
                    if (pn[i].getMaPN().equals(tempMaPN) ) {
                        pn[i].xuat();
                    }
                }
                break;
            case 2:
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Nhập mã nhân viên cần tìm: ");
                int tempMaNV = scanner2.nextInt();
                for (int i = 0; i < n ; i++) {
                    if (pn[i].getMaNV().equals(tempMaNV) ) {
                        pn[i].xuat();
                    }
                }
                break;
            case 3:
                Scanner scanner3 = new Scanner(System.in);
                System.out.println("Nhập mã nhà cung cấp cần tìm: ");
                int tempMaNCC = scanner3.nextInt();
                for (int i = 0; i < n ; i++) {
                    if (pn[i].getMaNCC().equals(tempMaNCC)) {
                        pn[i].xuat();
                    }
                }
                break;
            case 4:
                Scanner scanner4 = new Scanner(System.in);
                System.out.println("Nhập ngày lập cần tìm: ");
                String tempNgayLap = scanner4.nextLine();
                for (int i = 0; i < n; i++) {
                    if (pn[i].getNgayLap().equals(tempNgayLap)) {
                        pn[i].xuat();
                    }
                }
                break;        
            default:
                break;
        }
    }

    public void xoa() {
		boolean daTimThay = false;
		System.out.print("Nhập mã phiếu nhập cần xóa: ");
		Scanner Scanner = new Scanner(System.in);
		int x=Scanner.nextInt();
		for (int i=0;i<n ;i++ ) {
			if (pn[i].getMaPN().equals(x)) {
				for(int j=i;j<n-1;j++){
					pn[j]=pn[j+1];
				}
			n--;
			daTimThay = true;
			System.out.println("Phiếu nhập đã được xóa ");
			break;
			}
		}
		if (!daTimThay) {
			System.out.println("Không tìm thấy phiếu nhập: "+x);
		}
    } 

    // public void thongke() {
    //     Scanner Scanner = new Scanner(System.in); 
    //     System.out.println("Chọn phương thức thống kê");

    // }
}

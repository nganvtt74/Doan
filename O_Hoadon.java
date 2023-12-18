import java.util.Date;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class O_Hoadon {
    private int MaHD;
    private int MaNV;
    private int MaKH;
    private int Tongtien;
    private String Ngaylap;
    public O_Hoadon(){

    }
    public O_Hoadon(int MaHD,int MaNV,int MaKH,int Tongtien,String Ngaylap){
        this.MaHD=MaHD;
        this.MaNV=MaNV;
        this.MaKH=MaKH;
        this.Tongtien=Tongtien;
        this.Ngaylap=Ngaylap;
    }
    public int getMaHD(){
        return MaHD;
    }
    public int getMaNV(){
        return MaNV;
    }
    public int getMaKH(){
        return MaKH;
    }
    public int getTongtien(){
        return Tongtien;
    }
    public String getNgaylap(){
        return Ngaylap;
    }
    public void setMaHD(int MaHD){
        this.MaHD=MaHD;
    }
    public void setMaNV(int MaNV){
        this.MaNV=MaNV;
    }
    public void setMaKH(int MaKH){
        this.MaKH=MaKH;
    }
    public void setTongtien(int Tongtien){
        this.Tongtien=Tongtien;
    }
    public void setNgaylap(String Ngaylap){
        this.Ngaylap=Ngaylap;
    }
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        DS_cthd hd = new DS_cthd(0);
        System.out.print("Nhap Ma Hoa Don: ");
        MaHD=scanner.nextInt();
        System.out.print("Nhap Ma Nhan Vien: ");
        MaNV=scanner.nextInt();
        System.out.print("Nhap Ma Khach Hang: ");
        MaKH=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ngay lap la(dd/mm/yyyy): ");
        Ngaylap=scanner.nextLine();    
        Tongtien=hd.getTongtien(MaHD);    
    
    }

    public void xuat(){
        DS_cthd hd = new DS_cthd(0);
        hd.DocFileJava("../src/Chitiethoadon.txt");
        Tongtien=hd.getTongtien(MaHD);    
        // hd.setSoLuong();
        System.out.println("================================================");
        System.out.format("MaHD:%-8d MaNV:%-8d MaKH:%-8d\n",MaHD,MaNV,MaKH );
        System.out.format("Tongtien:%-8d Ngay nhap:%-8s\n",Tongtien,Ngaylap);
    }
    public void xuatchitiet(){
        DS_cthd hd = new DS_cthd(0);
        hd.DocFileJava("../src/Chitiethoadon.txt");
            // System.out.format("%-8s %-20s %-8s %-8s %-8s%n", "MASP", "TenSP", "Soluong", "Dongia", "Thanhtien");
            hd.xuat(MaHD); 
        


    }
    public void GhiFile(String filename)throws IOException{
        try(DataOutputStream dos= new DataOutputStream(new FileOutputStream(filename,true))){
            // String ngayChuoi = new SimpleDateFormat("dd/MM/yyyy").format(ngayThangNam);
            dos.writeInt(MaHD);
            dos.writeInt(MaNV);
            dos.writeInt(MaKH);
            dos.writeInt(Tongtien);
            dos.writeUTF(Ngaylap);
        }
    }
}

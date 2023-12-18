import java.io.*;
import java.util.Scanner;
public class O_Chitiethoadon implements Object{
    private int MaHD;
    private int MASP;
    private String TenSP;
    private int Soluong;
    private int Dongia;
    private int Thanhtien;
    Scanner Scanner = new Scanner(System.in);
    DS_Sanpham dssp = new DS_Sanpham(0);

    public O_Chitiethoadon(){

    }
    public O_Chitiethoadon(int MaHD,int MASP,String TenSP,int Soluong,int Dongia,int Thanhtien){
        this.MaHD=MaHD;
        this.MASP=MASP;
        this.TenSP=TenSP;
        this.Soluong=Soluong;
        this.Dongia=Dongia;
        this.Thanhtien=Thanhtien;
    }
    public void nhap(){
        do{
        dssp.DocFileJava("../src/Sanpham.txt");
        System.out.print("Nhap ma san pham: ");
        MASP=Scanner.nextInt();   
            if (dssp.Truyengiasanpham(MASP)==-1) {
                System.out.println("Ma San Pham khong hop le");
            }
        }while(dssp.Truyengiasanpham(MASP)==-1);
        Dongia=dssp.Truyengiasanpham(MASP);
        TenSP=dssp.getTenSP(MASP);
        do{
            System.out.print("Nhap so luong: ");
            Soluong=Scanner.nextInt();
            if (dssp.TruyenSoLuong(MASP)<Soluong) {
                System.out.println("So luong khong hop le");
            }
        }while (dssp.TruyenSoLuong(MASP)<Soluong);
        Thanhtien=Dongia*Soluong;

        
    }
    public void xuat(){
        System.out.format("%-8d %-20s %-8d %-8d %-8d%n",
        MASP, TenSP, Soluong, Dongia, Thanhtien);

    }

    public int getMAHD(){
         return MaHD;
    }
    public void setMAHD(int MaHD){
        this.MaHD=MaHD;
    }
    // Getter và setter cho MASP
    public int getMASP() {
        return MASP;
    }

    public void setMASP(int MASP) {
        this.MASP = MASP;
    }

    // Getter và setter cho Soluong
    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    // Getter và setter cho Dongia
    public int getDongia() {
        return Dongia;
    }

    public void setDongia(int Dongia) {
        this.Dongia = Dongia;
    }

    // Getter và setter cho Thanhtien
    public int getThanhtien() {
        return Thanhtien;
    }

    public void setThanhtien(int Thanhtien) {
        this.Thanhtien = Thanhtien;
    }
    //Getter và setter cho TenSP
    public String getTenSP(){
        return TenSP;
    }
    public void setTenSP(String TenSP){
        this.TenSP=TenSP;
    }
    public void GhiFile(String filename) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename,true))) {
            dos.writeInt(MaHD);
            dos.writeInt(MASP);
            dos.writeUTF(TenSP);
            dos.writeInt(Soluong);
            dos.writeInt(Dongia);
            dos.writeInt(Thanhtien);
        }
    }
}




import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.zip.DataFormatException;
public class O_ChiTietPhieuNhap {
    private String MaPN;
    private int MaSP;
    private String TenSP;
    private int SoLuong;
    private int DonGia;
    Scanner scanner = new Scanner(System.in);

    private DS_Sanpham dssp = new DS_Sanpham(0);

    public O_ChiTietPhieuNhap(){

    }
    public O_ChiTietPhieuNhap(String MaPN,int MaSP,String TenSP,int SoLuong,int DonGia){
        this.MaPN=MaPN;
        this.MaSP=MaSP;
        this.TenSP=TenSP;
        this.SoLuong=SoLuong;
        this.DonGia=DonGia;
    }
    public void setMaPN(String MaPN){
        this.MaPN=MaPN;
    }
    public void setMaSP(int MaSP){
        this.MaSP=MaSP;
    }
    public void setTenSP(String TenSP){
        this.TenSP=TenSP;
    }
    public void SoLuong(int SoLuong){
        this.SoLuong=SoLuong;
    }
    public void DonGia(int DonGia){
        this.DonGia=DonGia;
    }
    public String getMaPN(){
        return MaPN;
    }
    public int getMaSP(){
        return MaSP;
    }
    public String getTenSP(){
        return TenSP;
    }
    public int getSoLuong(){
        return SoLuong;
    }
    public int getDonGia(){
        return DonGia;
    }
    public void nhap(String id){
        dssp.DocFileJava("..\\src\\Sanpham.txt");
        MaPN=id;
        System.out.println("Nhập chi tiết phiếu có mã: "+MaPN);
        System.out.print("Nhập mã sản phẩm: ");
        MaSP=scanner.nextInt();
        System.out.print("Nhập số lượng: ");
        SoLuong=scanner.nextInt();
        scanner.nextLine();
        DonGia=dssp.Truyengiasanpham(MaSP);
        TenSP = dssp.getTenSP(MaSP);
    }
    public void xuat(){
        int ThanhTien;
        ThanhTien=DonGia*SoLuong;
        System.out.format("%-8d %-8d %-20s %-8d %-8d %-8d\n",MaPN,MaSP,TenSP,SoLuong,DonGia,ThanhTien);
    }
    public void GhiFile(String filename)throws IOException{
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename,true))){
            dos.writeUTF(MaPN);
            dos.writeInt(MaSP);
            dos.writeUTF(TenSP);
            dos.writeInt(SoLuong);
            dos.writeInt(DonGia);
        }
    }
}

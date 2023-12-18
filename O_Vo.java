import java.io.*;
import java.util.Scanner;
public class O_Vo extends O_SanPham implements Object{
    private int SoTrang;
    private String ChatLuongGiay;
    public O_Vo(){

    }
    public O_Vo(int MaSP, String TenSP,int Soluong,int DonGia,String DonVi,int MaLoai,int SoTrang,String ChatLuongGiay){
    	super(MaSP,TenSP,Soluong,DonGia,DonVi,MaLoai);
    	this.SoTrang=SoTrang;
    	this.ChatLuongGiay=ChatLuongGiay;	
    }
    public O_Vo(O_Vo v){
    	super((O_SanPham)v);
    	SoTrang=v.SoTrang;
    	ChatLuongGiay=v.ChatLuongGiay;
    }
    public void nhap(){
    	Scanner Scanner = new Scanner(System.in);
    	super.nhap();
    	System.out.print("Nhap so trang: ");
    	SoTrang = Scanner.nextInt();
    	System.out.print("Nhap chat luong giay: ");
    	ChatLuongGiay=Scanner.nextLine();
        Scanner.close();
    }
    public void xuat(){
        	super.xuat();
        	// System.out.println("So Trang: "+SoTrang);
        	// System.out.println("ChatLuongGiay: "+ ChatLuongGiay);
        }
    public int getSoTrang(){
        return SoTrang;
    }
    public String getChatLuongGiay(){
        return ChatLuongGiay;
    }
    public void setSoTrang(int SoTrang){
        this.SoTrang=SoTrang;
    }
    public void setChatLuongGiay(String ChatLuongGiay){
        this.ChatLuongGiay=ChatLuongGiay;
    }
    public void GhiFile(String filename) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename, true))) {
            dos.writeInt(3);
            dos.writeInt(MaSP);
            dos.writeUTF(TenSP);
            dos.writeInt(SoLuong);
            dos.writeInt(DonGia);
            dos.writeUTF(DonVi);
            dos.writeInt(MaLoai);
            dos.writeInt(SoTrang);
            dos.writeUTF(ChatLuongGiay);
        }
    }

}
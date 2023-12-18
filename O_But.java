import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;
public class O_But extends O_SanPham {
	private String Mau;
	public O_But(){

	}
	public O_But(int MaSP, String TenSP,int Soluong,int DonGia,String DonVi,int MaLoai,String Mau){
		super(MaSP,TenSP,Soluong,DonGia,DonVi,MaLoai);
		this.Mau=Mau;
	}
	public O_But(O_But b){
		super((O_SanPham)b);
		Mau=b.Mau;
	}
	public void nhap(){
		Scanner Scanner = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap mau but: ");
		Mau=Scanner.nextLine();
		Scanner.close();
	}
	public void xuat(){
		super.xuat();
		// System.out.println("Mau but la: "+Mau);
	}
	public String getMau(){
		return Mau;
	}
	public void setMau(String Mau){
		this.Mau=Mau;
	}
	public void GhiFile(String filename) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename, Boolean.TRUE))) {
            dos.writeInt(2);
            dos.writeInt(MaSP);
            dos.writeUTF(TenSP);
            dos.writeInt(SoLuong);
            dos.writeInt(DonGia);
            dos.writeUTF(DonVi);
            dos.writeInt(MaLoai);
            dos.writeUTF(Mau);
        }
    }

}
import java.io.*;
import java.util.Scanner;
	public class O_Loai implements Object{
		private int MaLoai;
		private String TenLoai;
		public O_Loai(){

		}
		public O_Loai(int MaLoai,String TenLoai){
			this.MaLoai=MaLoai;
			this.TenLoai=TenLoai;

		}
		public O_Loai(Loai l){
			MaLoai=l.MaLoai;
			TenLoai=l.TenLoai;
		}
		public void nhap(){
			Scanner Scanner = new Scanner(System.in);
			System.out.print("Nhap ma loai: ");
			MaLoai = Scanner.nextInt();
			System.out.println("Nhap ten loai ");
			TenLoai=Scanner.nextLine();
			Scanner.close();
		}
		public void xuat(){
			System.out.println("Ma Loai: "+MaLoai);
			System.out.println("Ten Loai: "+TenLoai);
		}
		public int getMaLoai(){
			return MaLoai;

		}
		public String getTenLoai(){
			return TenLoai;
		}
		public void setMaLoai(int MaLoai){
			this.MaLoai=MaLoai;
		}
		public void setTenLoai(String TenLoai){
			this.TenLoai=TenLoai;
		}
		public void GhiFile(String filename) throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename, Boolean.TRUE));
        dos.writeInt(MaLoai);
        dos.writeUTF(TenLoai);

		dos.close();
	}


	}
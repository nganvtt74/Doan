import java.io.*;
public class Test{
	public static void main(String[] args) {
		DS_PhieuNhap dspn = new DS_PhieuNhap(0);
		dspn.nhap();
		dspn.GhiFile();
		dspn.GhiFileJava("..//src//Phieunhap.txt");
		// dspn.Docfile();
		// dspn.DocFileJava("../src/Phieunhap.txt");
		// dspn.xuat();
	}
}

import java.util.*;
import java.io.*;
public class Test3 {
    DSPhieuNhap dspn = new DSPhieuNhap(0);
    DanhsachHD dshd=new DanhsachHD(0);
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int c = scnanner.nextInt();
        switch (c) {
            case 1:
                
                break;
        
            default:
                break;
        }
    }
    public void qldspn(){
        int c;
        c=scanner.nextInt();
        switch (c) {
            case 1:
                dspn.nhap();
                dspn.GhiFile();
                dspn.GhiFileJava("../src/Phieunhap.txt");
                break;
            case 2:
                dspn.Docfile();
                dspn.DocFileJava("../src/Phieunhap.txt");
                dspn.xuat();
    
            default:
                break;
        }
    }
}

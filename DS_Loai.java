import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class DS_Loai implements DanhSach {
    private int n , a= 0; 
    private O_O_Loai[] l;
    public DS_Loai(){

    }
    public DS_Loai(int n){
        this.n=n;
        l = new O_Loai[n];
    }
    public void nhap(){
    	Scanner Scanner = new Scanner(System.in);
    	System.out.println("Nhap so luong loai");
    	n=Scanner.nextInt();
        l = new O_Loai[n];
    	for (int i=0;i<n ;i++ ) {
    		l[i]=new O_Loai();
    		l[i].nhap();
    	}
        Scanner.close();
    }
    public void xuat(){
    	System.out.println("Danh sach loai");
    	for (int i=0;i<n ;i++ ) {
    		l[i].xuat();
    	}
    }
    public void them(O_Loai l1){
    	l=Arrays.copyOf(l, l.length +1 );
    		this.l[n]=l1;
    		n++;
    	
    
    }
    public int getLoaiLength(){
        return n;
    }
    public O_Loai[] getMang(){
        return l;
    }
    public void them(){
            l=Arrays.copyOf(l, l.length +1 );
    		System.out.println("Nhap san loai can them");
    		l[n].nhap();
    		n++;
    }
    public void xoa(){
    	int tempMaLoai;
    	boolean daTimThay = false;
    	Scanner Scanner = new Scanner(System.in);
    	System.out.println("Nhap Ma Loai can xoa: ");
    	tempMaLoai=Scanner.nextInt();
    	for (int i=0;i<n ;i++ ) {
    		if (tempMaLoai==l[i].getMaLoai()) {
    			for (int j=i;j<n-1 ;j++ ) {
    				l[j]=l[j+1];
    			}
    		}
    		n--;
    		daTimThay=true;
			System.out.println("Loai da duoc xoa");
			break;
    	}
    	if (!daTimThay) {
			System.out.println("Khong tim thay loai voi ma loai: "+tempMaLoai);
		}
        Scanner.close();
    }
    public void xoa(int tempMaLoai){
    boolean daTimThay = false;
    for (int i=0;i<n ;i++ ) {
    		if (tempMaLoai==l[i].getMaLoai()) {
    			for (int j=i;j<n-1 ;j++ ) {
    				l[j]=l[j+1];
    			}
    		}
    		n--;
    		daTimThay=true;
			System.out.println("Loai da duoc xoa");
			break;
    	}
    	if (!daTimThay) {
			System.out.println("Khong tim thay loai voi ma loai: "+tempMaLoai);
		}
    }

    public void sua(){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Chon muc can sua");
        System.out.println("1.Sua MaLoai");
        System.out.println("2.Sua TenLoai");
        int c = Scanner.nextInt();
        do{
            switch (c) {
                case 1:
                    fixMaLoai();
                    break;
                case 2:
                    fixTenLoai();
                    break;
                default:
                    break;
            }
        }while(c==1||c==2);
        Scanner.close();
    }
    public void fixMaLoai(){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Nhap MaLoai");
        int tempMaLoai=Scanner.nextInt();
        System.out.println("Nhap MaLoai");
        int fixMaLoai=Scanner.nextInt();
        for (int i=0;i<n ;i++ ) {
            if (tempMaLoai==l[i].getMaLoai()) {
                l[i].setMaLoai(fixMaLoai);
                break;
            }
        }
        System.out.println("Da thay the thanh cong");
        Scanner.close();
    }
    public void fixMaLoai(int tempMaLoai,int fixMaLoai){
        for (int i=0;i<n ;i++ ) {
            if (tempMaLoai==l[i].getMaLoai()) {
                l[i].setMaLoai(fixMaLoai);
                break;
            }
        }
        System.out.println("Da thay the thanh cong");
    }
    public void fixTenLoai(){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Nhap MaLoai");
        int tempMaLoai=Scanner.nextInt();
        System.out.println("Nhap MaLoai");
        String fixTenLoai=Scanner.nextLine();
        for (int i=0;i<n ;i++ ) {
            if (tempMaLoai==l[i].getMaLoai()) {
                l[i].setTenLoai(fixTenLoai);
                break;
            }
        }
        System.out.println("Da thay the thanh cong");
        Scanner.close();
    }
    public void fixTenLoai(int tempMaLoai,String fixTenLoai){
        for (int i=0;i<n ;i++ ) {
            if (tempMaLoai==l[i].getMaLoai()) {
                l[i].setTenLoai(fixTenLoai);
                break;
            }
        }
        System.out.println("Da thay the thanh cong");
    }	
    public void GhiFileJava(String filename) {
		try {
			
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename));
			dos.writeInt(n);
			try {
				for(int i = 0; i < n; i++) {
					l[i].GhiFile(filename);
				}
			}catch(NullPointerException npe) {
				
			}
			dos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void DocFileJava(String filename) {
		int  i = 0;
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream(filename));
			n = dis.readInt();
			l = new Loai[n];
			try {
				while(true) {
					int MaLoai = dis.readInt();
					String TenLoai = dis.readUTF();
					l[i] = new Loai(MaLoai,TenLoai);
					i++;	
				}
			}catch(EOFException e) {}
			finally {
				a = i;
				dis.close();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
  
}




//1thuoc tinh la chuoi s 
//thiet lap , getset 
//va cac phuong thuc trong cau 9 cua baitap0import java.util.Scanner;
class Baitap7_c2{
	public static void main(String[] args) {
		Mang usea = new Mang();
		usea.nhapmang();
		usea.xuatmang();
		usea.tongmang();
		usea.tongchanmang();
		usea.tonglemang();
		usea.tongsntmang();
		usea.themphantu();
		usea.xuatmang();
		usea.xoaphantu();
		usea.xuatmang();
		usea.findphantu();
		//System.out.println();

	}
}
class Mang{
	private int n;
	private int[] a;
	public Mang(){

	}
	public Mang(int n){
		this.n=n;
	}
	
	
	public void xuat(){
		System.out.print(n+ " ");
		
	}
	public int inphantu(){
		return n;
	}



	
	public void nhapmang(){
	Scanner Scanner = new Scanner(System.in);
	System.out.print("Nhap n: ");
	n=Scanner.nextInt();
	a= new int[n+1];
	for (int i=0;i<n ;i++ ) {
			a[i]=Scanner.nextInt(); 
		}
	
		
	}
	public void xuatmang(){
	System.out.print("Mang la: ");
	for (int i=0;i<n;i++){
		System.out.print(" "+a[i]);
	}
	}
	public void tongmang(){
		int s=0;
	for (int i=0;i<n ;i++ ) {
		s+=a[i];
	}
	System.out.print("\nTong cua mang la: "+s);
	}
	public boolean chanle(int x){
		if (x%2==0) {
			return true;
		}
		else
			return false;
	}
	public void tongchanmang(){
		int s=0;
		for (int i=0;i<n ;i++ ) {
			if (chanle(a[i])) {
				s+=a[i];
			}
		}
		System.out.println("\nTong mang chan la: "+s);
	}
	public void	tonglemang(){
		int s=0;
		for (int i=0;i<n ;i++ ) {
			if (chanle(a[i])==false) {
				s+=a[i];
			}

		}
		System.out.println("Tong le mang la: "+s);
	}
	public boolean snt(int x){
		if (x<2) {
			return false;
		}
		for (int i=2;i<=Math.sqrt(x) ; i++) {
			if (x%i==0) {
				return false;
			}

		}
		return true;
	}
	public void tongsntmang(){
		int s=0;
		for (int i=0;i<n ;i++ ) {
			if (snt(a[i])) {
				s+=a[i];
			}

		}
		System.out.println("Thong snt mang la: "+s);
	}
	public void themphantu(){
		int  x;
		Scanner Scanner= new Scanner(System.in);
		System.out.print("Nhap so can them: ");
		x=Scanner.nextInt();
		a[n]=x;
		n++;
	}
	public void xoaphantu(){
		int x;
		Scanner Scanner=new Scanner(System.in);
		System.out.print("\nChon vi tri can xoa: ");
		do{
		x=Scanner.nextInt();
		if (x<0||x>(n-1)) {
			System.out.println("Vi tri khong hop le ");
			System.out.print("Chon vi tri can xoa: ");

		}
		}
		while(x<0||x>n);
		for(int i=(x-1);i<(n-1);i++){
			a[i]=a[i+1];
		}
		n--;
	}
	public void findphantu(){
		int x ,s=0;
		Scanner Scanner=new Scanner(System.in);
		System.out.print("\nNhap phan tu can tim: ");
		x=Scanner.nextInt();
		for (int i=0;i<n ;i++ ) {
			if (x==a[i]) {
				System.out.println("Phan tu x co ton tai trong mang va o vi tri ("+(i+1)+") cua mang ");
				s=a[i];
				break;
			}
		}
		if (x!=s) {
			System.out.println("Phan tu khong ton tai");
		}
}
}

	
	




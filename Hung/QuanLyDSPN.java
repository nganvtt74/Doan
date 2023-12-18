import java.util.Scanner;

public class QuanLyDSPN {
    private DSPN DSPN;
    // private DSCTPN;
    public void menu() {
        DSPN = new DSPN();
        Scanner scanner = new Scanner(System.in);
        int choice;
        DSPN.them(new PhieuNhap("01", "XH01", "DKLB56", "12-11-2023"));
        DSPN.them(new PhieuNhap("01", "XH01", "DKLB56", "15-05-2023"));
        DSPN.them(new PhieuNhap("02", "XH02", "DKLB57", "06-12-2023"));
        DSPN.them(new PhieuNhap("03", "XH03", "DKLB58", "12-11-2023"));
        DSPN.them(new PhieuNhap("04", "XH04", "DKLB59", "12-11-2023"));
        DSPN.them(new PhieuNhap("05", "XH05", "DKLB60", "12-11-2023"));
        DSPN.them(new PhieuNhap("06", "XH06", "DKLB61", "12-11-2023"));
        DSPN.them(new PhieuNhap("07", "XH07", "DKLB62", "12-11-2023"));
        DSPN.them(new PhieuNhap("08", "XH08", "DKLB63", "12-11-2023"));
        DSPN.them(new PhieuNhap("09", "XH09", "DKLB64", "12-11-2023"));
        DSPN.them(new PhieuNhap("10", "XH10", "DKLB65", "12-11-2023"));
    }
}
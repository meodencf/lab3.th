
package lab3.b3;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class QuanLyHangHoa {
    private ArrayList<HangHoa> danhSachHangHoa;

    public QuanLyHangHoa() {
        danhSachHangHoa = new ArrayList<>();
    }

    public void themHangHoa(HangHoa hh) {
        if (!danhSachHangHoa.contains(hh)) {
            danhSachHangHoa.add(hh);
            System.out.println("Thêm hàng hóa thành công.");
        } else {
            System.out.println("Hàng hóa đã tồn tại trong danh sách.");
        }
    }

    public void inDanhSachHangHoa() {
        System.out.println("Danh sách hàng hóa:");
        for (HangHoa hh : danhSachHangHoa) {
            System.out.println(hh.getTenHang());
        }
    }
   
}

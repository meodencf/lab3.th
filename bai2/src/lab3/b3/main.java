/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.b3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author MINHNHAT
 */
public class main {
     public static void main(String[] args) {
        QuanLyHangHoa qlhh = new QuanLyHangHoa();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("---- MENU ----");
            System.out.println("1. Thêm hàng hóa");
            System.out.println("2. In danh sách hàng hóa");
            System.out.println("0. Thoát");
            System.out.print("Vui lòng chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Chọn loại hàng hóa:");
                    System.out.println("1. Hàng thực phẩm");
                    System.out.println("2. Hàng sành sứ");
                    System.out.println("3. Hàng điện máy");
                    System.out.print("Vui lòng chọn: ");
                    int loaiHangHoa = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Nhập mã hàng: ");
                    String maHang = scanner.nextLine();
                    System.out.print("Nhập tên hàng: ");
                    String tenHang = scanner.nextLine();
                    System.out.print("Nhập số lượng tồn: ");
                    int soLuongTon = scanner.nextInt();
                    System.out.print("Nhập đơn giá: ");
                    double donGia = scanner.nextDouble();

                    switch (loaiHangHoa) {
                        case 1:
                            System.out.print("Nhập ngày sản xuất (dd/mm/yyyy): ");
                            String ngaySanXuatStr = scanner.next();
                            System.out.print("Nhập ngày hết hạn (dd/mm/yyyy): ");
                            String ngayHetHanStr = scanner.next();
                            scanner.nextLine(); 
                            System.out.print("Nhập nhà cung cấp: ");
                            String nhaCungCap = scanner.nextLine();

                           
                            Date ngaySanXuat = convertStringToDate(ngaySanXuatStr);
                            Date ngayHetHan = convertStringToDate(ngayHetHanStr);

                            HangThucPham thucPham = new HangThucPham(maHang, tenHang, soLuongTon, donGia, ngaySanXuat, ngayHetHan, nhaCungCap);
                            qlhh.themHangHoa(thucPham);
                            break;
                        case 2:
                            System.out.print("Nhập nhà sản xuất: ");
                            String nhaSanXuat = scanner.nextLine();
                            System.out.print("Nhập ngày nhập kho (dd/mm/yyyy): ");
                            String ngayNhapKhoStr = scanner.next();
                            scanner.nextLine(); 

                           
                            Date ngayNhapKho = convertStringToDate(ngayNhapKhoStr);

                            HangSanhSu sanhSu = new HangSanhSu(maHang, tenHang, soLuongTon, donGia, nhaSanXuat, ngayNhapKho);
                            qlhh.themHangHoa(sanhSu);
                            break;
                        case 3:
                            System.out.print("Nhập thời gian bảo hành: ");
                            int thoiGianBaoHanh = scanner.nextInt();
                            System.out.print("Nhập công suất (KW): ");
                            int congSuat = scanner.nextInt();

                            HangDienMay dienMay = new HangDienMay(maHang, tenHang, soLuongTon, donGia, thoiGianBaoHanh, congSuat);
                            qlhh.themHangHoa(dienMay);
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ.");
                            break;
                    }
                    break;
                case 2:
                    qlhh.inDanhSachHangHoa();
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        }
    }

    private static Date convertStringToDate(String dateStr) {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return format.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}

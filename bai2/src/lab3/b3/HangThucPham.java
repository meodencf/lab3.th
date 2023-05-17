/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.b3;

import java.util.Date;

public class HangThucPham extends HangHoa {
    private Date ngaySanXuat;
    private Date ngayHetHan;
    private String nhaCungCap;

    public HangThucPham(String ma, String ten, int sl, double gia, Date sanXuat, Date hetHan, String cungCap) {
        super(ma, ten, sl, gia);
        ngaySanXuat = sanXuat;
        ngayHetHan = hetHan;
        nhaCungCap = cungCap;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    @Override
    public double tinhVAT() {
        return getDonGia() * 0.05;
    }

    @Override
    public String danhGia() {
        if (getSoLuongTon() > 0 && ngayHetHan.before(new Date())) {
            return "Khó bán";
        } else {
            return "Đánh giá khác";
        }
    }
}
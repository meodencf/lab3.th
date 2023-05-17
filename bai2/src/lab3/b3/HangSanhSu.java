/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.b3;

import java.util.Date;

/**
 *
 * @author MINHNHAT
 */
public class HangSanhSu extends HangHoa {
    private String nhaSanXuat;
    private Date ngayNhapKho;

    public HangSanhSu(String ma, String ten, int sl, double gia, String sanXuat, Date nhapKho) {
        super(ma, ten, sl, gia);
        nhaSanXuat = sanXuat;
        ngayNhapKho = nhapKho;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }

    @Override
    public double tinhVAT() {
        return getDonGia() * 0.1;
    }

    @Override
    public String danhGia() {
        if (getSoLuongTon() > 50 && ngayNhapKho.before(new Date())) {
            return "Chậm";
        } else {
            return "Đánh giá khác";
        }
    }
}
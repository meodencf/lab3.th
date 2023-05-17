/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.b3;

public class HangDienMay extends HangHoa {
    private int thoiGianBaoHanh;
    private int congSuat;

    public HangDienMay(String ma, String ten, int sl, double gia, int baoHanh, int suat) {
        super(ma, ten, sl, gia);
        thoiGianBaoHanh = baoHanh;
        congSuat = suat;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public int getCongSuat() {
        return congSuat;
    }

    @Override
    public double tinhVAT() {
        return getDonGia() * 0.1;
    }

    @Override
    public String danhGia() {
        if (getSoLuongTon() < 3) {
            return "Bán được";
        } else {
            return "Đánh giá khác";
        }
    }
}

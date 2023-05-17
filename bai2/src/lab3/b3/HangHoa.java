
package lab3.b3;


public abstract class HangHoa {
    private final String maHang;
    private final String tenHang;
    private int soLuongTon;
    private final double donGia;

    public HangHoa(String ma, String ten, int sl, double gia) {
        maHang = ma;
        tenHang = ten;
        soLuongTon = sl;
        donGia = gia;
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setSoLuongTon(int sl) {
        soLuongTon = sl;
    }

    public abstract double tinhVAT();

    public abstract String danhGia();
}

public class SinhVien {
    private final String maSo;
    private final String hoTen;
    private final double diem;

    public SinhVien(String maSo, String hoTen, double diem) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public String getMaSo() { return maSo; }
    public String getHoTen() { return hoTen; }
    public double getDiem() { return diem; }

    @Override
    public String toString() {
        return String.format("%-5s %-20s %4.1f", maSo, hoTen, diem);
    }
}

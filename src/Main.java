public class Main {
    public static void main(String[] args) {
        System.out.println(CauHinh.TEN_UNG_DUNG + " - phien ban " + CauHinh.PHIEN_BAN);
        QuanLy ql = new QuanLy();
        ql.them(new SinhVien("SV01", "Tran Thanh Tram", 8.5));
        ql.them(new SinhVien("SV02", "Nguyen Hong Linh", 4.5));
        ql.them(new SinhVien("SV03", "Tran Thanh Phuoc", 7.0));
        ql.inDanhSach();
        System.out.println("So sinh vien dat (diem >= " + CauHinh.DIEM_DAT + "): " + ql.soLuongDat());
    }
}

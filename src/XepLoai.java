public class XepLoai {
    public static String tuDiem(double diem) {
        if (diem >= 8.0) return "Gioi";
        if (diem >= 6.5) return "Kha";
        if (diem >= CauHinh.DIEM_DAT) return "Trung binh";
        return "Yeu";
    }
}

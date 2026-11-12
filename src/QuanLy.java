import java.util.ArrayList;
import java.util.List;

public class QuanLy {
    private final List<SinhVien> ds = new ArrayList<>();

    public void them(SinhVien sv) {
        if (ds.size() < CauHinh.SO_SINH_VIEN_TOI_DA) ds.add(sv);
    }

    public int soLuongDat() {
        int dem = 0;
        for (SinhVien sv : ds) if (sv.getDiem() >= CauHinh.DIEM_DAT) dem++;
        return dem;
    }

    public void inDanhSach() {
        for (SinhVien sv : ds) System.out.println("  " + sv);
    }

    public void inXepLoai() {
        System.out.println("Xep loai:");
        for (SinhVien sv : ds) System.out.println("  " + sv.getMaSo() + ": " + XepLoai.tuDiem(sv.getDiem()));
    }
}

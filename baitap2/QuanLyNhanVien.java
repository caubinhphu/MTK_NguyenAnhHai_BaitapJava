import java.util.ArrayList;

/**
 * QuanLyNhanVien
 */
public class QuanLyNhanVien implements IQuanLy {

  // danh sach nhan vien
  ArrayList<NhanVien> dsNhanVien = new ArrayList<>();

  // implement methods
  @Override
  public void them(NhanVien nv) {
    dsNhanVien.add(nv);
  };

  @Override
  public void inDS() {
    for (NhanVien nv : dsNhanVien) {
      System.out.println(nv.getThongTin());
    }
  };
}
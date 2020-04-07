import java.util.ArrayList;

public class QuanLyChuyenXe {
  // attributes
  public ArrayList<ChuyenXe> dsChuyenXe = new ArrayList<>();

  // methods
  // them chuyen xe
  public void themChuyenXe(ChuyenXe cx) {
    dsChuyenXe.add(cx);
  }

  // Xuat danh sach chuyen xe

  // Xuat thong tin chuyen xe
  public void inThongTin() {
    for(ChuyenXe cx : dsChuyenXe) {
      cx.inThongTinChuyenXe();
    }
  }

  // tinh tong doanh thu xe noi thanh
  public double tongDoanhThuNoiThanh() {
    double doanhThu = 0;
    for (ChuyenXe cx : dsChuyenXe) {
      if (cx instanceof ChuyenXeNoiThanh) {
        doanhThu += cx.doanhThu;
      }
    }
    return doanhThu;
  }

  // tinh tong doanh thu xe ngoai thanh
  public double tongDoanhThuNgoaiThanh() {
    double doanhThu = 0;
    for (ChuyenXe cx : dsChuyenXe) {
      if (cx instanceof ChuyenXeNgoaiThanh) {
        doanhThu += cx.doanhThu;
      }
    }
    return doanhThu;
  }

  // tinh tong doanh thu
  public double tongDoanhThu() {
    double doanhThu = 0;
    for (ChuyenXe cx : dsChuyenXe) {
      doanhThu += cx.doanhThu;
    }
    return doanhThu;
  }
}

public class ChuyenXeNoiThanh extends ChuyenXe {
  // attributes
  public String soTuyen;
  public double soKm;

  // constructor
  public ChuyenXeNoiThanh(int maChuyen, String taiXe, String soXe, double doanhThu, String soTuyen, double soKm) {
    super(maChuyen, taiXe, soXe, doanhThu);
    this.soTuyen = soTuyen;
    this.soKm = soKm;
  }

  // methods
  // in thong tin
  @Override
  public void inThongTinChuyenXe() {
    super.inThongTinChuyenXe();
    System.out.println("tuyen: " + this.soTuyen);
    System.out.println("so km di duoc: " + this.soKm);
  }
}
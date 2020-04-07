
public abstract class ChuyenXe {
  // attributes
  public int maChuyen;
  public String taiXe;
  public String soXe;
  public double doanhThu;

  // contructor
  public ChuyenXe(int maChuyen, String taiXe, String soXe, double doanhThu) {
    this.maChuyen = maChuyen;
    this.taiXe = taiXe;
    this.soXe = soXe;
    this.doanhThu = doanhThu;
  }

  // methods abstract
  public abstract void inThongTinChuyenXe();
}
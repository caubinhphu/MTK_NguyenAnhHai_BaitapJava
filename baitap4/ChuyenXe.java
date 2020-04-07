
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

  // methods
  public void inThongTinChuyenXe() {
    System.out.println("ma chuyen xe: " + this.maChuyen);
    System.out.println("ten tai xe: " + this.taiXe);
    System.out.println("so xe: " + this.soXe);
    System.out.printf("doanh thu: %.00f\n", this.doanhThu);
  };
}
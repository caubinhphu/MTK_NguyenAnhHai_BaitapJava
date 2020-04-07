
public class ChuyenXeNgoaiThanh extends ChuyenXe {
    // attributes
    public String noiDen;
    public int soNgay;
  
    // constructor
    public ChuyenXeNgoaiThanh(int maChuyen, String taiXe, String soXe, double doanhThu, String noiDen, int soNgay) {
      super(maChuyen, taiXe, soXe, doanhThu);
      this.noiDen = noiDen;
      this.soNgay = soNgay;
    }

    // methods
    // in thong tin chuyen xe
    @Override
    public void inThongTinChuyenXe() {
      System.out.println("ma chuyen xe: " + this.maChuyen);
      System.out.println("ten tai xe: " + this.taiXe);
      System.out.println("so xe: " + this.soXe);
      System.out.println("noi den: " + this.noiDen);
      System.out.println("so ngay: " + this.soNgay);
      System.out.printf("doanh thu: %.00f\n\n", this.doanhThu);
    }
}
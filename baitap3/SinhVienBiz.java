/**
 * SinhVienBiz
 */
public class SinhVienBiz extends SinhVienPoly {

  // attributes
  public double diemMarketing;
  public double diemSales;

  // constructor
  public SinhVienBiz(String hoTen, String nganhHoc, double diemMarketing, double diemSales) {
    super(hoTen, nganhHoc);
    this.diemMarketing = diemMarketing;
    this.diemSales = diemSales;
  }

  // defined abstract method
  @Override
  public double getDiem() {
    return (2 * this.diemMarketing + this.diemSales) / 3;
  };
}
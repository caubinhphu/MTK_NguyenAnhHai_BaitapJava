/**
 * SinhVIenIT
 */
public class SinhVienIT extends SinhVienPoly {

  // attributes
  public double diemJava;
  public double diemCss;
  public double diemHtml;

  // constructor
  public SinhVienIT(String hoTen, String nganhHoc, double diemJava, double diemCss, double diemHtml) {
    super(hoTen, nganhHoc);
    this.diemJava = diemJava;
    this.diemCss = diemCss;
    this.diemHtml = diemHtml;
  }

  // defined abstract method
  @Override
  public double getDiem() {
    return (2 * this.diemJava + this.diemHtml + this.diemCss) / 4;
  };
}
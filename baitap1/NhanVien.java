/**
 * NhanVien
 */
public class NhanVien {
  // attributes
  private String ten;
  private int tuoi;
  private String diaChi;
  private double tienLuong;
  private int tongGioLam;

  // constructor
  public NhanVien() {
    this.ten = "";
    this.tuoi = 0;
    this.diaChi = "";
    this.tienLuong = 0;
    this.tongGioLam = 0;
  }

  // getter, setter
  public void setTen(String ten) {
    this.ten = ten;
  }
  public String getTen() {
    return this.ten;
  }
  public void setTuoi(int tuoi) {
    this.tuoi = tuoi;
  }
  public int gettuoi() {
    return this.tuoi;
  }
  public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
  }
  public String getDiaChi() {
    return this.diaChi;
  }
  public void setTienLuong(double tienLuong) {
    this.tienLuong = tienLuong;
  }
  public double getTienLuong() {
    return this.tienLuong;
  }
  public void setTongGioLam(int tongGioLam) {
    this.tongGioLam = tongGioLam;
  }
  public int getTongGioLam() {
    return this.tongGioLam;
  }

  // methods
  // get thong tin nhan vien
  public String getThongTin() {
    return "Ten: " + this.ten + ", tuoi: " + this.tuoi + ", dia chi: " + this.diaChi
      + ", tien luong : " + this.tienLuong + ", tong gio lam: " + this.tongGioLam
      + ", tien thuong: " + tinhThuong();
  }

  // tinh luong nhan vien
  public double tinhThuong() {
    if (this.tongGioLam >= 200) {
      return this.tienLuong * 0.2;
    } else if (this.tongGioLam >= 100) {
      return this.tienLuong * 0.1;
    }
    return 0;
  }
}
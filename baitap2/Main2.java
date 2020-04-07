/**
 * Main2
 */
public class Main2 {

  public static void main(String[] args) {
    // create quan ly nhan vien object
    QuanLyNhanVien qlNhanVien = new QuanLyNhanVien();

    // create nhan vien
    NhanVien nv1 = new NhanVien();
    nv1.setTen("Nguyen Van A");
    nv1.setTuoi(20);
    nv1.setDiaChi("Nha Trang - Khanh Hoa");
    nv1.setTienLuong(10000000);
    nv1.setTongGioLam(100);

    NhanVien nv2 = new NhanVien();
    nv2.setTen("Nguyen Van B");
    nv2.setTuoi(21);
    nv2.setDiaChi("Nha Trang - Khanh Hoa");
    nv2.setTienLuong(20000000);
    nv2.setTongGioLam(200);

    NhanVien nv3 = new NhanVien();
    nv3.setTen("Nguyen Van C");
    nv3.setTuoi(22);
    nv3.setDiaChi("Nha Trang - Khanh Hoa");
    nv3.setTienLuong(18000000);
    nv3.setTongGioLam(200);

    NhanVien nv4 = new NhanVien();
    nv4.setTen("Nguyen Van D");
    nv4.setTuoi(23);
    nv4.setDiaChi("Tuy Hoa - Phu Yen");
    nv4.setTienLuong(25000000);
    nv4.setTongGioLam(300);

    NhanVien nv5 = new NhanVien();
    nv5.setTen("Nguyen Van E");
    nv5.setTuoi(24);
    nv5.setDiaChi("Nha Trang - Khanh Hoa");
    nv5.setTienLuong(150000000);
    nv5.setTongGioLam(100);

    // add nhan vien list vao qlNhanVien
    qlNhanVien.them(nv1);
    qlNhanVien.them(nv2);
    qlNhanVien.them(nv3);
    qlNhanVien.them(nv4);
    qlNhanVien.them(nv5);

    // in danh sach nhan vie
    qlNhanVien.inDS();
  }
}
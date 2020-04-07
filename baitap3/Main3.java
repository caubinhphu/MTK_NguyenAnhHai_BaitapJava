/**
 * Main3
 */
public class Main3 {

  public static void main(String[] args) {
    SinhVienIT it = new SinhVienIT("Nguyen Van A", "CNTT", 9, 10, 10);
    SinhVienBiz biz = new SinhVienBiz("Nguyen Van B", "Biz", 5, 6);
    it.xuat();
    System.out.println("diem: " + it.getDiem());
    System.out.println("hoc luc: " + it.getHocLuc());
    biz.xuat();
    System.out.println("diem: " + biz.getDiem());
    System.out.println("hoc luc: " + biz.getHocLuc());
  }
}
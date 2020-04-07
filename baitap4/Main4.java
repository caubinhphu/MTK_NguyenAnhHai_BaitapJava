// import java.util.ArrayList;

public class Main4 {
  public static void main(String[] args) {
    QuanLyChuyenXe qlChuyenXe = new QuanLyChuyenXe();

    ChuyenXe xeNoiThanh1 = new ChuyenXeNoiThanh(1, "Nguyen Van A", "79A-1234", 20000000, "Nha Trang - Cam Ranh", 40);
    ChuyenXe xeNoiThanh2 = new ChuyenXeNoiThanh(2, "Nguyen Van B", "79A-1235", 21000000, "Nha Trang - Cam Ranh", 41);
    ChuyenXe xeNoiThanh3 = new ChuyenXeNoiThanh(3, "Nguyen Van C", "79A-1236", 22000000, "Nha Trang - Ninh Hoa", 42);

    qlChuyenXe.themChuyenXe(xeNoiThanh1);
    qlChuyenXe.themChuyenXe(xeNoiThanh2);
    qlChuyenXe.themChuyenXe(xeNoiThanh3);

    ChuyenXe xeNgoaiThanh1 = new ChuyenXeNgoaiThanh(4, "Nguyen Van D", "79A-1237", 30000000, "Tuy Hoa - Phu Yen", 1);
    ChuyenXe xeNgoaiThanh2 = new ChuyenXeNgoaiThanh(5, "Nguyen Van E", "79A-1238", 31000000, "Phan Rang - Ninh Thuan", 1);
    ChuyenXe xeNgoaiThanh3 = new ChuyenXeNgoaiThanh(6, "Nguyen Van F", "79A-1239", 32000000, "Quy Nhon - Binh Dinh", 1);

    qlChuyenXe.themChuyenXe(xeNgoaiThanh1);
    qlChuyenXe.themChuyenXe(xeNgoaiThanh2);
    qlChuyenXe.themChuyenXe(xeNgoaiThanh3);

    qlChuyenXe.inThongTin();

    // tong doanh thu xe noi thanh
    System.out.printf("\nTong doanh thu xe noi thanh: %.00f\n" , qlChuyenXe.tongDoanhThuNoiThanh());

    // tong doanh thu xe ngoai thanh
    System.out.printf("Tong doanh thu xe ngoai thanh: %.00f\n", qlChuyenXe.tongDoanhThuNgoaiThanh());

    // tong doanh thu
    System.out.printf("Tong doanh thu: %.00f\n", qlChuyenXe.tongDoanhThu());

    // ArrayList<ChuyenXe> cxs = new ArrayList<>();
    // cxs = qlChuyenXe.xuatDsChuyenXe();
    // for (ChuyenXe cx : cxs) {
    //   System.out.println(cx instanceof ChuyenXeNoiThanh);
    // }
  }
}
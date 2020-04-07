# Mẫu thiết kế
## Tuần 2
### Bài tập: BaiTapJava
#### Sinh viên: Nguyễn Anh Hải (59130550) - 59CNTT2

**Bài tập 1:**

Viết class NhanVien gồm các thuộc tính:
  - Tên
  - Tuổi
  - Địa chỉ
  - Tiền lương (double)
  - Tổng sô giờ làm (int)

Constructor không tham số. Constructor đầy đủ các tham số. Các hàm get/set
Các phương thức:
- String getThongTin(): Trả về thông tin của nhân viên.
- double tinhThuong(): Tính toán và trả về số tiền thưởng của nhân viên theo
công thức:
  + Nếu tổng số giờ làm của nhân viên >=200 thì thưởng = lương * 20%.
  + Nếu tổng số giờ làm của nhân viên <200 và >=100 thì thưởng = lương * 10%.
  + Nếu tổng số giờ làm của nhân viên <100 thì thưởng =0.

Hàm main thực hiện nhiệm vụ sau:
- Khởi tạo hai biến nhân viên và in thông tin của nhân viên ra màn hình.

**Bài tập 2:**

Tiếp tục phát triển bài tập 1, khai báo interface IQuanLy gồm các phương thức:
- void them(NhanVien nv): thêm một nhân viên vào danh sách.
- void inDS() in danh sách nhân viên ra màn hình.

Lớp QuanLyNhanVien chứa danh sách các đối tượng NhanVien và thực thi giao diện IQuanLy.

Hàm main thực hiện nhiệm vụ sau đây:
- Khai báo và khởi tạo một đối tượng QuanLyNhanVien.
- Khởi tạo 5 nhân viên và thêm vào danh sách của lớp QuanLyNhanVien.
- In danh sách các nhân viên ra màn hình.

**Bài tập 3**

*Ẩn nội dung*

**Bài tập 4:**

Công ty du lịch V quản lý thông tin là các chuyến xe. Thông tin của 2 loại chuyến
xe:
- Chuyến xe nội thành: Mã số chuyến, Họ tên tài xế, số xe, số tuyến, số km đi
được, doanh thu.
- Chuyến xe ngoại thành: Mã số chuyến, Họ tên tài xế, số xe, nơi đến, số ngày đi
được, doanh thu.

Thực hiện các yêu cầu sau:
- Xây dựng các lớp với chức năng thừa kế.
- Viết lớp QuanLyChuyenXe (bao gồm cả nội thành và ngoại thành) với các chức năng
sau:
  - Thêm chuyến xe, xuất danh sách các chuyến xe (danh sách có thể dùng cấu trúc
  mảng), in thông tin từng chuyến xe.
  - Tính tổng doanh thu cho từng loại xe, tổng doanh thu cả hai loại xe.

Hàm main thực hiện các công việc:
- Khởi tạo các chuyến xe (3 ngoại thành, 3 nội thành)
- Thêm các chuyến xe đã khởi tạo vào đối tượng thuộc lớp QuanLyChuyenXe.
- In thông tin của từng chuyến xe.
- Tổng doanh thu của xe ngoại thành.
- Tổng doanh thu của xe nội thành.
- Tổng doanh thu của cả 2 loại xe.

Hướng dẫn:
- Viết lớp ChuyenXe
- Viết hai lớp XeNgoaiThanh, XeNoiThanh thừa kế từ lớp ChuyenXe.
- Lớp QuanLyChuyenXe sử dụng một ArrayList để quản lý các chuyến xe
+ phương thức tinhDoanhThuNoiThanh() duyệt qua từng thành phần trong
ArrayList, sử dụng toán tư instanceof để kiểm tra thành phần đó có phải là XeNoiThanh
hay khong.
/**
 * Hằng số cũng là một biến nhưng giá trị được khởi tạo ngay từ đầu không thay
 * đổi trong toàn bộ quá trình chạy chương trình dùng từ khóa final để khai báo
 * hằng số tên hằng số viết hoa toàn bộ ví dụ về hằng: như các tháng, các ngày
 * trong tháng
 */
public class constant {
    // Khai báo biến toàn cục với từ khóa: static
    public static final double PI = 3.14;
    public static final double YEAR = 2020;
    public static final String[] MONTH = { "Thang 1", "Thang 2", "Thang 3", "Thang 4", "Thang 5", "Thang 6", "Thang 7",
	    "Thang 8", "Thang 9", "Thang 10", "Thang 11", "Thang 12" };

    public static void main(String[] args) {
	for (String i : MONTH) {
	    System.out.println(i);
	}

	System.out.printf("Tháng đầu tiên trong năm là: %s \n ", MONTH[0]);
	// Gọi hàm sumFun
	sumFun();
    }

    public static void sumFun() {
	// Hàm void không thể return giá trị
	System.out.println(PI + YEAR);

    }
}

/**
 * @author dinhpv Xác định được kiểu dữ liệu của biến có thể khởi tạo giá trị
 *         cho biến ngay từ lúc khai báo
 */
public class variable {
    public static void main(String[] args) {
	// Trường hợp nhiều biến có cùng một kiểu dữ liệu thì có thể khai báo chung 1
	// dòng
	// Mỗi biến cách nhau bởi dấu phẩy
	int soA, soB, soC;
	long soD, soE;
	String name, location;
	soA = 50;
	soB = 30;
	soC = 10;
	soD = 1000000000;
	soE = 5555555;
	name = "Phạm Văn Đình";
	location = "Vũng Tàu";
	System.out.println(soA + soB + soC + soD + soE);
	System.out.println(name + " Sống tại: " + location);

	int kq = sum(12, 14);
	System.out.println(kq);
    }

    public static int sum(int a, int b) {
	return a + b;
    }

}

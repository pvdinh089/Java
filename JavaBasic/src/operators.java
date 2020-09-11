/*
 Toán tử số học và toán tử gán 
 - Toán tử số học: 
 	+ -> Toán tử cộng
 	- -> Toán tử trừ
 	* -> Toán tử nhân
 	/ -> Toán tử chia
 	% -> Chia lấy phần dư
 - Toán tử gán
 	= gán giá trị cho một biến
 	-= ví dụ: a -= 1; -> a = a -1;
 	+=
 	*=
 	/=
 	%=
 - Toán tử tăng giảm
 	++
 	--
 	lưu ý đến tiền tố hoặc hậu tố
 	++a tăng a lên 1 rồi mới thực hiện phép toán
 	a++ thực hiện phép toán xong mới tăng a lên 1
  */
public class operators {
	public static void main(String[] args) {
		int a = 100, b = 2, c = 3;
		System.out.println("Số b = " + b);
		System.out.println("Số c = " + c);
		System.out.println("Số a = " + a);

		b += ++a; // a được tăng lên 1 đơn vị trước khi thực hiện phép toán b = b +a
		System.out.println("Phép toán b += ++a b = " + b);
		System.out.println("Số a khi thực hiện tiền tố ++a: " + a);
		// Đến chỗ này a đang là 101

		c += a++; // Thực hiện phép toán c = c + a trước rồi mới tăng a
		System.out.println("Phép toán c += a++ c = " + c);
		System.out.println("Số a sau khi thực hiện phép toán: " + a);

		/*- Toán tử so sánh 
		> So sánh lớn hơn 
		< So sánh nhỏ hơn 
		== So sánh bằng 
		<= Nhỏ hơn hoặc bằng 
		>= Lớn hơn hoặc bằng Kết quả của toán tử so sánh luôn trả về Boolean 
		*/
		System.out.println("Sau tất cả a có nhỏ hơn b không? " + (a < b));

		/*- Toán tử Logic và toán tử 3 ngôi 
		- && and: trả về true nếu cả 2 biểu thức đều true 
		| hoặc: trả về true nếu 1 trong 2 biểu thức true 
		! phủ định: đảo ngược kết quả của 2 toán tử trên 
		- Toán tử 3 ngôi expression ? x : y Biểu thức kiểm tra ? trả về nếu đúng : trả về nếu sai
		*/
		System.out.println((a < b) | (b > c));
		String kq = (a > b) ? "Biểu thức này đúng" : "Biểu thức này sai";
		System.out.println(kq);
	}
}
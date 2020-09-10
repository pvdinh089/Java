/*
 Kiểu dữ liệu trong ngôn ngữ lập trình Java bao gồm 8 kiểu dữ liệu nguyên thuỷ
 - 4 kiểu số nguyên: int, short, long, byte
 - 2 kiểu số thực: float, double
 - char
 - boolean
 - Kiểu dữ liệu do người dùng tự định 
 */
public class dataType {
    public static void main(String[] args) {
	System.out.println("----------------------- ");
	System.out.println("1. KIỂU SỐ NGUYÊN ");
	System.out.printf("Type: %-10s Size: %-10s Min: %-20s Max: %-20s \n", Integer.TYPE, Integer.BYTES,
		Integer.MIN_VALUE, Integer.MAX_VALUE);
	System.out.printf("Type: %-10s Size: %-10s Min: %-20s Max: %-20s \n", Short.TYPE, Short.BYTES, Short.MIN_VALUE,
		Short.MAX_VALUE);
	System.out.printf("Type: %-10s Size: %-10s Min: %-20s Max: %-20s \n", Long.TYPE, Long.BYTES, Long.MIN_VALUE,
		Long.MAX_VALUE);
	System.out.printf("Type: %-10s Size: %-10s Min: %-20s Max: %-20s \n", Byte.TYPE, Byte.BYTES, Byte.MIN_VALUE,
		Byte.MAX_VALUE);
	System.out.println("----------------------- ");
	System.out.println("2. KIỂU SỐ THỰC: ");
	System.out.printf("Type: %-10s Size: %-10s Min: %-20s Max: %-20s \n", Float.TYPE, Float.BYTES, Float.MIN_VALUE,
		Float.MAX_VALUE);
	System.out.printf("Type: %-10s Size: %-10s Min: %-20s Max: %-20s \n", Double.TYPE, Double.BYTES,
		Double.MIN_VALUE, Double.MAX_VALUE);
	System.out.println("----------------------- ");
	System.out.println("3. KIỂU CHUỖI : ");
	System.out.printf("Type: %-10s Size: %-10s Min: %-20s Max: %-20s \n", Character.TYPE, Character.BYTES,
		Character.MIN_VALUE, Character.MAX_VALUE);
    }

}

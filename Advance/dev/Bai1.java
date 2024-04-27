package Advance.dev;

public class Bai1 {

	public static int deQuy(int n) {
		if (n <= 2) {
			return 1;
		} else {
			return deQuy(n - 1) + deQuy(n - 2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		int ketQua = deQuy(n);
		System.out.println("Gia tri cua F(" +n+") la: " + ketQua);
	}

}

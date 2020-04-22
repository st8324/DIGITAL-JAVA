package day4;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "홍길동";
		String str1 = new String("홍길동");
		String arr[] = new String[3];
		arr[0] = str;
		arr[1] = str1;
		arr[2] = "이순신";
		for(String s : arr) {
			System.out.println(s);
		}
	}
}

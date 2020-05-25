package day23;

public class OperatorEx2 {

	public static void main(String[] args) {
		int num = 10;
		int res = ++num + num++ + ++num;
		System.out.println(res);
		int [] arr = new int [10];
		int num2 = 5;
		int num3 = arr[num2++];//num3에 저장되는 값은 배열 arr의 몇번지인가? 5
	}
}

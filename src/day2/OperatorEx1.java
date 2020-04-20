package day2;

public class OperatorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10, num2=10;
		System.out.println("증가전 : num1 = " + num1 + 
				", num2 = " + num2);
		//아래 코드에서 동작은 콘솔에 값을 출력하는 것이다.
		System.out.println("증가중 : num1 = " + ++num1 + 
				", num2 = " + num2++);
		System.out.println("증가후 : num1 = " + num1 + 
				", num2 = " + num2);
		//아래 코드에서 동작은 저장하는 것(=)이다.
//		int x = ++num1;
//		int y = num2++;
		//아래코드에서 동작은 없다.
//		++num1;
//		num2++;
		System.out.println("-----------------------");
		System.out.println("증가전 : num1 = " + num1 + 
				", num2 = " + num2);
		++num1;
		System.out.println("증가중 : num1 = " + num1 + 
				", num2 = " + num2);
		++num2;
		System.out.println("증가후 : num1 = " + num1 + 
				", num2 = " + num2);
		System.out.println("-----------------------");
		System.out.println("증가전 : num1 = " + num1 + 
				", num2 = " + num2);
		num1++;
		System.out.println("증가중 : num1 = " + num1 + 
				", num2 = " + num2);
		num2++;
		System.out.println("증가후 : num1 = " + num1 + 
				", num2 = " + num2);
	}

}

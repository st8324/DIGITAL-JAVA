package day8;

public class OverloadEx1 {

	public static void main(String[] args) {
		//println 메서드 오버로딩 확인을 위한 예제
		System.out.println(5);		//public void println(int x)
		System.out.println('5');	//public void println(char x)
		System.out.println("5");	//public void println(String x)
		System.out.println(5.0f);	//public void println(float x)
		System.out.println(5.0);	//public void println(double x)
		System.out.println(false);	//public void println(boolean x)
		System.out.println(5L);		//public void println(long x)
		printString();
		printString("홍길동");
		printString("홍길동","임꺽정");
		printString("홍길동","임꺽정","이순신");
	}
	//매개변수를 가변인자로 하는 메서드 예제
	public static void printString(String...str) {
		for(String tmp : str) {
			System.out.print(tmp+" ");
		}
		System.out.println();
	}
}

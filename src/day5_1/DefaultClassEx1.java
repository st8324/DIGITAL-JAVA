package day5_1;
/* 클래스에 접근제한자 public이 붙는 조건
 *  - 파일명과 클래스 이름이 같은 경우에만 public을 붙을 수 있다.
 * */
public class DefaultClassEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("접근제한자 : public");
	}
}
/* DefaultClassEx2 클래스는 접근제한자가 default이므로 같은 패키지나 같은
 * 클래스에서 불러올 수 있다. 다른 패키지에서는 DefaultClassEx2를 불러올 수 없다.
 * */
class DefaultClassEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("접근제한자 : default");
	}
}

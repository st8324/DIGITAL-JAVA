package day10;

public class AbstractEx1 {

	public static void main(String[] args) {
		
	}

}
abstract class A{
	int a;
	public void print() {	System.out.println(a);	}
	public abstract void test(); 
}
class B extends A{

	@Override
	public void test() {
		
	}
}

package day13;

public class ObjectEx1 {

	public static void main(String[] args) {
		/* a1에서 만든 객체를 a2가 같이 공유한다.
		 * */
		System.out.println("----얕은 복사(clone) 예제-----");
		A a1 = new A();
		A a2 = a1;
		System.out.println(a1.num + "," + a2.num);
		a1.num = 20;
		System.out.println(a1.num + "," + a2.num);
		a2.num = 30;
		System.out.println(a1.num + "," + a2.num);
	
		try {
			A a3 = (A)a1.clone();
			a3.num = 40;
			System.out.println(a1.num + "," + a3.num);	
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("----깊은 복사(clone) 예제-----");
		B b1 = new B();
		b1.a = new A();
		b1.a.num = 10;
		B b2 = b1.clone();
		System.out.println(b1.a.num+","+b2.a.num);
		b2.a.num = 30;
		System.out.println(b1.a.num+","+b2.a.num);
		
		System.out.println("----equals 예제-----");
		A a4 = new A();
		A a5 = new A();
		System.out.println(a4.num+","+a5.num);
		System.out.println(a4.equals(a5));
		
		System.out.println("-----toString 예제-----");
		C c = new C();
		System.out.println(c);
	}
}
class A implements Cloneable{
	int num;

	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch(Exception e) {
			System.out.println("예외");
		}
		return obj;
	}
	public A() {}
	public A(int num) {
		this.num = num;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		if( !(obj instanceof A)) {
			return false;
		}
		A other = (A) obj;
		if (num != other.num)
			return false;
		return true;
	}
}
class B implements Cloneable{
	A a;
	@Override
	public B clone() {
		B obj = null;
		try {
			obj = (B)super.clone();
		}catch(Exception e) {
			System.out.println("예외");
		}
		if(obj instanceof B) {
			obj.a = new A(((B) obj).a.num);
		}
		return (B)obj;
	}
}
class C{
	int num1, num2, num3, num4, num5;

	@Override
	public String toString() {
		return "C [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + ", num4=" + num4 + ", num5=" + num5 + "]";
	}
}










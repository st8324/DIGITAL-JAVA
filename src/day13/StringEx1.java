package day13;

public class StringEx1 {

	public static void main(String[] args) {
		/* str1과 str2는 둘다 abc라는 문자열 리터럴을 저장하기 때문에 같은 주소를 가진다.
		 * (문자열 리터럴은 재사용을 하기 때문에)
		 * str2에 abc를 저장하기 전에 리터럴을 저장하는 메모리에 abc가 있는지 확인하여
		 * 있으면 새로 만들지 않고 재사용 한다. 그래서 str1에서 사용된 abc를 재사용하기 
		 * 때문에 str1과 str2의 주소는 같다.
		 * */
		String str1 = "abc";
		String str2 = "abc";//String str2 = str1;
		System.out.println(str1 == str2);
		String str3 = new String("abc");
		String str4 = new String("abc");
		str3 = str3.intern();
		str4 = str4.intern();
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		char []arr = new char[] {'a','b','c'};
		String str5 = new String(arr);
		System.out.println(str5.charAt(1));
		String str6 = "abcdabcd";
		String str7 = str6.replace("abc", "def");
		System.out.println(str6);
		System.out.println(str7);
		String str8 = str6.replaceAll("abc", "def");
		System.out.println(str6);
		System.out.println(str8);
		String str9 = "200101-3011111";
		String reg[] = str9.split("-");
		for(String tmp : reg) {
			System.out.println(tmp);
		}
		String str10 = "사과,배,오렌지";
		//reg에는 0번지에는 "사과", 1번지에는 "배", 2번지에는 "오렌지"가 저장
		reg = str10.split(",");
		for(String tmp : reg) {
			System.out.println(tmp);
		}
		System.out.println(str10.substring(1));
		//reg 배열에 저장된 각 문자여을 구분자 -를 기준으로 하나의 문자열로 만들어 준다.
		String str11 = String.join("-", reg);
		System.out.println(str11);
	}
}

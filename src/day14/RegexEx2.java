package day14;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexEx2 {

	public static void main(String[] args) {
		/* 아이디를 입력받고 아이디가 유효한 아이디인지 검사하는 코드를 작성하세요.
		 * 단, 정규표현식을 이용해야한다.
		 * 아이디의 조건
		 * 1. 알파벳 + 숫자
		 * 2. 첫글자 알파뱃
		 * 3. 5글자이상 10글자 이하
		 * 예)
		 * 아이디를 입력하세요 : 1abce
		 * 1abcd는 유효하지 않은 아이디입니다.
		 * 예)
		 * 아이디를 입력하세요 : abcde1
		 * abcde1은 유효한 아이디입니다.
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디를 입력하세요 : ");
		String id = scan.next();
		Pattern p = Pattern.compile("[a-zA-Z]\\w{4,9}");
		if(p.matcher(id).matches()) {
			System.out.println(id+"는 유효한 아이디입니다.");
		}else {
			System.out.println(id+"는 유효하지 않은 아이디입니다.");
		}
		scan.close();
	}

}

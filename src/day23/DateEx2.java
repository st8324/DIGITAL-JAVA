package day23;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateEx2 {

	/* p.545
	 * 날짜를 내가 지정한 형태의 문자열로 변환하는 코드 
	 * 2020년 5월 25일
	 * 2020-05-25*/
	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(format.format(today));
		format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		System.out.println(format.format(today));
	}
	
}

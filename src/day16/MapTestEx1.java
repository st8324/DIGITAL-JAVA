package day16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTestEx1 {

	/* id와 pw를 등록하고, id를 이용하여 pw를 검색하는 코드를 작성하세요.
	 * 예)
	 * 메뉴
	 * 1. 등록
	 * 2. 검색
	 * 3. 종료
	 * 메뉴를 선택하세요 : 1
	 * id : abcde
	 * pw: 1234
	 * 메뉴
	 * 1. 등록
	 * 2. 검색
	 * 3. 종료
	 * 메뉴를 선택하세요 : 2
	 * id : abcd
	 * abcd는 없는 아이디입니다.
	 * 메뉴
	 * 1. 등록
	 * 2. 검색
	 * 3. 종료
	 * 메뉴를 선택하세요 : 2
	 * id : abcde
	 * abcde의 pw는 1234입니다.
	 * 메뉴
	 * 1. 등록
	 * 2. 검색
	 * 3. 종료
	 * 메뉴를 선택하세요 : 3
	 * 종료합니다.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* Map 인터페이스를 이용하여 객체를 만들수는 없지만(new를 통해서) 
		 * Map 인터페이스를 구현한 HashMap을 이용하여 객체를 만들어서
		 * Map 인터페이스의 객체에 저장할 수 있다.*/
		Map<String,String> map = new HashMap<String,String>();
		int menu = 3;
		do {
			printMenu();
			menu = scan.nextInt();
			switch(menu) {
			case 1:	inputInfo(scan,map);	break;
			case 2:	searchInfo(scan,map);	break;
			case 3:	modifyInfo(scan, map);	break;
			case 4:	System.out.println("종료합니다.");	break;
			default:System.out.println("잘못된 메뉴입니다.");
			}
		}while(menu != 4);
	}
	public static void printMenu() {
		System.out.println("====메뉴====");
		System.out.println("1. 등록");
		System.out.println("2. 검색");
		System.out.println("3. 수정");
		System.out.println("4. 종료");
		System.out.println("==========");
		System.out.print("메뉴를 선택하세요 : ");
	}
	/* 기능 : 스캐너를 이용하여 id와 pw를 입력받아 map에 저장하는 메소드
	 * 매개변수 : 스캐너, map => Scanner scan, Map<String, String> map
	 * 리턴타입 : 없다 => void
	 * 메소드명 : inputInfo
	 * */
	public static void inputInfo(Scanner scan, Map<String, String> map) {
		System.out.print("ID : ");
		String id = scan.next();
		System.out.print("PW : ");
		String pw = scan.next();
		map.put(id, pw);
	}
	/* 기능 : 스캐너를 이용하여 id를 입력 받아 map에 해당 id와 일치하는 id가 있는지 확인하여
	 *      있으면 id와 비밀번호를 출력하고, 없으면 없다고 출력하는 메소드
	 * 매개변수 : 스캐너, map => Scanner scan, Map<String,String> map
	 * 리턴타입 : void
	 * 매소드명 : searchInfo
	 * */
	public static void searchInfo(Scanner scan, Map<String,String> map) {
		System.out.print("ID : ");
		String id = scan.next();
		String pw = map.get(id);
		if(pw == null) {
			System.out.println(id + "는 없는 아이디입니다.");
		}else {
			System.out.println(id + "의 비밀번호는 "+ pw +"입니다.");
		}
	}
	/* 기능 : 스캐너를 이용하여 id를 입력받고, map에서 id와 일치하는 정보가 있으면 비밀번호를 입력받아
	 *       수정하는 메소드
	 * 매개변수 : 스캐너, map => Scanner scan, Map<String,String> map
	 * 리턴타입 : 없음 => void
	 * 메소드명 : modifyInfo 
	 * */
	public static void modifyInfo(Scanner scan, Map<String,String> map) {
		System.out.print("ID : ");
		String id = scan.next();
		String pw = map.get(id);
		if(pw == null) {
			System.out.println(id + "는 없는 ID입니다.");
			return ;
		}
		System.out.print("PW(now) : ");
		String ipw = scan.next();
		System.out.print("PW(new) : ");
		String inewPw = scan.next();
		if(!pw.equals(ipw)) {
			System.out.println("비밀번호 수정에 실패했습니다.");
		}else {
			map.replace(id, inewPw);
			System.out.println("비밀번호를 수정했습니다.");
		}
	}
}

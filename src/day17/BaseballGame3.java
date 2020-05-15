package day17;

import java.util.*;

public class BaseballGame3{
	public static void main(String[] args) {
		BaseballGame.set(1, 20);
		BaseballGame.play();
	}
}

class BaseballGame {
	static int min = 1, max = 9;
	static int strike = 0, ball = 0;
	static int size = 3;
	static List<Integer>user = new ArrayList<Integer>();
	static List<Integer>com = new ArrayList<Integer>();
	
	public static void set(int min1, int max1) {
		min = min1;
		max = max1;
	}
	
	public static void play() {
		com = createRandomList();
		System.out.println(com);
		Scanner scan = new Scanner(System.in);
		while(strike != size) {
			//4-2. 정수 세개를 입력 받아 중복된 내용이 있으면 다시 입력받게 함
			user.clear();
			
			//중복된 숫자가 있는 경우
			if(!insertUser(scan)) {
				System.out.printf("입력한 숫자 중에 중복된 숫자가 있거나 입력된 숫자가 "
						+ "%d~%d사이의 숫자가 아닙니다.\n",min, max);
				continue;
			}
			System.out.println(user);
			//4-3. 스트라이크와 볼을 판별
			strike = 0;
			ball = 0;
			for(int i = 0; i < com.size(); i++) {
				//스트라이크의 갯수 판별
				if(com.get(i) == user.get(i)) {
					strike++;
				}
				//스트라이크 + 볼의 갯수 판별
				if(com.contains(user.get(i))){
					ball++;
				}
			}
			ball = ball-strike;
			//4-4. 판별한 스트라이크와 볼을 이용하여 출력
			if(strike != 0) {
				System.out.print(strike+"S ");
			}
			if(ball != 0) {
				System.out.print(ball+"B");
			}
			if(strike == 0 && ball == 0) {
				System.out.print("3O");
			}
			System.out.println();
		}
		System.out.println("정답입니다.");
		scan.close();
	}
	public static int random(int min, int max) {
		if(max < min)
			throw new ArithmeticException("예외 발생 : 최대값과 최소값 순서가 바뀌었습니다.");
		return new Random().nextInt(max-min+1)+min;
	}
	private static int random() {
		if(max < min)
			throw new ArithmeticException("예외 발생 : 최대값과 최소값 순서가 바뀌었습니다.");
		return new Random().nextInt(max-min+1)+min;
	}
	/* 기능 : min에서 max사이의 랜덤한 수를 중복되지 않게 size개 만큼 리스트에 저장하여 반환하는 메소드 
	 * 매개변수 : 갯수 ,최소값,최대값=> int size, int min, int max
	 * 리턴타입 : 랜덤한 수가 저장된 리스트 => List<Integer>
	 * 메소드명 : createRandomList
	 * */
	public static List<Integer> createRandomList(){
		if(size > max-min+1)
			throw new ArithmeticException("예외발생 : 랜덤 범위보다 만들어야 하는 갯수가 더 많습니다.");
		List<Integer> list = new ArrayList<Integer>();
		while(list.size() < size) {
			int r = random();
			if(!list.contains(r)) {
				list.add(r);
			}
		}
		return list;
	}
	/* 기능 : 스캐너를 통해 정수를 size개 입력받아 입력받은 정수가 min~max사이이고 중복되지 않으면 리스트에 
	 *      저장한 후 리스트 생성 여부를 알려주는 메소드
	 * 매개변수 : 스캐너, 최소값, 최대값, 리스트, 갯수 => Scanner scan, int min, int max,
	 *                                     List<Integer> user,int size
	 * 리턴타입 : boolean
	 * 메소드명 : insertUser
	 * */
	private static boolean insertUser(Scanner scan) {
		int i=0;
		System.out.print("중복되지 않은 숫자 "+size+"개를 입력하세요("+min+"~"+max+") : ");
		while(i++ < size) {
			user.add(scan.nextInt());
		}
		i=0;
		List<Integer> tmpList = new ArrayList<Integer>();
		while(user.size() != 0) {
			int tmp = user.remove(0);
			//입력된 수가 min보다 작거나 max 크거나 중복이 되면
			if(tmp < min || tmp > max || user.contains(tmp)) {
				return false;
			}
			tmpList.add(tmp);
		}
		//user = tmpList;//이렇게 작성하면 원본에 tmpList값이 추가되지 않음
		user.addAll(tmpList);
		return true;
	}
}


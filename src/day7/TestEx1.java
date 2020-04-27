package day7;

public class TestEx1 {

	public static void main(String[] args) {
		int size = 3;
		int com[] = new int [size];
		int min = 1, max = 9;
		createArray(min, max, size, com);
		printArray(com);
		//반복시작(3S)
		//사용자가 세 수를 입력
		
		//스트라이크 판별
		
		//볼을 판별
		
		//3아웃 판별
		//반복끝
	}
	/* 기능 : min에서 max사이의 중복되지 않는 n개의 랜덤값을 생성하여 배열에 저장하는 메서드
	 * 매개변수 : min에서 max, n개, 배열 => int min, int max, int n, int []arr
	 * 리턴타입 : 예외처리를 위해 true이면 배열 생성
	 * 			false이면 배열생성 실패 => boolean
	 * 메서드명 : createArray
	 * 예를 들면 min=1,max=3인고, n=4인 경우 min~max사이의 중복되지 않은 랜덤한 수는 총 3개인데
	 * 4개를 만들어야 하니 1개를 만들수가 없어서 무한루프에 빠진다.
	 * 번지 0 1 2 3
	 * 값    1 3 2  
	 * r  1 3 1 3 1 2
	 * max - min + 1 >= n이면 배열 생성 가능, 아니면 배열 생성 실패 
	 * */
	public static boolean createArray(int min, int max, int n, int []arr) {
		if(arr == null)
			return false;
		if(max - min + 1 < n)
			return false;
		int cnt = 0;//현재 배열에 저장된 원소의 갯수
		while(cnt < n) {
			int r = random(min, max);
			if(!isDuplicated(arr, r)) {
				//arr[cnt++] = r;//아래 두줄을 합친 코드
				arr[cnt] = r;
				cnt++;
			}
		}
		return true;
	}
	
	
	public static int random(int min, int max) {
		//1,9로 알려줘야하는데 9,1로 알려준 경우 1,9로 처리하기 위해 두 수를 교환
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max - min + 1) + min);
	}
	public static void printArray(int []arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static boolean isDuplicated(int []arr, int num) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
}

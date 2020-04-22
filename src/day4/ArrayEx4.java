package day4;

public class ArrayEx4 {

	public static void main(String[] args) {
		//배열에 임의의 수 넣는 예제
		int arr[] = new int [7];
		int max = 45;
		int min = 1;
		//임의의 수를 생성하여 배열에 저장(중복 가능)
		for(int i=0; i<arr.length; i++) {
			int random = (int)(Math.random()*(max-min+1)) + min;
			arr[i] = random;
		}
		for(int tmp:arr) {
			System.out.print(tmp + " ");
		}
		//임의의 수를 생성하여 배열에 저장(중복 X)
		int cnt = 0;//배열에 저장된 랜덤수의 갯수
		int []arr2 = new int[7];
		while(cnt < arr2.length) {
			//생성된 랜덤수 random: 	1 1 2 9
			//배열에저장된갯수 cnt: 	3
			//저장된 배열의 값 arr2: 	1 2 9
			int random = (int)(Math.random()*(max-min+1)) + min;
			int i = 0;
			while(i<cnt) {
				if(random == arr2[i]) {
					break;
				}
				i++;
			}
			if(i == cnt) {
				arr2[cnt] = random;
				cnt++;
			}
		}
		System.out.println();
		for(int tmp:arr2) {
			System.out.print(tmp + " ");
		}
	}
}

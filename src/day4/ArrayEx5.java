package day4;

public class ArrayEx5 {

	public static void main(String[] args) {
		/* 배열의 내용을 정렬하는 예제 */
		int arr[] = new int[10];
		int rMin = 1;
		int rMax = 100;

		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*(rMax-rMin+1))+rMin;
		}
		for(int tmp:arr) {
			System.out.printf("%3d ",tmp);
		}
		System.out.println();
		// 37   5  14   2  41  15  31  42  85  51 
		//  5  14   2  37  15  31  41  42  51  85
		//  5   2  14  15  31  37  41  42  51  85
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		for(int tmp:arr) {
			System.out.printf("%3d ",tmp);
		}
		System.out.println();
	}

}

package day4;

public class TestEx3 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		int rMin = 1;
		int rMax = 100;
		int min, max;
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*(rMax-rMin+1))+rMin;
		}
		for(int tmp:arr) {
			System.out.printf("%d ",tmp);
		}
		System.out.println();
		min = max = arr[0]; 
		for(int i = 1; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.printf("배열의 최대값 : %d, 최소값 : %d\n",max,min);
	}

}

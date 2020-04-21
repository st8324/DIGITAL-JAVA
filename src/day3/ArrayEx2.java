package day3;

public class ArrayEx2 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		num1 = num2;
		System.out.println(num1);
		int arr1[] = new int[] {1,2,3,4};
		int arr2[] = new int[] {9,8,7,6};
		//arr2[0] = 1;
		/* 아래 코드가 실행되면 arr2가 만든 배열을 arr1과 arr2가 공유하게 됨
		 * arr1에 있던 배열이 사라짐
		 * */
		//arr1 = arr2;
		for(int i=0; i<arr1.length; i++) {
			//arr1[i] = arr2[i];
			int tmp = arr1[i];
			arr1[i] = arr2[i];
			arr2[i] = tmp;
		}
		for(int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for(int i=0; i<arr2.length;i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		System.out.println("---------------------------");
		//System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		System.arraycopy(arr1, 1, arr2, 0, arr1.length-1);
		for(int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for(int i=0; i<arr2.length;i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}

}

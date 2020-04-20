package day2;

public class IfEx1 {

	public static void main(String[] args) {
		// if문 예제1
		int num = 4;
		if(num % 2 == 0 ){
			System.out.println(num+"는 짝수");
		}
		if(num % 2 == 1 ){ //if(num % 2 != 0 ){
			System.out.println(num+"는 홀수");
		}
		//if else문 예제
		if(num % 2 == 0 ){
			System.out.println(num+"는 짝수");
		}else{ 
			System.out.println(num+"는 홀수");
		}
		//if else if문 예제
		if(num % 2 == 0 ){
			System.out.println(num+"는 짝수");
		}else if(num % 2 == 1){ 
			System.out.println(num+"는 홀수");
		}
	}

}

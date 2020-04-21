package day3;

public class FoxEx9 {

	public static void main(String[] args) {
		/* *****	i=1 *=5
		 * *****	i=2 *=5
		 * *****	i=3 *=5
		 * *****	i=4 *=5
		 * *****	i=5 *=5
		 * */
		for(int i = 1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/* *		i=1 *=1
		 * **		i=2 *=2
		 * ***		i=3 *=3
		 * ****		i=4 *=4
		 * *****	i=5 *=5
		 * 				*=i
		 * */
		for(int i = 1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*     *	i=1 공=4 *=1
		 *    **	i=2 공=3 *=2
		 *   ***	i=3 공=2 *=3
		 *  ****	i=4 공=1 *=4
		 * *****	i=5 공=0 *=5
		 * 			      공=5-i*=i
		 * */
		for(int i = 1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

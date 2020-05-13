package day15;

import java.util.*;

public class SetEx1 {

	public static void main(String[] args) {
		/* 중복되지 않은 랜덤한 수를 저장하는 코드 */
		HashSet<Integer> hs = new HashSet<Integer>();
		int size = 3;
		int min = 1, max = 9;
		while(hs.size() < size) {
			int random = new Random().nextInt(max-min) + min;
			System.out.print(random + " ");
			hs.add(random);
		}
		System.out.println();
		for(Integer tmp : hs) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		System.out.println("==============");
		HashSet<Num3> hs2 = new HashSet<Num3>();
		hs2.add(new Num3(1));
		hs2.add(new Num3(1));
		for(Num3 tmp : hs2) {
			System.out.print(tmp + " ");
		}
		System.out.println();
	}
}
class Num3{
	int num;
	public Num3() {}
	public Num3(int num) {this.num = num;}
	@Override
	public String toString() {
		return "Num3 [num=" + num + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Num3 other = (Num3) obj;
		if (num != other.num)
			return false;
		return true;
	}
	
}

package day54;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex5 {
	
	public static void main(String[]args) {
		// - 앞에서 만든 Point 클래스를 이용하여 점 하나가 (0,0)->(0,1)->(1,1)->(2,1) 로 이동한 경로를 저장하는 코드를 컬렉션 프레임워크를 이용하여 작성하세요.
		ArrayList<Point> list = new ArrayList<Point>();
		Point p = new Point();
		list.add(new Point(p));
		p.move(0, 1);
		list.add(new Point(p));
		p.move(1, 1);
		list.add(new Point(p));
		p.move(2, 1);
		list.add(new Point(p));
		Iterator<Point> it = list.iterator();
		while(it.hasNext()) {
			it.next().print();
		}
	}
}

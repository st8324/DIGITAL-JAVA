package day54;

public class Ex1 {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.print();
		System.out.println(p1.distance(3, 4));
		p1.move(3, 4);
		p1.print();
	}

}

class Point{
	private int x;
	private int y;
	
	//getter와 setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Point() {}
	public Point(Point p) {
		x = p.x;
		y = p.y;
	}
	
	public void print() {
		System.out.println(x+","+y);
	}
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public double distance(int x, int y) {
		double res = 0;
		int disX = this.x - x;//x2 - x1
		int disY = this.y - y;//y2 - y1
		res = Math.pow(disX, 2.0) + Math.pow(disY, 2.0);// (x2-x1)^2 + (y2-y1)^2
		res = Math.sqrt(res);//루트 (x2-x1)^2 + (y2-y1)^2
		return res;
	}
}
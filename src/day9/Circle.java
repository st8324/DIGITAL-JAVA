package day9;

public class Circle extends Shape {
	private double centerX, centerY;
	private static int circleCount;
	
	public static void printCount() {
		System.out.println("현재까지 만들어진 원의 갯수 : " + circleCount);
	}
	public void print() {
		System.out.println("-------원의 정보--------");
		System.out.printf("중심점 : (%.1f,%.1f)\n",centerX,centerY);
		System.out.printf("반지름 : %.2f\n",getRadius());
		System.out.println("----------------------");
	}
	public Circle() {	circleCount++;	}
	public Circle(int left,int up, double radius) {
		super(left, up, radius*2, radius*2);
		centerX = left + radius;
		centerY = up - radius;
		circleCount++;
		/*setLeft(left);
		setUp(up);
		setWidth(radius*2);
		setHeight(radius*2);
		*/
	}
	public void move(int left, int up) {
		super.move(left, up);
		centerX = left + getRadius();
		centerY = up - getRadius();
	}
	public void resize(double radius) {
		resize(2*radius, 2*radius);
		centerX = getLeft() + radius;
		centerY = getUp() - radius;
	}
	public double getRadius() {
		return getWidth() / 2;
	}
}

package day9;

public class Shape{
	private int left;//시작점의 x 좌표
	private int up;//시작점의 y 좌표
	private double width;	//가로의 길이
	private double height;	//세로의 길이
	private static int count;
	public static void printCount() {
		System.out.println("현재까지 만들어진 도형의 갯수 : " + count);
	}
	public void print() {
		System.out.println("------도형의 정보--------");
		System.out.printf("시작점 : (%d,%d)\n",left,up);
		System.out.printf("가로 : %.2f\n",width);
		System.out.printf("세로 : %.2f\n",height);
		System.out.println("----------------------");
	}
	public Shape() {	count++; }
	public Shape(int left, int up, double width, double height) {
		this.left = left;
		this.up = up;
		this.width = width;
		this.height = height;
		count++;
	}
	public void move(int left, int up) {
		this.left = left;
		this.up = up;
	}
	public void resize(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getUp() {
		return up;
	}
	public void setUp(int up) {
		this.up = up;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
}







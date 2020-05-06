package day10;

public class PolymorphismEx2 {

	public static void main(String[] args) {
		/* 제조사의 종류와 상관없이 10개짜리 배열에 차량을 관리 할 수 있다.
		 * */
		/*
		Car [] arr = new Car[10];//입고된 차량을 관리하기 위한 배열
		arr[0] = new KiaCar();
		arr[1] = new HyundaiCar();
		*/
		/* 제조사가 추가되면 해당 제조사를 관리하기 위한 배열을 추가로 만들어서 관리해야한다. */
		/*KiaCar karr[] = new KiaCar[10];
		HyundaiCar harr[] = new HyundaiCar[10];
		karr[0] = new KiaCar();
		harr[0] = new HyundaiCar();
		*/
		Car arr[] = new Car[10];
		arr[0] = new KiaCar("모닝");
		arr[1] = new KiaCar("K3");
		arr[2] = new KiaCar("쏘울");
		arr[3] = new HyundaiCar("아반떼");
		arr[4] = new HyundaiCar("쏘나타");
		arr[5] = new HyundaiCar("그랜저");
		showCar(arr);
	}
	public static void showCar(Car []arr) {
		System.out.println("--입고된 차량 리스트--");
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] != null) {
				if(arr[i] instanceof KiaCar){
					System.out.println(arr[i].manufacturer+" : " + arr[i].name
						+" : "+((KiaCar)arr[i]).kia);
				}
				if(arr[i] instanceof HyundaiCar){
					System.out.println(arr[i].manufacturer+" : " + arr[i].name
						+" : "+((HyundaiCar)arr[i]).h);
				}
			}
		}
	}
}
class Car{
	int wheel;
	String type;
	String manufacturer;
	String name;
	public Car() {}
	public Car(String manufacturer, String name) {
		this.manufacturer = manufacturer;
		this.name = name;
	}
}
class KiaCar extends Car{
	String kia = "기아찹니다.";
	public KiaCar() {	manufacturer="kia";	}
	public KiaCar(String name) {
		super("kia",name);
	}
}
class HyundaiCar extends Car{
	String h = "현대찹니다.";
	public HyundaiCar() {	manufacturer="hyundai";	}
	public HyundaiCar(String name) {
		super("hyundai",name);
	}
}

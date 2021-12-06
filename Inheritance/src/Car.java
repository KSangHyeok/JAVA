
public class Car {
	Tire[] tires= {
			new Tire(6,"앞왼쪽"),
			new Tire(2,"앞오른쪽"),
			new Tire(3,"뒤왼쪽"),
			new Tire(4,"뒤오른쪽")
	};
//	Tire frontLeft;
//	Tire frontRight;
//	Tire backLeft;
//	Tire backRight;
	
	public Car() {		
//		frontLeft = new Tire(6,"앞왼쪽");
//		frontRight = new Tire(2,"앞오른쪽");
//		backLeft = new Tire(3,"뒤왼쪽");
//		backRight = new Tire(4,"뒤오른쪽");
//		
	}
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	int run() {
		System.out.println("자동차가 달립니다.");
		for(int i=0;i<tires.length;i++) {
			if(!tires[i].roll()) {stop(); return i+1;}
		}
//		if(!tires[0].roll()) {stop(); return 1;}
//		if(!tires[1].roll()) {stop(); return 2;}
//		if(!tires[2].roll()) {stop(); return 3;}
//		if(!tires[3].roll()) {stop(); return 4;}
		return 0;
	}
	
//	String company;
//	String model;
//	String color;
//	int nMaxSpeed;
//	int nSpeed;	
//	
//	public Car() {		
//		this.color="green";
//	}
//	public Car(String company, String model, String color, int nMaxSpeed, int nSpeed) {
//		super();
//		this.company = company;
//		this.model = model;
//		this.color = color;
//		this.nMaxSpeed = nMaxSpeed;
//		this.nSpeed = nSpeed;
//	}
//	void drive(int speed) {
//		this.nMaxSpeed=speed;
//	}
//	void stop() {
//		this.nSpeed=0;
//	}
//	
}

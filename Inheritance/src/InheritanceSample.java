
public class InheritanceSample {

	public static void main(String[] args) {
		Car car= new Car();
		
		for(int i=0;i<5;i++) {
			int punk=car.run();
			switch(punk) {
			case 1: //�տ���
				System.out.println("�տ��� �ѱ�Ÿ�̾�� ��ü");
				car.tires[punk-1]=new HankookTire(15,"�տ���");
				break;
			case 2: //�տ�����
				System.out.println("�տ����� ��ȣŸ�̾�� ��ü");
				car.tires[punk-1]=new KumhoTire(13,"�տ�����");
				break;
			case 3: //�ڿ���
				System.out.println("�ڿ��� �ѱ�Ÿ�̾�� ��ü");
				car.tires[punk-1]=new HankookTire(14,"�ڿ���");
				break;
			case 4: //�ڿ�����
				System.out.println("�ڿ��� ��ȣŸ�̾�� ��ü");
				car.tires[punk-1]=new KumhoTire(17,"�ڿ���");
				break;
			}
			System.out.println("----------------------------------");
		}
//		Truck scania=new Truck();
//		
//		System.out.println(scania.color);
//		scania.company="Volvo";
//		scania.color="brown";
//		scania.model="XXXXXX";
//		scania.nMaxSpeed=120;
//		
//		scania.drive(40);
//		System.out.println("current speed: "+scania.nMaxSpeed);
//		scania.stop();
//		
//		Limousine alpha=new Limousine();
//		alpha.company="Ford";
//		alpha.color="white";
//		alpha.model="Ford Alpha One";
//		alpha.nMaxSpeed=220;
//		alpha.nSpeed=0;
//		alpha.drive(60);
//		alpha.stop();
//		
//		Car avante=new Car();
//		avante.company="Hyundai";
//		avante.color="black";
//		avante.model="Avante N";
//		avante.nMaxSpeed=280;
//		avante.nSpeed=0;
//		avante.drive(80);
//		avante.stop();
	}

}

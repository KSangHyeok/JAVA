
public class Battle {


	public static void main(String[] args) {
		Soldier commando=new Soldier(12,150);
		Warrior conan=new Warrior(15,120);
		
		System.out.println("War started.");
		while(commando.getHP()>0 &&
				conan.getHP()>0) {				
			try {				
				int A=(int)(Math.random()*2);//0과1 둘중에 하나를 랜덤발생시키는 코드
				if(A==0) {
				commando.attack(conan);
				Thread.sleep(500);
				System.out.println("---------------");
				}else {
				conan.attack(commando);
				Thread.sleep(500);
				System.out.println("---------------");
				}
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}		
		}
		if(commando.getHP()>0) {
			System.out.println("승자 : commando");
			System.out.println("남은 피"+commando.getHP());
		}else {
			System.out.println("승자 : conan");
			System.out.println("남은 피"+conan.getHP());
		}
	}

}


public class Battle {


	public static void main(String[] args) {
		Soldier commando=new Soldier(12,150);
		Warrior conan=new Warrior(15,120);
		
		System.out.println("War started.");
		while(commando.getHP()>0 &&
				conan.getHP()>0) {				
			try {				
				int A=(int)(Math.random()*2);//0��1 ���߿� �ϳ��� �����߻���Ű�� �ڵ�
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
			System.out.println("���� : commando");
			System.out.println("���� ��"+commando.getHP());
		}else {
			System.out.println("���� : conan");
			System.out.println("���� ��"+conan.getHP());
		}
	}

}

import java.util.ArrayList;
import java.util.Scanner;

public class CafeControl {

	public static void main(String[] args) {			
		Menu menu=new Menu();	
		Order order=new Order();
//		menu.display();		
		//z
		System.out.println("���α׷�����");		
		System.out.println("X:����,M:�޴�����,O:�ֹ�����,S:��������");	
		String str;		
		Scanner s=new Scanner(System.in);			
		str=s.nextLine();		
		while(str.equals("X")==false) {				
			if(str.equals("M")) {
				menu.Handling();
			}else if(str.equals("O")) {
				System.out.println("�ֹ�����");
				order.Handling(menu);
			}else if(str.equals("S")) {
				System.out.println("��������");
				order.display();
				str=s.nextLine();
			}else {			
				System.out.println("M:�޴�����,O:�ֹ�����,S:��������");
				str=s.nextLine();
			}
		}		
			System.out.println("���α׷�����");			
		}
	}




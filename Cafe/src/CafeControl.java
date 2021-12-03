import java.util.ArrayList;
import java.util.Scanner;

public class CafeControl {

	public static void main(String[] args) {			
		Menu menu=new Menu();	
		Order order=new Order();
//		menu.display();		
		//z
		System.out.println("橇肺弊伐矫累");		
		System.out.println("X:辆丰,M:皋春包府,O:林巩包府,S:角利包府");	
		String str;		
		Scanner s=new Scanner(System.in);			
		str=s.nextLine();		
		while(str.equals("X")==false) {				
			if(str.equals("M")) {
				menu.Handling();
			}else if(str.equals("O")) {
				System.out.println("林巩包府");
				order.Handling(menu);
			}else if(str.equals("S")) {
				System.out.println("角利包府");
				order.display();
				str=s.nextLine();
			}else {			
				System.out.println("M:皋春包府,O:林巩包府,S:角利包府");
				str=s.nextLine();
			}
		}		
			System.out.println("橇肺弊伐辆丰");			
		}
	}




import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {     
   private ArrayList<String> alMenu; 
   private ArrayList<Integer> alPrice;  
   
   public String getAlMenu(int ndx) {
	   return this.alMenu.get(ndx);
   }
   public int getAlPrice(int ndx) {
	   return this.alPrice.get(ndx);
   }
   public Menu() {
   this.alMenu=new ArrayList<String>();
   this.alPrice=new ArrayList<Integer>();
   File f = new File("D:\\JAVA\\Java txt\\menu.txt");
   try {
      FileReader fr = new FileReader(f);
      BufferedReader br = new BufferedReader(fr);
      try {
         String line=br.readLine();
         while(line!=null) {
            String[]ar=line.split(",");
            this.alMenu.add(ar[0]);
            this.alPrice.add(Integer.parseInt(ar[1]));
            line=br.readLine();
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
   } catch (FileNotFoundException e) {
      e.printStackTrace();
   }
   }

    private void SaveMenu() {
        File f= new File("D:\\JAVA\\Java txt\\menu.txt");  
        
        try {
           FileWriter fw = new FileWriter(f);
           PrintWriter pw = new PrintWriter(fw);   
           for(int i=0; i<this.alMenu.size(); i++) {
              pw.print(this.alMenu.get(i)+","+this.alPrice.get(i)+"\n");
           }
           pw.close();
        } catch (IOException e) {
           
           e.printStackTrace();
        }
     }     
	void display(){
		for(int i=0;i<this.alMenu.size();i++) {			
			System.out.println((i+1)+"�޴�:"+this.alMenu.get(i)+",����:"+this.alPrice.get(i));			
		}
		this.guide();
	}
	private void guide() {
		System.out.println("�޴�����(X:����,C:�޴��߰�,U:�޴�����,D:�޴�����)");
	}
	private void add(String menu, int price) {
		this.alMenu.add(menu);
		this.alPrice.add(price);
		this.SaveMenu();
	}
	private void update(int menu_num,String menu,int price) {
		this.alMenu.set(menu_num,menu);
		this.alPrice.set(menu_num,price);
		System.out.println("�����Ϸ�");
		this.display();
		this.SaveMenu();
	}
	private void remove(int menu_num) {
		this.alMenu.remove(menu_num);
		this.alPrice.remove(menu_num);	
		this.SaveMenu();
	}
	public void Handling() {		
		Scanner s=new Scanner(System.in);	
		this.display();			
		String str;
		String str1=s.nextLine();				
		while(str1.equals("X")==false) {
			if(str1.equals("C")) {
				System.out.println("�޴��߰�");
				Scanner ms=new Scanner(System.in);						
				System.out.println("�޴����� �Է��ϼ���");
				String str2=ms.nextLine();
				System.out.println("������ �Է��ϼ���");
				int num=Integer.parseInt(ms.nextLine());
				this.add(str2,num);
			}else if(str1.equals("U")) {
				System.out.println("�޴�����");
				Scanner ms=new Scanner(System.in);						
				this.display();
				System.out.println("������ �޴���ȣ�� �Է��Ͻÿ�.");
				int k=Integer.parseInt(ms.nextLine());
				System.out.println("������ �޴��� �Է��Ͻÿ�.");
				String new_name=ms.nextLine();
				System.out.println("������ ������ �Է��Ͻÿ�.");						
				int new_Price=Integer.parseInt(ms.nextLine());					
				this.update(k-1,new_name,new_Price);										
				str1=s.nextLine();
			}else if(str1.equals("D")) {
				System.out.println("�޴�����");
				Scanner ms=new Scanner(System.in);	
				System.out.println("���� �� �޴���ȣ�� �Է��Ͻÿ�.");
				int de=Integer.parseInt(ms.nextLine());												
				this.remove(de-1);				
			}
			this.display();					
			str1=s.nextLine();					
		}	
		System.out.println("�޴����� ����");
//		System.out.println("X:����,M:�޴�����,O:�ֹ�����,S:��������");	
//		str=s.nextLine();
	}	
}
		
//		this.sum1(new int[]{2000,3000,2500,4000});
//		this.sum1(new int[] {2000,4000,2000,2500,3500,4000,2000});
//	}	
//	int sum1(int[] values) {
//		int total=0;
//		for(int i=0;i<values.length;i++) {
//			total+=values[i];
//		}
//		return total;
//	}
//	int sum2(int ... values) {
//		int total=0;
//		for(int i=0;i<values.length;i++) {
//			total+=values[i];
//		}
//		return total;
//	}


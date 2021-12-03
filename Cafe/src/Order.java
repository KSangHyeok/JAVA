import java.util.ArrayList;
import java.util.Scanner;

public class Order {	
	//�����(mobile),�޴���(name),����(qty),�Ѿ�(sum)
	//�߹��߰� (add) <=�޴���,���� - �Ѿ� �ڵ����
	//�߹����� (remove) <=�ֹ���ȣ
	//�ֹ����� (update) <=�ֹ���ȣ,�޴���,���� - �Ѿ� �ڵ����
	//�ֹ�ǥ�� (display) <-��ü �ֹ���� ���
	ArrayList<String> alMenu;	
	ArrayList<Integer> alQty;
	ArrayList<String> alMobile;
	ArrayList<Integer> alSum;
	public Order(){
		this.alMenu=new ArrayList<String>();
		this.alMobile=new ArrayList<String>();
		this.alQty=new ArrayList<Integer>();
		this.alSum=new ArrayList<Integer>();
	}	
	private void add(String menu,int qty,int price) {		
		this.alMenu.add(menu);
		this.alQty.add(qty);
		this.alSum.add(price*qty);
	}
	private void mobile(String mobile) {
		this.alMobile.add(mobile);
		for(int i=this.alMobile.size();i<this.alMenu.size();i++) {			
			System.out.println("����Ϲ�ȣ"+this.alMobile.get(i)+
				"�޴�:"+this.alMenu.get(i)+",����:"+this.alQty.get(i)+"����"+this.alSum.get(i));}
	}
	private void update(int num,String mobile,String name,int qty) {
		num--;
		this.alMobile.set(num,mobile);
		this.alMenu.set(num, name);
		this.alQty.set(num, qty);		
	}
	private void Mupdate(int num,String name) {
		this.alMenu.set(num, name);
	}
	private void Nupdate(int num,int qty) {
		this.alQty.set(num, qty);
	}
	private void mupdate(int num,String mobile) {
		this.alMenu.set(num,mobile);
	}
	private void remove(int num) {
		num--;
		this.alMobile.remove(num);
		this.alMenu.remove(num);
		this.alQty.remove(num);	
		this.alSum.remove(num);
	}
	public void display() {
		for(int i=0;i<this.alMenu.size();i++) {			
			System.out.println(/*+this.alMobile.get(i)*/
					(i+1)+"�޴�:"+this.alMenu.get(i)+",����:"+this.alQty.get(i)+"����"+this.alSum.get(i));			
		}
	}
	void total() {
		int A;
		A=0;
		for(int i=0;i<this.alSum.size();i++) {			
			A=this.alSum.get(i);					
			A+=A;		}
		System.out.println("�Ѿ�:"+A);
	}
	void Handling(Menu menu) {			
		menu.display();						
		System.out.println("�ֹ�:O,R:�ֹ�����,D:�ֹ�����,���:X");
		Scanner s=new Scanner(System.in);
		String name=s.nextLine();
		while(name.equals("X")==false) {
			if(name.equals("O")) {
				Scanner s1=new Scanner(System.in);
				System.out.println("�ֹ��� �޴���ȣ�� �Է��Ͻÿ�.");		
				int num=Integer.parseInt(s1.nextLine());
				num=num-1;
				System.out.println("�޴� ������ �Է��Ͻÿ�.");
				int qty=Integer.parseInt(s1.nextLine());
				this.add(menu.getAlMenu(num),qty,menu.getAlPrice(num));	
				this.display();
				System.out.println("�ֹ��߰� : O ,R:�ֹ�����,D:�ֹ����� �ֹ��Ϸ� : C");
				this.total();
				name=s1.nextLine();
			}else if(name.equals("C")) {
				this.display();
				this.total();								
				Scanner s1=new Scanner(System.in);				
				System.out.println("R:�ֹ�����,D:�ֹ�����,���:X");
				name=s1.nextLine();
			}else if(name.equals("R")) {
				this.display();
				Scanner s1=new Scanner(System.in);
				System.out.println("������ �޴� ��ȣ�� ��������");
				int number=s1.nextInt();
				number=number-1;
				System.out.println("�޴���:"+this.alMenu.get(number)+"����:"+this.alQty.get(number)+"����:"+this.alSum.get(number));
				System.out.println("������ �޴�:M, ����:N, �����:m");
				String str=s1.next();
				
					if(str.equals("M")) {
						Scanner scan=new Scanner(System.in);
						menu.display();
						System.out.println("�����ϰ���� �޴� ��ȣ�� �Է��Ͻÿ�");
						int n=scan.nextInt();			
						String new_menu=menu.getAlMenu(n-1);
						this.Mupdate(n-1,new_menu);	
						System.out.println(new_menu+"�� ������ �����ּ���");	
						int n1=scan.nextInt();
						this.Nupdate(n-1,n1);	
						System.out.println("�ֹ��߰� : O ,R:�ֹ�����,D:�ֹ����� �ֹ��Ϸ� : C");
						name=scan.nextLine();						
					}else if(str.equals("N")) {
						
//					}else if(set.equals("m")) {
						
					}
			}		
		}				
		Scanner s1=new Scanner(System.in);
		System.out.println("����� ��ȣ �Է��Ͻÿ�.");
		String number=s1.nextLine();		
		this.mobile(number);		
		}
	}				


import java.util.ArrayList;
import java.util.Scanner;

public class Order {	
	//모바일(mobile),메뉴명(name),수량(qty),총액(sum)
	//추문추가 (add) <=메뉴명,수량 - 총액 자동계산
	//추문삭제 (remove) <=주문번호
	//주문수정 (update) <=주문번호,메뉴명,수량 - 총액 자동계산
	//주문표시 (display) <-전체 주문목록 출력
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
			System.out.println("모바일번호"+this.alMobile.get(i)+
				"메뉴:"+this.alMenu.get(i)+",수량:"+this.alQty.get(i)+"가격"+this.alSum.get(i));}
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
					(i+1)+"메뉴:"+this.alMenu.get(i)+",수량:"+this.alQty.get(i)+"가격"+this.alSum.get(i));			
		}
	}
	void total() {
		int A;
		A=0;
		for(int i=0;i<this.alSum.size();i++) {			
			A=this.alSum.get(i);					
			A+=A;		}
		System.out.println("총액:"+A);
	}
	void Handling(Menu menu) {			
		menu.display();						
		System.out.println("주문:O,R:주문수정,D:주문삭제,취소:X");
		Scanner s=new Scanner(System.in);
		String name=s.nextLine();
		while(name.equals("X")==false) {
			if(name.equals("O")) {
				Scanner s1=new Scanner(System.in);
				System.out.println("주문할 메뉴번호를 입력하시오.");		
				int num=Integer.parseInt(s1.nextLine());
				num=num-1;
				System.out.println("메뉴 수량을 입력하시오.");
				int qty=Integer.parseInt(s1.nextLine());
				this.add(menu.getAlMenu(num),qty,menu.getAlPrice(num));	
				this.display();
				System.out.println("주문추가 : O ,R:주문수정,D:주문삭제 주문완료 : C");
				this.total();
				name=s1.nextLine();
			}else if(name.equals("C")) {
				this.display();
				this.total();								
				Scanner s1=new Scanner(System.in);				
				System.out.println("R:주문수정,D:주문삭제,취소:X");
				name=s1.nextLine();
			}else if(name.equals("R")) {
				this.display();
				Scanner s1=new Scanner(System.in);
				System.out.println("수정할 메뉴 번호를 적으세요");
				int number=s1.nextInt();
				number=number-1;
				System.out.println("메뉴명:"+this.alMenu.get(number)+"수량:"+this.alQty.get(number)+"가격:"+this.alSum.get(number));
				System.out.println("수정할 메뉴:M, 수량:N, 모바일:m");
				String str=s1.next();
				
					if(str.equals("M")) {
						Scanner scan=new Scanner(System.in);
						menu.display();
						System.out.println("수정하고싶은 메뉴 번호를 입력하시오");
						int n=scan.nextInt();			
						String new_menu=menu.getAlMenu(n-1);
						this.Mupdate(n-1,new_menu);	
						System.out.println(new_menu+"의 수량을 적어주세요");	
						int n1=scan.nextInt();
						this.Nupdate(n-1,n1);	
						System.out.println("주문추가 : O ,R:주문수정,D:주문삭제 주문완료 : C");
						name=scan.nextLine();						
					}else if(str.equals("N")) {
						
//					}else if(set.equals("m")) {
						
					}
			}		
		}				
		Scanner s1=new Scanner(System.in);
		System.out.println("모바일 번호 입력하시오.");
		String number=s1.nextLine();		
		this.mobile(number);		
		}
	}				


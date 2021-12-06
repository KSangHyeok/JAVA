
public class Tire {
	public int maxRotation;  //최대회전횟수
	public int pastRotation;  //누적 회전수
	public String location;  //타이어 위치
	public Tire() {		
	}
	public Tire(int maxRotation, String location) {		
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	boolean roll() {
		++pastRotation;
		if(pastRotation<maxRotation) {
			System.out.println("Tire 남은수명 :"+(maxRotation-pastRotation)+"회");
			return true;
		} else {
			System.out.println(this.location+"타이어펑크 ");
			return false;
			
		}
	}
	
}

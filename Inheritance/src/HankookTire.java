
public class HankookTire extends Tire {

	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);		
	}
	@Override
	public boolean roll() {
		++pastRotation;
		if(pastRotation<maxRotation) {
			System.out.println("한국타이어 남은수명 :"+(maxRotation-pastRotation)+"회");
			return true;
		} else {
			System.out.println(this.location+"한국타이어펑크 ");
			return false;
			
		}
	}
}

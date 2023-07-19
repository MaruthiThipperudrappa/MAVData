/**
 * 
 */
package practice;

/**
 * @author maruthith
 *
 */
public interface Vehicle {
	
	void changegear(int a);
	void speedup(int a);
	void applyBreak(int a);
}

class Bicycle implements Vehicle{
	
	int speed;
	int gear;

	@Override
	public void changegear(int newgear) {
		// TODO Auto-generated method stub
		gear=newgear;
	}

	@Override
	public void speedup(int increment) {
		// TODO Auto-generated method stub
		speed=speed+increment;
	}

	@Override
	public void applyBreak(int decrement) {
		// TODO Auto-generated method stub
		speed=speed-decrement;
	}
	
	public void printstates() {
		System.out.println("speed" +speed +"gear:"+gear);
	}
}

class Bike implements Vehicle{
	
	int speed;
	int gear;

	@Override
	public void changegear(int newgear) {
		// TODO Auto-generated method stub
		gear=newgear;
	}

	@Override
	public void speedup(int increment) {
		// TODO Auto-generated method stub
		speed=speed+increment;
	}

	@Override
	public void applyBreak(int decrement) {
		// TODO Auto-generated method stub
		speed=speed-decrement;
	}
	
	public void printstates() {
		System.out.println("speed" +speed +"gear:"+gear);
	}
		
}

class imp{
	public static void main(String[] args) {
		
		Bicycle b=new Bicycle();
		b.changegear(2);
		b.speedup(30);
		b.applyBreak(20);
		System.out.println("bicycle is created");
		b.printstates();
	}
}
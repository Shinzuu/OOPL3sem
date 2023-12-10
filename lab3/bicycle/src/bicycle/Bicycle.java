package bicycle;

public class Bicycle{
	public int gear;
	public int speed;
	public Bicycle(int theGear, int theSpeed){
		this.gear = theGear;
		this.speed = theSpeed;
	}
	public void applyBrake() {
		speed-=1;
	}
	public void speedUp() {
		speed += 1;
	}
	public String toString()
	    {
	        return ("No of gears are " + gear + "\n"
	                + "speed of bicycle is " + speed);
	    }
}

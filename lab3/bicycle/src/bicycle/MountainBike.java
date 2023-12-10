package bicycle;

public class MountainBike extends Bicycle{
	int seatHeight;
	
	MountainBike(int a, int b, int c){
		super(a,b);
		seatHeight = c;	
	}
	public void seatHeight(int c) {
		this.seatHeight = c;
	}
	public String toString() {
		return (super.toString()+"\nthe seat height is "+ seatHeight);
	}
}
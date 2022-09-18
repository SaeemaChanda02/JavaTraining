
public class Bicycle {
	
	// 3 parameters
	public int cadence;
	public int gear;
	public int speed;
	
	// bicycle class has a constructor
	public Bicycle(int startCadence,int startSpeed,int startGear) {
		gear =  startGear;
		cadence = startCadence;
		speed = startSpeed;
		}
	// it has 3 methods
	public void setCadence (int newValue) {
		cadence = newValue;
	}
	
	public void setGear (int newValue) {
		gear = newValue;
	}
	public void setSpeed (int newValue) {
		speed = newValue;
	}

}

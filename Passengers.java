package work;

public class Passengers extends Cars {
	private int numberOfPassengers = 0;
	public Passengers(String registrationNumber,String model) {
	super(registrationNumber, model);
	
	}
	public int getnumberOfPassengers() {
		return numberOfPassengers;
	}
	public void setnumberOfPassengers(int passenger) {
		numberOfPassengers = passenger;
	}

}

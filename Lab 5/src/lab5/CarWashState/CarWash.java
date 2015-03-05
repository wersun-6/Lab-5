package lab5.CarWashState;

public class CarWash{
	
	int availableSpots;
	int capacity;

	public CarWash(int _capacity){
		capacity = _capacity;
		availableSpots = capacity;
	}
	
	
	/**
	 *  @return True if there's any available spots in the carwash.
	 * */
	public boolean addCar() {
		if(availableSpots >= 0){
			availableSpots--;
			return true;
		}
		return false;
	}

	
	/**
	 *  @return True if it's possible to withdraw more cars from this carwash. IOW, it 
	 *  cannot have more available spots then the carwash's capacity.
	 * */
	public boolean removeCar() {
		if(availableSpots <= capacity){
			availableSpots++;
		}
		return false;
	}

}
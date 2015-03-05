package lab5.CarWashState;

public class CarWashState extends SimState{
	private final int MAX_CAR_QUEUE;
	private final int SEED = 0;
	private final int LAMBDA = 0;
	private final int UPPER = 0;
	private final int LOWER = 0;
	
	private int currentQueue = 0;
	private double idleTime = 0;
	private int rejectedCars = 0;
	
	CarWash fastCarWash;
	CarWash slowCarWash;
	
	UniformRandomStream uniRandom;
	ExponentialRandomStream expRandom;
	
	public CarWashState(int capacityFast, int capacitySlow, int maxQueue){
		MAX_CAR_QUEUE = maxQueue;
		fastCarWash = new CarWash(capacityFast);
		slowCarWash = new CarWash(capacitySlow);
	}
	
	public double getIdleTime(){
		return idleTime;
	}
	
	public int getRejectedCars(){
		return rejectedCars;
	}
	
	/*
	 * TODO: Calculate the washtime depending on how many cars are in which carwash, and on how many which are in queue to join the carwash
	 * */
	public double getWashTime(){
		if(fastCarWash.addCar()){
			
		}else if(slowCarWash.addCar()){
			
		}else{
			
		}
		return 1337;
	}
}



/** Temporary abstract class
 * */
abstract class SimState{
	public int currentTime;
}

/** Temporary abstract class
 * */
abstract class CarFactory{
	public int carID;
	Event event;
	abstract void addCar();
}

/** Temporary abstract class
 * */
abstract class Event{
	public double executeTime;
	abstract void execute();
	abstract void setExecuteTime();
	abstract void stopEvent();
	
	public double getExecuteTime(){
		return 1.0;
	}
}

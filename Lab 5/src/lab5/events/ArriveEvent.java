package lab5.events;

import lab5.simulator.*;
import lab5.carwashstate.*;


public class ArriveEvent extends Event {
	
	Car car;
	
	public ArriveEvent(double time, Car car){
		super(time);
		this.car = car;
		
	}
	
	public void execute(CarWashState s, EventQueue queue){
		if(s.getFastCarWashSlots() != 0){
			s.subFastCarWashSlots();
			queue.add(new LeaveEvent(time+s.getFastCarWashTime(), car, 1));
		}else if(s.getSlowCarWashSlots()!= 0){
			s.subSlowCarWashSlots();
			queue.add(new LeaveEvent(time+s.getFastCarWashTime(), car, 2));
		}else{
			s.addCarToQueue(car);
		}
		queue.add(new ArriveEvent(s.getArriveTime(), s.createNewCar()));
	}

}
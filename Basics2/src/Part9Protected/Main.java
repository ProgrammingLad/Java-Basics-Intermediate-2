package Part9Protected;

import Part9ProtectedEntities.H2;
import Part9ProtectedEntities.Motor;
import Part9ProtectedEntities.Ninja;
import Part9ProtectedEntities.Raider;

public class Main {

	public static void main(String[] args) {

		Motor daily = new Raider("Raider");
		System.out.println(daily);
		daily.start();
		Raider work = (Raider)daily;
		work.dailyUse();
		daily.off();

		System.out.println();
		
		Motor weekend = new Ninja("Ninja");
		System.out.println(weekend);
		weekend.start();
		weekend.service();
		Ninja activate = (Ninja)weekend;
		activate.autoBlip();
		weekend.off();
		
		System.out.println();
		
		Motor superbike = new H2(); 
		System.out.println(superbike);
		superbike.start();
		superbike.putGas();
		H2 go = (H2)superbike;
		go.expressway();
		go.cruiseControl();
		
		superbike.off();
	}
}

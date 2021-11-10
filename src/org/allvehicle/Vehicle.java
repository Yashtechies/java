package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.Twowheeler;

public class Vehicle {
	private void vehicleNecessery() {
		System.out.println("vehicle necessery is : Fuel");

	}
	public static void main(String[] args) {
		Vehicle a = new Vehicle();
		a.vehicleNecessery();
		Twowheeler s = new Twowheeler();
		s.bike();
		s.cycle();
		ThreeWheeler d = new ThreeWheeler();
		d.auto();
		FourWheeler f = new FourWheeler();
		f.bus();
		f.car();
		f.lorry();
		
		
		
		
		
		
		
	}

}

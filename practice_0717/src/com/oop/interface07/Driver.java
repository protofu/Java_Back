package com.oop.interface07;

public class Driver {
	void drive(Vehicle v) {
		if (v instanceof Bus b) {
			b.checkFare();
		}
		v.run();
	}
}

package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle{

	@Override
	public String Model_name(String Model_name) {
		return Model_name;
	}

	@Override
	public String Get_registration_number(String register_no) {
		return register_no;
	}

	@Override
	public String Get_owner_name(String Oname) {
		return Oname;
	}
	
	public int getspeed(int speed) {
		return speed;
	}
	
	public void radio() {
		System.out.println("Radio is not exists.");
	}

}

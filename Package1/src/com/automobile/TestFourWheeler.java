package com.automobile;

import com.automobile.FourWheeler.Ford;
import com.automobile.FourWheeler.Logan;


public class TestFourWheeler {
	public static void main(String[] args) {
		Ford F = new Ford("Ford", "xyz", "Prathmesh", 130);
		System.out.println(F.getModelName());
		System.out.println(F.getOwnerName());
		System.out.println(F.getRegistrationNumber());
		System.out.println(F.speed()+" kmph");
		F.tempControl();
		System.out.println("-------------------------");
		Logan L = new Logan("Mahindra", "abc", "Akshay", 150);
		System.out.println(L.getModelName());
		System.out.println(L.getOwnerName());
		System.out.println(L.getRegistrationNumber());
		System.out.println(L.speed()+" kmph");
		L.gps();
		
	}
}

package com.automobile;

import com.automobile.twoWheeler.Hero;
import com.automobile.twoWheeler.Honda;


public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero H = new Hero("Hero", "xyz", "Prathmesh", 50);
		System.out.println(H.getModelName());
		System.out.println(H.getOwnerName());
		System.out.println(H.getRegistrationNumber());
		System.out.println(H.getSpeed()+" kmph");
		H.radio();
		System.out.println();
		Honda H1 = new Honda("Honda", "abcd", "Prashant", 80);
		System.out.println(H1.getModelName());
		System.out.println(H1.getOwnerName());
		System.out.println(H1.getRegistrationNumber());
		System.out.println(H1.getSpeed()+" kmph");
		H1.cdplayer();	
	}
}

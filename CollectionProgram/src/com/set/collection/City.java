package com.set.collection;

import java.util.HashSet;
import java.util.Set;

public class City {
	int pincode;
	String name;

	public City(int pincode, String name) {
		this.pincode = pincode;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return this.pincode;
	}

	@Override
	public boolean equals(Object obj) {
		boolean resp = false;

		if (obj instanceof City) {
			City instance = (City) obj;
			if (this.pincode == instance.pincode) {
				resp = true;
			}
		}
		return resp;
	}

	@Override
	public String toString() {
		return this.name + " " + this.pincode;
	}

	public static void main(String[] args) {

		City c1 = new City(560076, "Bangalore");
		City c2 = new City(560070, "Bangalore");
		City c3 = new City(801503, "Patna");
		City c4 = new City(402021, "Bhopal");

		Set<City> set = new HashSet<>();

		set.add(c1);
		set.add(c2);
		set.add(c3);
		set.add(c4);

		for (City city : set) {
			System.out.println(city);
		}
		System.out.println(set.size()); // 4
		
		System.out.println(c1.equals(c2));
		
		
	}
}

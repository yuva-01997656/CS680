package edu.umb.cs680.hw011;

import java.util.Comparator;

public class PriceComparator implements Comparator<Car> {

	public int compare(Car car1, Car car2) {
		return  (int) (car2.getPrice() -  car1.getPrice());
	}

}
package edu.umb.cs680.hw011;

import java.util.Comparator;

public class YearComparator  implements Comparator<Car> {

	public int compare(Car car1, Car car2) {
		return car1.getYear() - car2.getYear();
	}
}
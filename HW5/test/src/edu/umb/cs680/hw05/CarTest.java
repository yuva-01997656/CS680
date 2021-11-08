package edu.umb.cs680.hw05;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;


import org.junit.jupiter.api.Test;

public class CarTest {

	private String[] carToStringArray(Car car) {
		String[] carString = { car.getMake(), car.getModel(), String.valueOf(car.getYear()) };
		return carString;
	}

	@Test
	public void compareCarWithMakeModelYear() {
		Car actual = new Car("Mercedes", "C Class", 80000, 13, 2014);
		String[] expected = { "Mercedes", "C Class", "2014" };
		System.out.println(carToStringArray(actual));
		assertArrayEquals(expected, carToStringArray(actual));
	}

}

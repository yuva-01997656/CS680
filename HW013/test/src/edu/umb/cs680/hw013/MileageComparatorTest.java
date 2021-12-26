package edu.umb.cs680.hw013;

import static org.junit.jupiter.api.Assertions.*;


import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



class MileageComparatorTest {

       static LinkedList<Car> usedCars = new LinkedList<Car>();
       static Car car1;
       static Car car2;
       static Car car3;
       
       @BeforeAll
       public static void setUp() {
    	   car1 = new Car("Audi", "Q3", 2013, 33, 85000);
    	   car2 = new Car("Mercedes", "GLA", 2014, 40, 100000);
      	   car3 = new Car("Mercedes", "Sport", 2012, 30, 95000);   		
      	   usedCars.add(car1);
   		   usedCars.add(car2);
   		   usedCars.add(car3);
       }
       
       @Test
       public void mileageSortingWithComparatorComparing() {
   		Comparator<Car> compare = Comparator.comparing(Car::getMileage);
   		Collections.sort(usedCars, compare);
   		assertEquals(car3, usedCars.get(0));
   		assertEquals(car1, usedCars.get(1));
   		assertEquals(car2, usedCars.get(2));
   			
   	}
	
        @Test
        public void mileageSorting() {
		
		Collections.sort(usedCars,(Car obj1, Car obj2) -> obj2.getMileage()-obj1.getMileage());
		assertEquals(car2, usedCars.get(0));
   		assertEquals(car1, usedCars.get(1));
   		assertEquals(car3, usedCars.get(2));
		
	}
}
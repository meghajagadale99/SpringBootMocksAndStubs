package com.example.springboot_project.calculate_Stubs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class DataService implements SomeData {

    @Override
    public
    int[] retrieveAllData() {
        return new int[]{1, 2, 3, 4, 5};
    }
}

class DataServiceEmpty implements SomeData {

    @Override
    public
    int[] retrieveAllData() {
        return new int[]{};
    }
}
public
class CalculateSum {
    @Test
    public void shouldReturnSumOfIntArrayWhenCalculationHaveGivenArrayOfIntegerValues(){
        Calculation calculation = new Calculation();
        calculation.setSomeData(new DataService());
        int actualResult =calculation.calculateSomeDataSum();
        int expectedResult = 15;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void shouldReturnEmptyArrayWhenCalculationHaveGivenNullValue(){
        Calculation calculation = new Calculation();
        calculation.setSomeData(new DataServiceEmpty());
        int actualResult = calculation.calculateSomeDataSum();
        int expectedResult = 0;
        assertEquals(expectedResult,actualResult);
    }

}

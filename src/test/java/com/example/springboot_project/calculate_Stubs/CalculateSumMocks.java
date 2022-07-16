package com.example.springboot_project.calculate_Stubs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculateSumMocks {

    Calculation calculation = new Calculation();
    SomeData someData = mock(SomeData.class);

//    @InjectMocks
//    Calculation calculation;
//
//    @Mock
//    SomeData someData;

    @BeforeEach
    public
    void before() {
         calculation.setSomeData(someData);
    }

    @Test
    public void shouldReturnSumOfIntArrayWhenCalculationHaveGivenArrayOfIntegerValues(){
        when(someData.retrieveAllData()).thenReturn(new int[]{1,2,3,4,5});

        assertEquals(15,calculation.calculateSomeDataSum());
    }

    @Test
    public void shouldReturnEmptyArrayWhenCalculationHaveGivenNullValue(){
        when(someData.retrieveAllData()).thenReturn(new int[]{});

        assertEquals(0,calculation.calculateSomeDataSum());
    }



//    @Test
//    public void shouldReturnSumOfIntArrayWhenCalculationHaveGivenArrayOfIntegerValues(){
//        Calculation calculation = new Calculation();
//        SomeData someData = mock(SomeData.class);
//        when(someData.retrieveAllData()).thenReturn(new int[]{1,2,3,4,5});
//        calculation.setSomeData(someData);
//        int actualResult =calculation.calculateSomeDataSum();
//        int expectedResult = 15;
//        assertEquals(expectedResult,actualResult);
//    }

}

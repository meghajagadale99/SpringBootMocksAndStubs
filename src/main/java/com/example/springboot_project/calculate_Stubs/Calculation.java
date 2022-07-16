package com.example.springboot_project.calculate_Stubs;

public
class Calculation {
    private SomeData someData;

    public
    int calculateSum(int[] data) {
        int sum = 0;
        for (int values : data) {
            sum += values;
        }
        return sum;
    }

    public
    int calculateSomeDataSum() {
        int sum = 0;
        int[] data = someData.retrieveAllData();
        for (int values : data) {
            sum += values;
        }
        return sum;
    }

    public
    void setSomeData(SomeData someData) {
        this.someData = someData;
    }

}

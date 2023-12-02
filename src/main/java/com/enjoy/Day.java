package com.enjoy;

public abstract class Day {

    public void run() {
        System.out.println("-------------------- Day " + numberOftheDay() + " --------------------");
        part01();
        part02();

    }

    protected abstract void part01();

    protected abstract void part02();

    protected abstract String numberOftheDay();
}

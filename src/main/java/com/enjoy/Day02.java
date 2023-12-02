package com.enjoy;

public class Day02 extends Day{

    private String input = "";

    Day02() {
        InputDay02 inputDay02 = new InputDay02();
        this.input = inputDay02.getInput();
    }

    @Override
    protected void part01() {
        System.out.println("Part 01 : ");
    }

    @Override
    protected void part02() {
        System.out.println("Part 02 : ");
    }

    @Override
    protected String numberOftheDay() {
        return "02";
    }
 }

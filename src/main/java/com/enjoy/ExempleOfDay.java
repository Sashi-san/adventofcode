package com.enjoy;

public class ExempleOfDay extends Day{

    private String input = "";

    ExempleOfDay() {
        InputDay01 inputDay01 = new InputDay01();
        this.input = inputDay01.getInput();
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
        return "01";
    }
 }

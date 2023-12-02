package com.enjoy;

public class Day01 extends Day{

    private String input = "";

    Day01() {
        InputDay01 inputDay01 = new InputDay01();
        this.input = inputDay01.getInput();
    }

    @Override
    protected void part01() {
        System.out.println("Part 01 : ");
        String word[] = input.split("\n");
        int pos = 0;
        int total = 0;
        while ( pos < word.length) {
            word[pos] = word[pos].replaceAll("[^0-9]", "");
            if (word[pos].length() == 1) {
                word[pos] = word[pos] + word[pos].charAt(0);
            }
            if (word[pos].length() >= 3) {
                word[pos] = word[pos].substring(0,1) + word[pos].substring(word[pos].length() -1, word[pos].length());
            }
            total = total + Integer.parseInt(word[pos]);
            pos++;
        }
        System.out.println("Le total est : " + total);
    }

    @Override
    protected void part02() {
        System.out.println("Part 02 : ");
        String word[] = input.split("\n");
        int pos = 0;
        int total = 0;
        while ( pos < word.length) {
            word[pos] = word[pos].replaceAll("one", "o1ne");
            word[pos] = word[pos].replaceAll("two", "t2wo");
            word[pos] = word[pos].replaceAll("three", "t3hree");
            word[pos] = word[pos].replaceAll("four", "f4our");
            word[pos] = word[pos].replaceAll("five", "f5ive");
            word[pos] = word[pos].replaceAll("six", "s6ix");
            word[pos] = word[pos].replaceAll("seven", "s7even");
            word[pos] = word[pos].replaceAll("eight", "e8ight");
            word[pos] = word[pos].replaceAll("nine", "n9ine");
            word[pos] = word[pos].replaceAll("[^0-9]", "");
            if (word[pos].length() == 1) {
                word[pos] = word[pos] + word[pos].charAt(0);
            }
            if (word[pos].length() >= 3) {
                word[pos] = word[pos].substring(0,1) + word[pos].substring(word[pos].length() -1, word[pos].length());
            }
            total = total + Integer.parseInt(word[pos]);
            pos++;
        }
        System.out.println("Le total est : " + total);
    }

    @Override
    protected String numberOftheDay() {
        return "01";
    }
 }

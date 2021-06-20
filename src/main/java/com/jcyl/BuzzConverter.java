package com.jcyl;

public class BuzzConverter implements Converter{

    public boolean meetRule(int value) {
        return (value % FizzBuzzUtils.VALUE_MATCH_5 == 0 || String.valueOf(value).contains(String.valueOf(FizzBuzzUtils.VALUE_MATCH_5)));
    }

    @Override
    public String convert() {
        return FizzBuzzUtils.RETURN_STRING_BUZZ;
    }
}

package com.jcyl;

public class FizzBuzzConverter implements Converter{
  public boolean meetRule(int value) {

    return value % FizzBuzzUtils.VALUE_MATCH_3 == 0 && value % FizzBuzzUtils.VALUE_MATCH_5 == 0;
  }

  @Override
  public String convert() {
    return FizzBuzzUtils.RETURN_STRING_FIZZBUZZ;
  }
}

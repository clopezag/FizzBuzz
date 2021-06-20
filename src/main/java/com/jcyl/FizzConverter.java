package com.jcyl;

public class FizzConverter implements Converter{

  public boolean meetRule(int value) {
    return (value % FizzBuzzUtils.VALUE_MATCH_3 == 0 || String.valueOf(value).contains(String.valueOf(FizzBuzzUtils.VALUE_MATCH_3)));
  }

  @Override
  public String convert() {
    return FizzBuzzUtils.RETURN_STRING_FIZZ;
  }
}

package com.jcyl;

public class WhizzConverter implements Converter{
  public boolean meetRule(int value) {

    return value % FizzBuzzUtils.VALUE_MATCH_7 == 0;
  }

  @Override
  public String convert() {
    return FizzBuzzUtils.RETURN_STRING_WHIZZ;
  }
}

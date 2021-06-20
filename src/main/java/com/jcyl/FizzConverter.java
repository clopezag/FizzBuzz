package com.jcyl;

public class FizzConverter implements Converter{
  public final int VALUE_MATCH= 3;
  public boolean meetRule(int value) {
    return value % VALUE_MATCH == 0 || String.valueOf(value).contains(String.valueOf(VALUE_MATCH));
  }
  
  @Override
  public String convert() {
    return "Fizz";
  }
}

package com.jcyl;

public class WhizzConverter implements Converter{
  public boolean meetRule(int value) {
    
    return value % 7 == 0;
  }
  
  @Override
  public String convert() {
    return "Whizz";
  }
}

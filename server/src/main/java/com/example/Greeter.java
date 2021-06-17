package com.example;


public class Greeter {

  
  public Greeter() {

  }

  public final String greet(final String someone) {
    private String message ="Hello babacar, %s!";
    return String.format(message, someone);
  }
}

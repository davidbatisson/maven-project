package com.example;

/**
* Description : class Greeter
*/
public class Greeter {

  /**
  * Constructeur vide
  */
  public Greeter() {

  }

  public final String greet(final String someone) {
    String message = "Hello " + someone;
    return message;
  }
}

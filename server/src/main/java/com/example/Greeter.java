package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * This is the greet method to say hello.
   * @param String someone name
   * @return String with the greeting
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }

}

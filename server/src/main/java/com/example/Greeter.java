package com.example;

/**.
* Description : class Greeter
*/
public class Greeter {

  /**.
  * Constructeur vide
  */
  public Greeter() {

  }
  /**.
  * methode qui retourne un message
  * @param someone nom de la personne
  * @return String le message personnalise
  */
  public final String greet(final String someone) {
    String message = "Hello " + someone;
    return message;
  }
}

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
  * @param nom de la personne
  * @return le message
  */
  public final String greet(final String someone) {
    String message = "Hello " + someone;
    return message;
  }
}

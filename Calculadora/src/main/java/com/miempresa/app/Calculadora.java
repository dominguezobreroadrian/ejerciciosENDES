package com.miempresa.app;

/**
 * Hello world!
 *
 */


/**
 * Class Calculadora
 */
public class Calculadora {

  //
  // Fields
  //

  private static int num1;
  private static int num2;
  
  //
  // Constructors
  //
  public Calculadora () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of num1
   * @param newVar the new value of num1
   */
  public void setNum1 (int newVar) {
    num1 = newVar;
  }

  /**
   * Get the value of num1
   * @return the value of num1
   */
  public int getNum1 () {
    return num1;
  }

  /**
   * Set the value of num2
   * @param newVar the new value of num2
   */
  public void setNum2 (int newVar) {
    num2 = newVar;
  }

  /**
   * Get the value of num2
   * @return the value of num2
   */
  public int getNum2 () {
    return num2;
  }

  //
  // Other methods
  //

  /**
   * @return       int
   */
  public static int sumar()
  {
	  return num1 + num2;
  }


  /**
   * @return       int
   */
  public int restar()
  {
	  return num1 - num2;
  }


  /**
   * @return       int
   */
  public int multiplicar()
  {
	  return num1 * num2;
  }


  /**
   * @return       double
   */
  public double dividir()
  {
	  return num1 / num2;
  }


}

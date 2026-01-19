package es.banco;



/**
 * Class CuentaCorriente
 */
public class CuentaCorriente {

  //
  // Fields
  //

  static private String nombreBanco;
  public String nombre;
  private String dni;
  private double saldo;
  private double limiteDescubierto;
  private Banco banco;
  

  public CuentaCorriente (String nombre, String dni)
  {
	  this.nombre = nombre;
	  this.dni = dni;
  }

  public CuentaCorriente (String nombre, String dni, double saldoInicial)
  {
	  this.nombre = nombre;
	  this.dni = dni;
	  this.saldo = saldoInicial;
  }

  public CuentaCorriente (String nombre, String dni, double saldoInicial, double limiteDescubierto)
  {
	  this.nombre = nombre;
	  this.dni = dni;
	  this.saldo = saldoInicial;
	  this.limiteDescubierto = limiteDescubierto;
  }
  

  public static void setNombreBanco(String nombre)
  {
	  nombreBanco = nombre;
  }
  
  public String getNombreBanco () {
    return nombreBanco;
  }
   

  public void setNombre (String newVar) {
    nombre = newVar;
  }

  public String getNombre () {
    return nombre;
  }

 
  public void setSaldo (double newVar) {
    saldo = newVar;
  }

  public double getSaldo () {
    return saldo;
  }

  public void setLimiteDescubierto (double newVar) {
    limiteDescubierto = newVar;
  }

  public double getLimiteDescubierto () {
    return limiteDescubierto;
  }

  public void setBanco (Banco newVar) {
    banco = newVar;
  }

  public Banco getBanco () {
    return banco;
  }

  public void ingresar(double cantidad)
  {
	  this.saldo += cantidad;
  }

  public boolean sacar(double cantidad)
  {
	  if (this.saldo - cantidad >= this.limiteDescubierto) {
		  this.saldo -= cantidad;
		  return true;
	  } else {
		  return false;
	  }
  }


  public String mostrarInformacion()
  {
	  return "Titular: " + this.nombre + "\n" 
			  + "DNI: " + this.dni + "\n" + "Saldo actual: " + this.saldo + " €"
			  + "\n" + "Limite descubierto: " + this.limiteDescubierto;
  }

}

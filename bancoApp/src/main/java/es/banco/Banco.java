package es.banco;

public class Banco {


  private String nombre;
  private double capital;
  private String direccion;
  
  public Banco(String nombre, double capital, String direccion)
  {
	  this.nombre = nombre;
	  this.capital = capital;
	  this.direccion = direccion;
  }

  public void setNombre (String newVar) {
    nombre = newVar;
  }

  public String getNombre () {
    return nombre;
  }

  public void setCapital (double newVar) {
    capital = newVar;
  }

  public double getCapital () {
    return capital;
  }

  public void setDireccion (String newVar) {
    direccion = newVar;
  }

  public String getDireccion () {
    return direccion;
  }

  public String toString()
  {
	  return "Nombre --> " + nombre + "\n"
			  + "Capital --> " + capital + "\n" 
			  + "Dirección --> " + direccion;
  }
}

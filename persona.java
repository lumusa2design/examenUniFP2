package Persona;

public class persona {
String dni = "";
String Nombre = "";

public persona (String dni, String Nombre) {
	this.dni = dni;
	this.Nombre = Nombre;
} 

public String getDni() {
	return this.dni;
}

public void setDni(String nDni) {
	this.dni = nDni;
}

public String getNombre() {
	return this.Nombre;
}
public void setNombre(String newNombre) {
	this.Nombre = newNombre;
}

public void Imprimir() {
	System.out.println("Nombre: " + this.Nombre);
	System.out.println("Dni: " + this.dni);
}
}

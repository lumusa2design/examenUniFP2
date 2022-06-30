package Persona;
import java.util.ArrayList;

public class Pacientecovid extends persona{
	int estado;
	persona[] contactos = new persona[50];
	int numContactos = 0;
	String momentum = "";
public Pacientecovid(String dni, String nombre, int estado) {
	super(dni, nombre);
	this.estado =estado;
}

@Override
public String toString() {
	switch(estado) {
	case 0:
		momentum = "Asintomático";
		break;
	case 1:
		momentum = "leve";
		break;
	case 2:
		momentum = "grave";
		break;
	case 3:
		momentum = "muy grave";
	}
	return dni + "-" + momentum;
}
public void addContacto(persona Nuevo) {
	if(contactos[0] == null) {
		contactos[0] = Nuevo;
	}else {
		if (numContactos <= 50) {
			numContactos += 1;
			contactos[numContactos] = Nuevo;
		}else {
			throw new IndexOutOfBoundsException("La lista de contactos esta llena");
		}
	}
}

public int compareTo(Pacientecovid otro) {
	if(this.dni == otro.dni) {
		return 0;
	} else {
		return this.estado - otro.estado;
	}
}
}
package Persona;

public class main {
	public static void main (String[]args) {
		persona persona1 = new persona("123456789A", "Pepito");
		persona persona2 = new persona("122336789D", "Juanito");
		//persona1.Imprimir();
		Pacientecovid pa1 = new Pacientecovid("987654321B", "Juanito",3);
		System.out.println(pa1.toString());
		pa1.addContacto(persona1);
		pa1.addContacto(persona2);
		System.out.println(pa1.contactos[0].Nombre +" "+ pa1.contactos[1].Nombre);
		for(int i = 0; i < 50;i++) {
			pa1.addContacto(persona1);
			pa1.addContacto(persona2);
			System.out.println(pa1.contactos[i].Nombre + pa1.contactos[i+1].Nombre);
		}
	}
}
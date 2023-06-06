package proceso;

import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;

import superclase.Insecto;

public class Procesos {
	
	HashMap<Integer, Insecto> mapInsecto = new HashMap<>();
	Insecto insecto = new Insecto();
		   
	public void inicio() {
		String menu = "Ingrese opcion Correcta\n";
		menu += "1. Ingresar insecto\n";
		menu += "2. Imprimir insecto\n";
		menu += "3. Consultar insecto\n";
		menu += "4. Salir";
		int x =  0;
		do {
			x = Integer.parseInt(JOptionPane.showInputDialog(menu));
			opcion(x);
		}while(x != 4);
	}

	public void opcion(int x) {
		switch (x) {
		case 1:
			ingresarInsecto();
			break;
		case 2:
			if(mapInsecto.size() !=  0) {
				imprimirDatos();
			}else System.out.println("Ingrese los datos");
			break;
		case 3:
			if(mapInsecto.size() !=  0) {
				consultarInsecto();
			}else System.out.println("Ingrese los datos");
			break;
		case 4:
			System.out.println("Adios");
			break;
		default:
			System.out.println("Ingrese opción correcta");
			break;
		}
	}

	private void consultarInsecto() {
		int llave = Integer.parseInt(JOptionPane.showInputDialog("Ingrese codigo del insecto a consultar: "));
		if (mapInsecto.containsKey(llave)) {
			System.out.println("Codigo: "+mapInsecto.get(llave).getCodigo()+" Nombre: "+mapInsecto.get(llave).getNombre()+
					" Color: "+mapInsecto.get(llave).getColor()+" Patas: "+mapInsecto.get(llave).getPatas()+
					" Alas: "+mapInsecto.get(llave).getAlas()+" Ojos: "+mapInsecto.get(llave).getOjos()+" Antenas: "+mapInsecto.get(llave).getAntenas());
		}
		else {
			System.out.println(llave+" No se encuentra registrado");
		}
	}

	private void imprimirDatos() {
		Iterator <Integer> iter = mapInsecto.keySet().iterator();
		while (iter.hasNext()) {
			Integer llave=iter.next();
			System.out.println("Codigo: "+mapInsecto.get(llave).getCodigo()+" Nombre: "+mapInsecto.get(llave).getNombre()+
					" Color: "+mapInsecto.get(llave).getColor()+" Patas: "+mapInsecto.get(llave).getPatas()+
					" Alas: "+mapInsecto.get(llave).getAlas()+" Ojos: "+mapInsecto.get(llave).getOjos()+" Antenas: "+mapInsecto.get(llave).getAntenas());
		}
	}

	private void ingresarInsecto() {
		insecto.pedirDatos();
		mapInsecto.put(insecto.getCodigo(),insecto);
		insecto = new Insecto();
	}
	
	
	

}

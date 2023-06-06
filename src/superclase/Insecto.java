package superclase;

import javax.swing.JOptionPane;

public class Insecto {
	
	private int patas, alas=2, ojos, antenas, codigo;
	private String color, nombre;
	
	public Insecto( ) {
		
	}
	
	public Insecto(int patas, int alas, int ojos, int antenas, int codigo, String color, String nombre) {
		this.patas=patas;
		this.ojos=ojos;
		this.antenas=antenas;
		this.codigo=codigo;
		this.color=color;
		this.alas=alas;
		this.nombre=nombre;
	}

	public void pedirDatos() {
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Que codigo tiene su insecto: "));
		nombre = JOptionPane.showInputDialog("Digite el nombre de su insecto: ");
		patas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas patas tiene su insecto: "));
		ojos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos ojos tiene su insecto: "));
		antenas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas antenas tiene su insecto: "));
		color = JOptionPane.showInputDialog("digite el color de su insecto: ");
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public int getAlas() {
		return alas;
	}

	public void setAlas(int alas) {
		this.alas = alas;
	}

	public int getOjos() {
		return ojos;
	}

	public void setOjos(int ojos) {
		this.ojos = ojos;
	}

	public int getAntenas() {
		return antenas;
	}

	public void setAntenas(int antenas) {
		this.antenas = antenas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

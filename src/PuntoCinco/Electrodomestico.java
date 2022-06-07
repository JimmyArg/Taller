package PuntoCinco;

public class Electrodomestico {

	int precioBase = 100;
	String color = "Blanco";
	char consumoEnergetico = 'F';
	int peso = 5;
	int precioConsumo = 0;
	int precioFinal = 0;
	
	public Electrodomestico() {
		// TODO Auto-generated constructor stub
	}

	public Electrodomestico(int precioBase, int peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}
	
	private void comprobarConsumoEnergetico(char letra) {
		switch (letra) {
		case 'A': {
			precioConsumo = 100;
		  break;
		}
		case 'B': {
			precioConsumo = 80;
			  break;
			}
		case 'C': {
			precioConsumo = 60;
			  break;
			}
		case 'D': {
			precioConsumo = 50;
			  break;
			}
		case 'E': {
			precioConsumo = 30;
			  break;
			}
		case 'F': {
			precioConsumo = 10;
			  break;
			}
		
		default:
			break;
		}
	}
	
	private void comprobarColor(String color) {
		if (color == "blanco"||color == "BLANCO") {
			this.color = color;
		}
		if (color == "negro"||color == "NEGRO") {
			this.color = color;
		}
		if (color == "rojo"||color == "ROJO") {
			this.color = color;
		}
		if (color == "azul"||color == "AZUL") {
			this.color = color;
		}
		if (color == "gris"||color == "GRIS") {
			this.color = color;
		}
	}
	
	public void precioFinal() {
		comprobarColor(getColor());
		comprobarConsumoEnergetico(getConsumoEnergetico());
		if (peso<=19 && peso>0) {
			precioFinal = precioFinal+10;
		}
		if (peso<=49 && peso>=20) {
			precioFinal = precioFinal+50;
		}
		if (peso<=79 && peso>=50) {
			precioFinal = precioFinal+80;
		}
		if (peso>=80) {
			precioFinal = precioFinal+100;
		}
		precioFinal = precioFinal+precioConsumo+precioBase;
		
		System.out.println("Electro= "+precioFinal);
	}
	
}

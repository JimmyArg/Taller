package PuntoCinco;

public class Lavadora extends Electrodomestico{

	int carga = 5;
	public Lavadora() {
		// TODO Auto-generated constructor stub
	}

	
	public Lavadora(int precioBase, int peso, int carga) {
		super(precioBase, peso);
		this.carga = carga;
	}


	public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}
	
	
	public int getCarga() {
		return carga;
	}


	public void precioFinal() {
		super.precioFinal();
		if (carga > 30) {
			precioFinal = precioFinal+50;
		}
		System.out.println("LAvadora= "+precioFinal);
	}
	
	
	
	

}

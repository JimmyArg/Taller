package PuntoCinco;

public class Television extends Electrodomestico{

	int resolucion = 20;
	boolean sintonizadorTDT = false;
	
	public Television() {
		// TODO Auto-generated constructor stub
	}

	public Television(int precioBase, int peso) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
	}

	public Television(int precioBase, int peso, int resolucion, boolean sintonizadorTDT) {
		super(precioBase, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public Television(int precioBase, String color, char consumoEnergetico, int peso, int resolucion,
			boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	public void precioFinal() {
		super.precioFinal();
		if (resolucion>40) {
			precioFinal = precioFinal+(precioFinal*30/100);
		}
		if (sintonizadorTDT == true) {
			precioFinal= precioFinal+50;
		}
		System.out.println("Tele= "+precioFinal);
	}
	
		

}

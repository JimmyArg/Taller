package PuntoCinco;

import java.util.Iterator;

public class Ejecutable {

	public Ejecutable() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int precioElectro=0;
		int precioLavadora=0;
		int precioTele=0;
		Electrodomestico electrodomesticos[]= new Electrodomestico[10];
		Electrodomestico elec1= new Electrodomestico(200, "blanco", 'B', 15);
		Lavadora elec2 = new Lavadora(150, "negro", 'D', 25, 10);
		Television elec3 = new Television(400, "negro", 'F', 60, 45, true);
		Lavadora elec4 = new Lavadora(135, "rojo", 'A', 40, 35);
		Electrodomestico elec5= new Electrodomestico(300, "blanco", 'E', 90);
		Electrodomestico elec6= new Electrodomestico(400, "gris", 'B', 65);
		Lavadora elec7 = new Lavadora(60, "azul", 'B', 25, 10);
		Lavadora elec8 = new Lavadora(150, "negro", 'D', 25, 10);
		Television elec9 = new Television(450, "blanco", 'F', 65, 50, true);
		Television elec10 = new Television(560, "negro", 'F', 80, 60, true);
		electrodomesticos[0]=elec1;
		electrodomesticos[1]=elec2;
		electrodomesticos[2]=elec3;
		electrodomesticos[3]=elec4;
		electrodomesticos[4]=elec5;
		electrodomesticos[5]=elec6;
		electrodomesticos[6]=elec7;
		electrodomesticos[7]=elec8;
		electrodomesticos[8]=elec9;
		electrodomesticos[9]=elec10;
		
		for (Electrodomestico electrodomestico : electrodomesticos) {
			electrodomestico.precioFinal();
			if (electrodomestico instanceof Lavadora) {
				precioLavadora= precioLavadora+electrodomestico.precioFinal;
				precioElectro = precioElectro+electrodomestico.precioFinal;
			}else {
				if (electrodomestico instanceof Television) {
					precioTele= precioTele+electrodomestico.precioFinal;
					precioElectro = precioElectro+electrodomestico.precioFinal;
				}else {
					precioElectro = precioElectro+electrodomestico.precioFinal;
				}
			}
		}
		System.out.println("-------------------LISTA DE PRECIOS----------------");
		System.out.println("Precion electrodomesticos=" +precioElectro);
		System.out.println("Precion lavadoras=" +precioLavadora);
		System.out.println("Precion televisores=" +precioTele);
	}
	
	
}

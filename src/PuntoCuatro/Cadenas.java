package PuntoCuatro;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sCadena = "AjklsandlkanlkLKDNKL";
		char[] bCaracteres = sCadena.toCharArray();
		
		for (int i = 0; i < bCaracteres.length; i++) {
			System.out.print(bCaracteres[i]);
			
		}
		Arrays.sort(bCaracteres);
		System.out.println(" ");
		System.out.println("La letra menor es: "+bCaracteres[0]);
		System.out.println("La letra mayor es: "+bCaracteres[bCaracteres.length-1]);
		
		for (int i = 0; i < bCaracteres.length; i++) {
			System.out.print(bCaracteres[i]);
		}
		System.out.println(" ");
		System.out.println("El valor ASCII del caracter sumando "+bCaracteres[0]+" y "+bCaracteres[bCaracteres.length-1]+" es: "+(bCaracteres[0]+bCaracteres[bCaracteres.length-1]));
		int suma =  bCaracteres[0]+bCaracteres[bCaracteres.length-1];
		char n = (char) suma;
		System.out.println("El caracter es : "+n);
				
		int contador = 1;
		for (int i = 0; i < bCaracteres.length-1; i++) {
				if(bCaracteres[i]==bCaracteres[i+1]) {
					contador++;
				}else{
					System.out.println(bCaracteres[i]+": "+contador);
					contador = 1;
				}			
		}
		
		
	}
	
}
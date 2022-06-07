package PuntoTres;

import javax.swing.JOptionPane;

public class NumeroArmstrong {
	public static void main(String[] args) {
 
		
        int A = 0, B = 0;
        boolean validar= false;
        A = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero A"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero B"));
        do {
			if (B>A) {
				validar = true;
			}else {
				JOptionPane.showMessageDialog(null, "Por favor ingrese un numero mayor a "+A);
				B = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero B"));	
			}
			
		} while (!validar);
        for(int number = A + 1; number < B; ++number) {


            if (checkArmstrong(number))

                System.out.print(number + " ");

        }

    }


    public static boolean checkArmstrong(int num) {

        int digits = 0;

        int result = 0;

        int originalNumber = num;


        // number of digits calculation

        while (originalNumber != 0) {

            originalNumber /= 10;
            ++digits;

        }


        originalNumber = num;


        // result contains sum of nth power of its digits

        while (originalNumber != 0) {

            int remainder = originalNumber % 10;

            result += Math.pow(remainder, digits);

            originalNumber /= 10;

        }


        if (result == num) { 
        	return true;
        }

        return false;

    }
}

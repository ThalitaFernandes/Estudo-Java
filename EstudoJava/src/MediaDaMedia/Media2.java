//Fazer um programa que imprima a m�dia aritm�tica dos n�meros 8,9 e 7. A m�dia dos n�meros 4, 5 e 6. A soma das duas m�dias. A m�dia das m�dias.

package MediaDaMedia;

import javax.swing.JOptionPane;

public class Media2 {

	public static void main(String[] args) {
		double media1, media2, soma, mediaM;
		media1 = (8+9+7)/3;
		media2 = (4+5+6)/3;
		soma = media1 + media2;
		mediaM = soma/2;
		
		JOptionPane.showMessageDialog(null, "M�dia dos n�meros 8, 9 e 7 = " + media1 + "\nM�dia dos n�meros 4, 5 e 6 = " + media2 +  "\nSoma das m�dias = " + soma + "\nM�dia das m�dias = " +mediaM);

	}

}

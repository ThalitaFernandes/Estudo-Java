//Escreva um programa em Java que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K) e Fahrenheit (F), seguindo as f?rmulas: F = C * 1.8 + 32 e K = C + 273.15

package Temperatura;

import javax.swing.JOptionPane;

public class Temperatura {

	public static void main(String[] args) {
		double tempC;
		double f,k;
		tempC = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em graus celsius: "));
		f = tempC * 1.8 + 32;
		k = tempC + 273.15;
		JOptionPane.showMessageDialog(null, "A temperatura " + tempC + " em calsius para:\nFahrenheit = " + f + "\nKelvin = " +k);
	}

}

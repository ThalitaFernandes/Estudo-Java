//Construa uma classe Java que pe?a o Nome, Endere?o, Sexo, Cidade, Estado, Idade dos funcion?rios. Al?m disto, dado o Sal?rio Bruto do funcion?rio, calcule o seu Sal?rio L?quido. 
//Considere que os descontos podem ser o Vale Transporte (2%), Vale Alimenta??o (5%) e Plano de Sa?de (10%).

package Salario;

import javax.swing.JOptionPane;

public class SalarioLiquido {

	public static void main(String[] args) {
		String nome, end, sexo, cidade, estado;
		int idade;
		double salarioBruto, salarioLiquido;
		double transporte, alimentacao, saude;
		
		nome = JOptionPane.showInputDialog("informe o nome do funcion?rio: ");
		end = JOptionPane.showInputDialog("informe o endere?o do funcion?rio: ");
		sexo = JOptionPane.showInputDialog("informe o sexo do funcion?rio: ");
		cidade = JOptionPane.showInputDialog("informe a cidade do funcion?rio: ");
		estado = JOptionPane.showInputDialog("informe o estado do funcion?rio: ");
		salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("informe o sal?rio bruto do funcion?rio: "));
		
		transporte = salarioBruto*0.02;
		alimentacao = salarioBruto*0.05;
		saude = salarioBruto*0.1;
		salarioLiquido = salarioBruto-(transporte+alimentacao+saude);
		
		JOptionPane.showMessageDialog(null, "Ol? " + nome + ". Seu sal?rio  l?quido ?  R$ " + salarioLiquido);

	}

}

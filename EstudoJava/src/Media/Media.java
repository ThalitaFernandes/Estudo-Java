//Elabore um programa em Java que calcule a m�dia de um aluno para a mat�ria de matem�tica. O aluno deve informar seu nome e as quatro notas da mat�ria.

package Media;

import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {
		
		String nome;
		float notas[] = new float[4];
		int i;
		float soma = 0;
		float media;
		
		JOptionPane.showMessageDialog(null, "C�lculo da m�dia em matem�tica");
		nome = JOptionPane.showInputDialog("informe o nome do aluno: ");
		for(i = 0; i < 4; i++) {
			notas[i] = Float.parseFloat(JOptionPane.showInputDialog("Nota: ", i));
			soma+=notas[i];
		}
		media = soma/4;
		JOptionPane.showMessageDialog(null, "Ol� " + nome + ". Sua m�dia em matem�tica � " + media);
	}

}

package projetoCosmeSoares;

import javax.swing.JOptionPane;

public class Cosme {

	private static int a = 0;
	private static int b = 0;
	private int resultado = 0;

	public void soma(Integer a_in, Integer b_in){
		resultado = a + b;
		System.out.println("O resultado é: " + resultado);
	}	
	public static void main (String[] args) {

		Cosme cosme = new Cosme();

		String aString = JOptionPane.showInputDialog("Insira o primeiro número: ");
		String bString = JOptionPane.showInputDialog("Insira o primeiro número: ");

		a = Integer.parseInt(aString);
		b = Integer.parseInt(bString);

		cosme.soma(a, b);
	}
}
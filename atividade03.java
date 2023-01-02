import javax.swing.*;

class atividade03
{ 
	public static void main(String entrada[])
	{
		int n1, n2;
		int mod;
		double raiz1, raiz2;
		String msg = "";
		//VAR
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero imteiro"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro"));
		mod = n1 % n2;
		raiz1 = Math.sqrt(n1);
		raiz2 = Math.sqrt(n2);
		//INICIO
		msg = msg + "Resto da divisao de " + n1 + " por " + n2 + " = " + mod + "\n";
		msg = msg + "A raiz quadrada de " + n1 + " = " + raiz1 + "\n";
		msg = msg +"A raiz quadrada de " + n2 + " = " + raiz2 + "\n";
		JOptionPane.showMessageDialog(null, msg);
		
		System.exit(0);
	}
}
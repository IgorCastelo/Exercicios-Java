import javax.swing.*;

class prog08Mod
{
	public static void soma()
	{
		int n1, n2, res;
		
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("SOMA : \n\nDigite um numero"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
		res = n1 + n2;
		
		JOptionPane.showMessageDialog(null," O resultado da soma de " + n1 +  " + " + n2 + " = " + res);
	}
	
	public static void subtracao(int x, int y)
	{
		int z;
		z = (x-y);
		JOptionPane.showMessageDialog(null," A diferenca de " + x + " - " + y + " = " + z);
	}
	
	public static int produto()
	{
		
		int n1 , n2 ;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("MULTIPLICACAO : \n\nDigite um numero"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
		
		return (n1*n2); 
	}
	
	public static double divisao(int x, int y)
	{
		double res;
		
		res = (double)x / (double)y;
		
		return 	res;
	}
		
	public static void main(String entrada[])
	{
		int n1, n2, s;
		double d;
		
		soma();
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
		
		subtracao(n1,n2);
		s = produto();
		JOptionPane.showMessageDialog(null, " O produto eh " + s);
		d = divisao(n1,n2);
		JOptionPane.showMessageDialog(null, " A divisao eh " + d);
		System.exit(0);
	}
}
		/*TODO MÉTODO, QUE POSSUI PARAMETROS, PODE RECEBER O VALOR DE UMA VARIÁVEL COMO PARAMETRO REAL E INSERILA-Á NO PARAMETRO FORMAL DO MÉTODO,
		CONTANTO QUE A VARIÁVEL INSERIDA, NO PARAMETRO REAL, TENHA UM CORRESPONDENTE DO MESMO TIPO NO PARAMETRO FORMAL.*/
import javax.swing.*;

class testeFor
{
	public static void main(String entrada[])
	{
		int num, tabuada;
		char op = 0;
		String soma="";
		num = Integer.parseInt(JOptionPane.showInputDialog(int));
		tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero pra calcular sua tabuada"));
		
		
		
				
				for(int i = 0; i<=10; i=i+1)
				{
				num = num + i;
				}
				JOptionPane.showMessageDialog(null, num);
	System.exit(0);
	}
}
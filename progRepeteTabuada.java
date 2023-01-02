import javax.swing.*;

class progRepeteTabuada
{
	public static void main(String entrada[])
	{
		int tabuada;
		char op = 0;
		String msg = "",soma="", msgEntr = "Digite 1 para repetição For\n Digite 2 para a repetição While\n Digite 3 para a repetição Do/While";
		
		tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero pra calcular sua tabuada"));
		op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);
		
		switch(op)
		{
			case '1':
			{ 	msg = msg + "Tabuada do " + tabuada + " pelo For \n\n";
				for(int i = 0; i<=10; i=i+1)
				{
				msg = msg + tabuada + " * " + i + " = " + tabuada*i ;
				}
				break;
			}
			case '2':
			{	msg = msg + "Tabuada do " + tabuada + " pelo while \n\n";
				int i = 1;
				while(i<=10)
				{
				msg = msg + tabuada + " * " + i + " = " + tabuada*i + "\n";
				i = i + 1;
				}
				break;
			}
			case '3':
			{ 	msg = msg + "Tabuada do " + tabuada + " pelo metodo Do/While: \n";
				int i = 1;
				do
				{
					msg = msg + tabuada + " * " + i + " = " + tabuada*1 + "\n";
					i = i+1;
				} while (i<=10);
				break;
			}
			default: JOptionPane.showMessageDialog(null, "Opcao invalida, calculos nao realizados");
		}				
		
		if( op >= '1' && op <= '3') 
		{
			JOptionPane.showMessageDialog(null, msg);			
		}
		System.exit(0);
	}
}
				
		
		
	
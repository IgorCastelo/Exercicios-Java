import javax.swing.*;

class programa05
{
	public static void main(String entrada[])
	{
		int n1, n2, soma = 0;
		char op = 0;
		String menu = "", msg = "", msgEntr = "Digite 1 para adicao\n Digite 2 para somatoria\n";

		
		n1 = Integer.parseInt(JOptionPane.showInputDialog(" Digite o primeiro numero"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog(" Digite o segundo numero"));
		op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);
		
		switch(op)
		{
			case'1':
			{
				if (n1%2 == 0 && n2%2 == 0)
				{
					soma = n1+ n2;
					msg = msg + " A soma de " + n1 + " + " + n2 + " = " + soma+ "\n\n";
				} 
				break;	
			}
			case '2':
			{
				
				for (int i = 1; i<=n2; i=i+1)
				{
					soma = soma + n1;
				}
				msg = msg + " somatoria de " + n1 + " , " + n2 + " vezes eh : " + soma + "\n\n";
				break;
			}
			default: JOptionPane.showMessageDialog(null,"opcao invalida, calculos nao realizados");
		}
		if (op >= '1' && op <= '2')
		{
			JOptionPane.showMessageDialog(null,msg);
		}
		System.exit(0);
	}
}
				
			
				
		
		
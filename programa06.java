import javax.swing.*;

class programa06
{
	public static void main( String entrada[])
	{
		int n1, n2, produto, produtoria = 1;
		char op = 0;
		String msg ="", msgEntr = " Opcao 1 calcula o produto de dois numeros (se eles forem positivos) \n\n Opcao 2 calcula a produtoria  \n\n ";
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog(" Digite o primeiro numero: \n\n"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog(" Digite o segundo numero: \n\n"));
		op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);
		
		switch(op)
		{
			case '1':
			{
				if(n1>0 && n2>0)
				{
					produto = n1*n2;
					msg = msg + " O produto de " + n1 + " * " + n2 + " = " + produto + "\n\n";
				}
				break;
			}
			case '2':
			{
				for(int i = 1; i<=n2; i = i+1)
				{
					produtoria = produtoria * n1;
				}
				msg = msg + "A produto de " + n1 + ", " + n2 + " vezes eh : " + produtoria + "\n\n";
				break;
			}
			default: JOptionPane.showMessageDialog(null, " Opcao invalida, nenhum calculo realizado.");
		}
		if (op >= '1' && op <= '3') 
		{
			JOptionPane.showMessageDialog(null,msg);
		}
		System.exit(0);
	}
}
			
				
				
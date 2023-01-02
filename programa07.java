import javax.swing.*;

class programa07
{
	public static void main(String entrada[])
	{
		int vetor[] = {2,4,6,5,10};
		int matriz[][]= new int[2][3]; 
		String msg = " vetor = [ ";
		//vetor=;)
		{
		for(int i = 0; i < vetor.length; i++
			msg = msg + vetor[i] + " ";
		}
		msg = msg + "]";
		JOptionPane.showMessageDialog(null,msg);
		
		msg = " Matriz = \n";
		msg = msg + "        ";
		for(int i = 0; i < matriz.length; i++)
		{	
			for(int j = 0; j < matriz[0].length; j++)
			{
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para a coluna " + i + " e outro para a coluna " + j )); 
				msg = msg + matriz[i][j] + "    ";
			}
			msg = msg +" \n" + "        ";
		}
			
		JOptionPane.showMessageDialog(null,msg);
		System.exit(0);
	}
}

/*msg = " vetor ="
  msg [0] = " vetor = 2"
  msg [1] = " vetor = 2" + 4
  msg [2] = " vetor = 2,4 " + 6*/ 
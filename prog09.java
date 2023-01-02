import javax.swing.*;

class prog09
{
	
//ADICIONA VALOREES A UM VETOR
	public static int somatorio (int array []) // funções devem ser declaradas como INT, poís esse tipo de função retorna valor, ao contrario da função do tipo main.
	{ 
		int s = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			s = s + array[i];
		}
		return s;
	}
	
	public static void main (String entrada[])
	{
		int r, vetor[] = new int [5];
		String msg = "Os numeros da Lista sao: \n [  ";
		
		for(int i = 0; i < vetor.length; i++)
		{ 
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para a posicao " + i));
			msg = msg + vetor[i] + "  " ;
		}
			msg = msg + " ] ";
		JOptionPane.showMessageDialog(null,msg);
		
		r = somatorio(vetor);
		
		JOptionPane.showMessageDialog(null,"A soma dos numeros contidos na lista eh: " + r);
		System.exit(0);
	}
}

import javax.swing.*;

class prog10
{
	public static void somatorio()
	{
		int s = 0;
		
		int vetor[] = {1,1,1,1,1,1};
		
		
		for(int i = 0; i < vetor.length; i++)
		{ 
			s = s + vetor[i];
		}
		JOptionPane.showMessageDialog(null,"A soma dos numero contido no vetor eh: " + s);
	}
	public static int produtoria()
	{
		int vetor[] = {1,1,1,1,1,1};
		int p = 1;
		
		for(int i = 0; i < vetor.length; i++)
		{ 
			p = p * vetor[i];
		}

		return p;
	}
	public static void main (String entrada[])
	{		
		int r ;
		
		somatorio();
		r = produtoria();
		JOptionPane.showMessageDialog(null," O produtoria de todos os numero contidos no vetor eh " + r);
	System.exit(0);
	}
}
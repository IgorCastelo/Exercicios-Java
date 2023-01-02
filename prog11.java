import javax.swing.*;

class prog11
{
	public static void somatorio(int vetor[])// PROCEDIMENTO
	{
		int s = 0;

		for(int i = 0; i < vetor.length; i++)
		{ 
			s = s + vetor[i];
		}
		JOptionPane.showMessageDialog(null,"A soma dos numeros contidos no vetor eh: " + s);
	}
	public static int produtoria(int vetor[])// FUNÇÃO
	{
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
		int array[] = {1,1,1,1,1};
		
		somatorio(array);// PROCEDIMENTO POR PARâMETRO DE VALOR 
		r = produtoria(array);// FUNÇÃO POR PARâMETRO DE VALOR
		JOptionPane.showMessageDialog(null," O produtoria de todos os numeros contidos no vetor eh " + r);
	System.exit(0);
	}
}
/*TODO MÉTODO, QUE POSSUI PARAMETROS, PODE RECEBER O VALOR DE UMA VARIÁVEL COMO PARAMETRO REAL E INSERILA-Á NO PARAMETRO FORMAL DO MÉTODO,
		CONTANTO QUE A VARIÁVEL INSERIDA, NO PARAMETRO REAL, TENHA UM CORRESPONDENTE DO MESMO TIPO NO PARAMETRO FORMAL.*/
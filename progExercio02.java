import javax.swing.*;

class progExercio02
{
	public static void main(String Entrada[])
	{
		int n;
		double cosciente = 1, divisor = 51,somatorio = 0;
		
		for (int i = 1; i < divisor; i++)
		{
			cosciente = 2*cosciente;
			divisor = divisor - 1;
			somatorio = somatorio + (double cosciente/ double somatorio);
		}
		JOptionPane.showMessageDialog(null,somatorio);
		System.exit(0);
	}
}
			
		
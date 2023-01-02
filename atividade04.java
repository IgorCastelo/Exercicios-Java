import javax.swing.*;

class atividade04{
	
	public static void main(String entrada[]){
		int n1,n2,quo,rest;
		double  pot;
		String msg = "";
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog(" Digite o segundo numero"));
		
		quo = (int)n1 / (int)n2;
		rest = n1%n2;
		pot = Math.pow(n1,n2);
		
		msg = " O quociente da divisao de " + n1 + " por " + n2 + " = " + quo + "\n";
		msg = msg +	" O resto da divisao de " + n1 + " por " + n2 + " = " + rest + "\n";
		msg = msg + " A potencia de " + n1 + " por " + n2 + " = " + pot + "\n";
		JOptionPane.showMessageDialog(null,msg);
		
		System.exit(0);
	}
}
		
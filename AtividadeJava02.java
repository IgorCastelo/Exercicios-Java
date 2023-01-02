class AtividadeJava02
{
	public static void main (String entrada[])
{
		int Num1, Num2;
		int mod, div;
		double raiz, pot;
		String msg = "";
	
		Num1 = Integer.parseInt(entrada[0]);
		Num2 = Integer.parseInt(entrada[1]);
	
		mod = Num1 % Num2;
		div = (int)Num1/(int)Num2;
		raiz = Math.sqrt(Num1);
		pot = Math.pow(Num1,Num2);
	
	    msg = ("------------------------------------------------------\n\n");
		msg = msg +  (" SAIDA: \n\n");
		msg = msg + (" Num1 = "+ Num1 +" e Num2 = "+ Num2+"\n");
		msg = msg + (" Resto da divisao de Num1 por Num2  : " + mod+ "\n");
		msg = msg + (" Quociente da divisao de num1 por num2 : "+ div+"\n");	
		msg = msg + (" Raiz quadrada de Num1 : " + raiz+"\n");
		msg = msg + (" Potencia de Num1 elevado a Num2: "+ pot+ "\n");
		System.out.println(msg);
		System.exit(0);
	}
}
	
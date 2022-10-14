package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		
		// Tipos Numéricos Inteiros
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//Tipos Numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2991797103.01;
		
		//Tipos booleanos
		boolean ferias = false; //True
		
		//Tipo caractere
		char status = 'A'; //ativo / Aceita uma única Letra com ''
		
		
		//Dias de Empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de viagens
		System.out.println(numerosDeVoos / 2);
		
		//Pontos por Real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		//Salario por ID
		System.out.println(id + " ganha-> "+ salario);
		
		//Se está de Férias
		System.out.println("Férias? " + ferias);
		
		//Status
		System.out.println("Status: " + status);
	}
}

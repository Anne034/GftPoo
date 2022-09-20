package funcionario;

public class Main {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		Supervisor supervisor = new Supervisor();
		Vendedor vendedor = new Vendedor();
		
		gerente.setSalario(5000);
		supervisor.setSalario(5000);
		vendedor.setSalario(5000);
		
		System.out.println("Salario do Gerente:" + gerente.Bonificacao());
		System.out.println("Salario do Supervisor:" + supervisor.Bonificacao());
		System.out.println("Salario do Vendedor:" + vendedor.Bonificacao());
	
	}

}

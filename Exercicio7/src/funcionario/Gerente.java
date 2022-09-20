package funcionario;

public class Gerente extends Funcionario {

	@Override
	public double Bonificacao()
	{
		return super.Bonificacao() + 10000;
	}

}

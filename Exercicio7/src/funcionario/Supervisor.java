package funcionario;

public class Supervisor extends Funcionario {
	@Override
	public double Bonificacao()
	{
		return super.Bonificacao() + 5000;
	}
}

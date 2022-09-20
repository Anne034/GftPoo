package funcionario;

public class Vendedor extends Funcionario {
	@Override
	public double Bonificacao()
	{
		return super.Bonificacao() + 3000;
	}
}

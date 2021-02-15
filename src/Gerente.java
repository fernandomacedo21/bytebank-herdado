//Gerente é um funcionario , Gerente herda da class Funcionario, assina o contrato Autenticavel, é um Autenticável
public class Gerente extends Funcionario implements Autenticavel{

	public double getBonificacao() {
			System.out.println("Chamando o metodo de bonificacao do Gerente");
			return super.getSalario();
		}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha){
			return true;
		} else{
			return false;
		}
	}
}


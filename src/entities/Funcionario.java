package entities;

public class Funcionario {
	
	public String funcionario;
	public double salarioBruto;
	public double taxa;
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
	}
	public void aumentoSalario(double percentage) {
		this.salarioBruto += (salarioBruto * percentage / 100); 
	}
	
	public String toString() {
		return funcionario +", $ " + String.format("%.2f", salarioLiquido());
	}

}

package lista5.exerc2.itemB;


public class Homem extends Pessoa{
	private Integer qtdTestosterona;

	public Homem(String nome, String anoNasc, String cpf, Integer qtdTestosterona) {
		super(nome, anoNasc, cpf);
		this.qtdTestosterona = qtdTestosterona;
	}

	public Integer getQtdTestosterona() {
		return qtdTestosterona;
	}

	public void setQtdTestosterona(Integer qtdTestosterona) {
		this.qtdTestosterona = qtdTestosterona;
	}
	
	
}

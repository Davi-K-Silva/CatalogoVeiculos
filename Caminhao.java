public class Caminhao implements Veiculo {
    String nome;
    String tipo;
    String tipoCarteira;
    String modelo;
    String cor;
    double preco;
    int numeroPortas;

    Caminhao(String nome, String tipo, String tipoCarteira, String modelo, String cor, double preco, int numeroPortas){
		
		this.nome = nome;
		this.tipo = tipo;
		this.tipoCarteira = tipoCarteira;
		this.modelo = modelo;
		this.cor = cor;
		this.preco = preco;
		this.numeroPortas = numeroPortas;
	}


	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipoCarteira() {
		return this.tipoCarteira;
	}

	public void setTipoCarteira(String tipoCarteira) {
		this.tipoCarteira = tipoCarteira;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getNumeroPortas() {
		return this.numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}


}

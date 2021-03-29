public class Carro implements Veiculo {
    
    String nome;
    String tipo;
    String tipoCarteira;
    String modelo;
    String cor;
    double preco;
    int numeroPortas;
	double peso;
	int maxPassageiros;
	double pesoBagagem;


	

	Carro(String nome, String tipo, String tipoCarteira, String modelo, String cor, double preco, int numeroPortas, double peso, int maxPassageiros, double pesoBagagem){
		
		this.nome = nome;
		this.tipo = tipo;
		this.tipoCarteira = tipoCarteira;
		this.modelo = modelo;
		this.cor = cor;
		this.preco = preco;
		this.numeroPortas = numeroPortas;
		this.peso = peso;
		this.maxPassageiros = maxPassageiros;
		this.pesoBagagem = pesoBagagem;
	}

	public double getPesoMax(){
		return peso + (maxPassageiros * 80) + pesoBagagem;
	}

	public String getNome() {
		return this.nome;
	}

	public String getTipo() {
		return this.tipo;
	}

	public String getTipoCarteira() {
		return this.tipoCarteira;
	}

	public String getModelo() {
		return this.modelo;
	}

	public String getCor() {
		return this.cor;
	}

	public double getPreco() {
		return this.preco;
	}

	public int getNumeroPortas() {
		return this.numeroPortas;
	}

	public double getPeso() {
		return this.peso;
	}

	public int getMaxPassageiros() {
		return this.maxPassageiros;
	}

	public double getPesoBagagem() {
		return this.pesoBagagem;
	}

}

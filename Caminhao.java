public class Caminhao implements Veiculo {
    String nome;
    String tipo;
    String tipoCarteira;
    String modelo;
    String cor;
    double preco;
    int numeroPortas;
	int maxPassageiro;
	double peso;
	double pesoCarga;
	double pesoBau;

    Caminhao(String nome, String tipo, String tipoCarteira, String modelo, String cor, double preco, int numeroPortas, int maxPassageiros, double peso, double pesoCarga, double pesoBau){
		
		this.nome = nome;
		this.tipo = tipo;
		this.tipoCarteira = tipoCarteira;
		this.modelo = modelo;
		this.cor = cor;
		this.preco = preco;
		this.numeroPortas = numeroPortas;
		this.maxPassageiro = maxPassageiros;
		this.peso = peso;
		this.pesoCarga = pesoCarga;
		this.pesoBau = pesoBau;
	}

	public double getPesoMax() {
		return peso + (maxPassageiro * 80) + pesoCarga + pesoBau;
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
		return this.maxPassageiro;
	}

	public double getPesoCarga() {
		return this.pesoCarga;
	}

}

public class Moto implements Veiculo {

    String nome;
    String tipo;
    String tipoCarteira;
    String modelo;
    String cor;
    double preco;
    int numeroPortas;
	double peso;
	int maxPassageiros;


    Moto(String nome, String tipo, String tipoCarteira, String modelo, String cor, double preco, int numeroPortas, double peso, int maxPassageiros){
		
		this.nome = nome;
		this.tipo = tipo;
		this.tipoCarteira = tipoCarteira;
		this.modelo = modelo;
		this.cor = cor;
		this.preco = preco;
		this.numeroPortas = numeroPortas;
		this.peso = peso;
		this.maxPassageiros = maxPassageiros;
	}

	public double getPesoMax(){
		return peso + maxPassageiros*80;
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

}

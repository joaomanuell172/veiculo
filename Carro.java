public class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, int ano, int portas) {
        super(marca, ano); // Chama o construtor da classe pai
        this.portas = portas;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // Aproveita a base
        System.out.println("Número de portas: " + portas);
    }
}

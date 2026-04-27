public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, int ano, int cilindradas) {
        super(marca, ano); // Chama o construtor da classe pai
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // Aproveita a base
        System.out.println("Cilindradas: " + cilindradas + "cc");
    }
}

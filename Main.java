public class Main {
    public static void main(String[] args) {
        // Criando objetos
        Carro meuCarro = new Carro("Toyota", 2024, 4);
        Moto minhaMoto = new Moto("Honda", 2023, 160);

        // Exibindo as informações
        System.out.println("--- Informações do Carro ---");
        meuCarro.exibirInformacoes();

        System.out.println("\n--- Informações da Moto ---");
        minhaMoto.exibirInformacoes();
    }
}

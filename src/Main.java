public class Main {
    public static void main(String[] args) {
        var masculino = new Pessoas();
        masculino.setNome("João");
        masculino.setIdade(25);
        var feminino = new Pessoas();
        feminino.setNome("Maria");
        feminino.setIdade(23);
        masculino.setNome("Pedro");
        masculino.setIdade(30);
        masculino.setEndereco("Rua A, 123");
        System.out.println("Masculino: " + masculino.getNome() + " idade " + masculino.getIdade());
        System.out.println("Feminino: " + feminino.getNome() + " idade " + feminino.getIdade());
        System.out.println("Endereço do masculino: " + masculino.getEndereco());
    }
}

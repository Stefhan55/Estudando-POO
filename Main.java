package Encapsulamento_POO;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        // Usando o setter para definir a senha
        conta.setSenha("1234567");

        // Usando o getter para obter a senha e imprimir
        System.out.println("A senha é: " + conta.getSenha());
    }
}

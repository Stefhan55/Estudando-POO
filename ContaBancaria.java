package Encapsulamento_POO;

public class ContaBancaria {
    private String Senha; // Atributo privado

    // Método setter (para definir a senha)
    public void setSenha(String novaSenha) {
        this.Senha = novaSenha; // Armazena a senha na variável Senha
    }

    // Método getter (para obter a senha)
    public String getSenha() {
        return this.Senha; // Retorna a senha armazenada
    }
}


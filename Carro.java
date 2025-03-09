package Abstracao_POO;
abstract class Veiculo{
    abstract void ligar();
    abstract void acelerar();
    abstract void frear();

}
public class Carro extends Veiculo{

    @Override
    void ligar() {
        System.out.println("O carro está Ligando...");
    }

    @Override
    void acelerar() {
        System.out.println("O carro está acelerando");
    }

    @Override
    void frear() {
        System.out.println("O carro esta freando...");
    }

}

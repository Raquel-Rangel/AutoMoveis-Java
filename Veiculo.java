// Classe pai
 class Veiculo {
    String marca;
    int ano;

    Veiculo(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }

    void mostrarDetalhes(){
        System.out.println("Marca: " + marca + ", Ano: " + ano);
    }
}

// Classes filhas
class Carro extends Veiculo{
    int portas;

    Carro(String marca, int ano, int portas){
        super(marca, ano);
        this.portas = portas;
    }

    @Override
    void mostrarDetalhes(){
        super.mostrarDetalhes();
        System.out.println("Portas: " + portas);
    }
}

class Moto extends Veiculo{
    int cilindrada;

    Moto(String marca, int ano, int cilindrada){
        super(marca, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    void mostrarDetalhes(){
        super.mostrarDetalhes();
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }
}
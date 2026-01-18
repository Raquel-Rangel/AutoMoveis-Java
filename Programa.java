public class Programa {
    public static void main(String[] args){
        Veiculo carro = new Carro("Honda", 2020, 4);
        Veiculo moto = new Moto("Yamaha", 2018, 250);

        carro.mostrarDetalhes();
        System.out.println("---");
        moto.mostrarDetalhes();
    }
}

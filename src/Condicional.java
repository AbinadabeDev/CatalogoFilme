public class Condicional {
    public static void main(String[] args) {
        int ano = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.4;
        String tipoPlano = "plus";

        if (ano >= 2022){
            System.out.println("Lançamento que a galera está curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }
        if (incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Alugue pagando aqui.");
        }
    }
}

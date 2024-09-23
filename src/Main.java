public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Me Indica Aê!");
        System.out.println("Filme: Interestelar");

        int ano = 2022;
        System.out.println("Ano de Lançamento: " + ano);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.4;

        //Média calculada pelas 3 notas das críticas mais consistentes.
        //Quebrar o resultado em casas decimais
        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println("Media: " + media);
        String sinopse;
        sinopse = """
                Filme Interestelar
                Filme de ficção científica focado em teorias da conspiração e ultrarrealismo.
                Muito bom!
                Ano de lançamento
                """;
        //Pode quebrar a sinópse em text blocks também usando 3 aspas no começo e 3 no fim.
        //Pode usar o Método Formated também
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);






    }
}
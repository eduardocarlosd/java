public class PrimeiraClasse {
    public static void main (String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Harry Potter");

        int anoDeLancamento = 2023;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluindoPlano = true;
        System.out.println("O plano é: " + incluindoPlano);
        double notaDoFilme = 9.9;
        System.out.println("Nota do filme: " + notaDoFilme);
        //comentário
        /*outro tipo de comentário*/
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme: Senhor dos Anéis
                Filme de aventuta 
                Ano de lançamento: 2010
                Nota: 10
                """;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media/2);
        System.out.println(classificacao);

    }
}

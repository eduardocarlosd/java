public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        boolean incluindoPlano = false;
        double notaDoFilme = 9.9;
        String TipoPlano = "normal";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamento");
        }else{
            System.out.println("Filme retro");
        }
        //if (incluindoPlano == true || TipoPlano.equals("plus")){
        if (incluindoPlano == true || TipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        }else{
            System.out.println("Deve pagar a locação");
        }
    }
}

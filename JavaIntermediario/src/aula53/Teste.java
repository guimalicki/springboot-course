package aula53;

public class Teste {

    public static void main(String[] args) {
        usandoConstantes();
        imprimeDiaSemana(1);
    }

    private static void usandoEnums() {
        System.out.println(DiaSemana.SEGUNDA);
        System.out.println(DiaSemana.TERCA);
        System.out.println(DiaSemana.QUARTA);
        System.out.println(DiaSemana.QUINTA);
        System.out.println(DiaSemana.SEXTA);
        System.out.println(DiaSemana.SABADO);
        System.out.println(DiaSemana.DOMINGO);
    }

    private static void usandoConstantes(){
        int segunda = DiaSemanaConstantes.SEGUNDA;
        int terca = DiaSemanaConstantes.TERCA;
        int quarta = DiaSemanaConstantes.QUARTA;
        int quinta = DiaSemanaConstantes.QUINTA;
        int sexta = DiaSemanaConstantes.SEXTA;
        int sabado = DiaSemanaConstantes.SABADO;
        int domingo = DiaSemanaConstantes.DOMINGO;

        System.out.println(segunda);
        System.out.println(terca);
        System.out.println(quarta);
        System.out.println(quinta);
        System.out.println(sexta);
        System.out.println(sabado);
        System.out.println(domingo);
    }

    private static void imprimeDiaSemana(int dia) {
        switch (dia) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }

    }
}

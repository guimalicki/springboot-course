package aula53.aula54;

public class TesteEnum {

    static void main(String[] args) {
        DiaSemana dia = DiaSemana.DOMINGO;

        //ToString Retorna o nome da ENUM e o getValor() o valor atribuido
        System.out.println(dia.toString() + " - " + dia.getValor());
    }
}

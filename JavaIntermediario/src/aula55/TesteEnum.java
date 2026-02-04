package aula55;

public class TesteEnum {

   public static void main(String[] args) {
       DiaSemana[] dias = DiaSemana.values(); //retorna um array de todos os valores de um enum

       DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");

       System.out.println(dia);

       for (int i = 0 ; i < dias.length; i++){
           System.out.println(dias[i]);
       }

    }
}

package aula57;

public class TesteWrapper {



    static void main(String[] args) {

        short num1 = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 10000;
        float num5 = 3.5f;
        double num6 = 3.55555;
        boolean flag = true;
        char a = 'a';

        //Wrappers - classes que representam os tipos primitivos
        Short num7 = 1;
        Byte num8 = 10;
        Integer num9 = 100;
        Long num10 = 10000l;
        Float num11 = 3.5f;
        Double num12 = 3.5555;
        Boolean flag2 = true;
        Character b = 'b';

        Integer num13 = Integer.valueOf("1000"); //Converte a string para integer
        Double num14 = Double.valueOf("3.5");

        //Conversões de valores
        System.out.println(num13.shortValue());
        System.out.println(num13.longValue());
        System.out.println(num13.toString());

        //Transformar uma string em um outro tipo.
        int num16 = Integer.parseInt("10000");

        System.out.println(num9.equals(num13));
    }
}

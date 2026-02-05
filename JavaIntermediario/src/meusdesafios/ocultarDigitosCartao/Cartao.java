package meusdesafios.ocultarDigitosCartao;

public class Cartao {

    static void main(String[] args) {

        String creditCarNumber = "1234567890123456";

        System.out.println("Cartão " + creditCarNumber);

        char[] digits = new char[creditCarNumber.length()];

        for (int i = 0; i < creditCarNumber.length(); i++)  {

            if (i < 12) {
                digits[i] = '*';
                continue;
            }
            digits[i] = creditCarNumber.charAt(i);
        }

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < digits.length; i++){
            resultado.append(digits[i]);

            if ((i + 1) % 4 == 0 && i != digits.length - 1) {
                resultado.append("-");
            }
        }

        System.out.println(resultado.toString());
    }
}

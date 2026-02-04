package calculadoraaula56;

public class Calculadora {

    enum Operacao{
        SOMAR("+") {
            @Override
            public double executarOperacao(double x, double y) {
                return x + y;
            }
        }, SUBTRAIR("-") {
            @Override
            public double executarOperacao(double x, double y) {
                return x - y;
            }
        }, MULTIPLICAR("*") {
            @Override
            public double executarOperacao(double x, double y) {
                return x * y;
            }
        }, DIVIDIR("/") {
            @Override
            public double executarOperacao(double x, double y) {
                return x / y;
            }
        };

        private String simbolo;

        Operacao(String simbolo){ /* Construtor */
            this.simbolo = simbolo;
        }

        public abstract double executarOperacao(double x, double y);

        public String toString(){
            return this.simbolo;
        }
    }

    static void main(String[] args) {

        double x = 2;
        double y = 3;

        for (Operacao op : Operacao.values()) {
            System.out.print(x + " ");
            System.out.print(op.toString());
            System.out.print(" " + y + " = ");
            System.out.print(op.executarOperacao(x, y));
            System.out.println();
        }
    }
}

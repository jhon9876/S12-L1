import exceptions.UnknownOperationExceptions;

public class Calcolatrice {
    private double num1;
    private double num2;

    public Calcolatrice(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double Calcola(char operazione) throws UnknownOperationExceptions {
        switch (operazione) {
            case '+': {
                return this.num1 + this.num2;
            }
            case '*': {
                return this.num1 * this.num2;
            }
            case '/': {
                if (this.num2 == 0) {
                    throw new ArithmeticException("Divisione per 0 non permessa");
                } else return this.num1 / this.num2;
            }
            case '-': {
                return num1 - num2;
            }
            default: {
                throw new UnknownOperationExceptions("Errore");
            }
        }
    }
}

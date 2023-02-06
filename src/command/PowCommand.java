package command;

public class PowCommand extends BaseCommand implements Command {
    public PowCommand(int operationNumber, String operationName) {
        super(operationNumber, operationName);
    }

    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return Math.pow(firstNumber, secondNumber);
    }
}

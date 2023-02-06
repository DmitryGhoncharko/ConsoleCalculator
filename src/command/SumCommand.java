package command;

public class SumCommand extends BaseCommand implements Command {
    public SumCommand(int operationNumber, String operationName) {
        super(operationNumber, operationName);
    }

    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
}

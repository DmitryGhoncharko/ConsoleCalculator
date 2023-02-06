package command;

public class MultiplyCommand extends BaseCommand implements Command {
    public MultiplyCommand(int operationNumber, String operationName) {
        super(operationNumber, operationName);
    }

    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
}

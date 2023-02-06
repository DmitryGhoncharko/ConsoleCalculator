package command;

public class DivideCommand extends BaseCommand implements Command {
    public DivideCommand(int operationNumber, String operationName) {
        super(operationNumber, operationName);
    }

    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }
}

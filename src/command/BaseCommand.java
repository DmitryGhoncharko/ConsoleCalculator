package command;

public abstract class BaseCommand {
    private final int operationNumber;
    private final String operationName;

    public BaseCommand(int operationNumber, String operationName) {
        this.operationNumber = operationNumber;
        this.operationName = operationName;
    }

    public int getOperationNumber() {
        return operationNumber;
    }

    public String getOperationName() {
        return operationName;
    }
}

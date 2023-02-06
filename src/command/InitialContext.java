package command;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InitialContext {
    private static final List<Command> COMMANDS = new ArrayList<>();

    static {
        COMMANDS.add(new DivideCommand(1, "1.Divide"));
        COMMANDS.add(new MultiplyCommand(2, "2.Multiply"));
        COMMANDS.add(new PowCommand(3, "3.Pow"));
        COMMANDS.add(new SumCommand(4, "4.Sum"));
    }

    public Optional<Command> getCommand(int operationNumber) {
        for (Command command : COMMANDS) {
            BaseCommand baseCommand = (BaseCommand) command;
            if (baseCommand.getOperationNumber() == operationNumber) {
                return Optional.of(command);
            }
        }
        return Optional.empty();
    }

    public void printAllCommands() {
        for (Command command : COMMANDS) {
            BaseCommand baseCommand = (BaseCommand) command;
            System.out.println(baseCommand.getOperationName());
        }
    }
}

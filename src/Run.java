import command.InitialContext;
import datareader.ConsoleDataReader;

public class Run {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new ConsoleDataReader(), new InitialContext());
        calculator.start();
    }
}

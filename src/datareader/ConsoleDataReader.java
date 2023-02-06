package datareader;

import java.util.Scanner;

public class ConsoleDataReader implements DataReader {
    @Override
    public String readData() {
        return new Scanner(System.in).nextLine();
    }
}

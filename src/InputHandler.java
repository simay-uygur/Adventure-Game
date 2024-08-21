import java.util.Scanner;

public class InputHandler {

    private final Scanner scanner = new Scanner(System.in);

    public String getInput() {
        return scanner.next();
    }

    public void closeScanner() {
        scanner.close();
    }

}
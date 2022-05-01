//import function to read user input
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        //create a tool to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // variable msg is going to store user'input
        String msg = scanner.nextLine();
        
        System.out.println(msg);
    }
}

import java.util.Scanner;
import partnerships.*;

public class App {
    public static void main(String[] args) {
        
        // Scanning the user input for the partner's details
        Scanner scanner = new Scanner(System.in);
        
        String name, email;
        int partnerNumber, birth;

        System.out.print("Enter the partner's name: ");
        name = scanner.nextLine();
        System.out.print("Enter the partner's number: ");
        partnerNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()
        System.out.print("Enter the partner's email: ");
        email = scanner.nextLine();
        System.out.print("Enter the partner's birth year: ");
        birth = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        scanner.close();

        // Creating a new partner
        IndividualPartner individual_partner = new IndividualPartner(name, partnerNumber, email, birth);
        System.out.println(individual_partner.toString());
    }
}

package Grafos;
import java.util.List;

public class SocialNetworkApp {
    public static void main(String[] args) {
        // Exemplo de uso
        SocialNetworkController controller = new SocialNetworkController();

        controller.createMember("Alice", "alice.jpg");
        controller.createMember("Bob", "bob.jpg");
        controller.createMember("Charlie", "charlie.jpg");

        controller.createConnection("Alice", "Bob");
        controller.createConnection("Bob", "Charlie");

        List<Member> aliceContacts = controller.getContacts("Alice");
        System.out.println("Alice's contacts: " + aliceContacts);

        int bobReach = controller.getReach("Bob");
        System.out.println("Bob's reach: " + bobReach);

        controller.saveToCSV("dados.csv");
    }
}

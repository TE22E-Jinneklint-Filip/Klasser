import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Sagan om ringen", 228);
        Book book2 = new Book("Ondskan", 32);
        Book book3 = new Book("Jakten på den röda oktober", 96);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Hur många stenar vill du skapa: ");
        int numberOfRocks = scanner.nextInt();
        ArrayList<Rock> rockList = new ArrayList<>();

        for (int i = 0; i < numberOfRocks; i++) {
            System.out.println("Ange vikten för sten " + (i + 1) + ":");
            int weight = scanner.nextInt();
            Rock rock = new Rock(weight);
            rockList.add(rock);

        }
    }

}
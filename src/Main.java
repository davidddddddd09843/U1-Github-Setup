import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------");
        System.out.println("|Note: Please do not enter any symbols such as '$' or '%'|");
        System.out.println("-----------------------------------------------------------");
        System.out.println();
        System.out.print("Enter your bill amount ($): ");
        double billAmount = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter tip percent: ");
        double tipPercent = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter the amount of people in your party: ");
        int numOfPeople = scan.nextInt();
        scan.nextLine();
        System.out.println();
        double tipAmount = (double)(int)((((tipPercent / 100) * billAmount * 100)) + 0.5) / 100;
        double tipAmountPerPerson = (double)(int)((((tipAmount / 100) / ((double)numOfPeople / 100)) * 100) + 0.5) / 100;
        double billWithTip = (double)(billAmount / 100 + tipAmount / 100) * 100;
        double billPerPerson = (double)(int)(((double)billWithTip / 100) / ((double)numOfPeople / 100) * 100) / 100;
        System.out.println("-------------------------------------------");
        System.out.print("Total tip amount: ");
        System.out.printf("$%.2f\n", tipAmount);
        System.out.println("-------------------------------------------");
        System.out.print("Total bill cost: ");
        System.out.printf("$%.2f\n", billWithTip);
        System.out.println("-------------------------------------------");
        System.out.print("Tip per person: ");
        System.out.printf("$%.2f\n", tipAmountPerPerson);
        System.out.println("-------------------------------------------");
        System.out.print("Total bill per person: ");
        System.out.printf("$%.2f\n", billPerPerson);
        System.out.println("-------------------------------------------");




    }
}
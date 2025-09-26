import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter an integer:");
        int number = scanner.nextInt();
        if(number % 2 == 0){
            System.out.print(number + " is an Even Number");
        }else{
            System.out.print(number + " is an Odd Number");
        }
        scanner.close();
    }
    }

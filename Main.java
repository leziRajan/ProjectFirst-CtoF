import java.util.Scanner;

public class Main{
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("enter your number : ");
    int number = scanner.nextInt();

    if(number % 2 == 0) {
        System.out.println("Even");
    } else {
        System.out.println("odd");
    }

    scanner.close();
}
}

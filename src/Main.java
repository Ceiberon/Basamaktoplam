import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
int basNumber = 0;


        while (number != 0) {
            basNumber += number % 10;
            number /= 10;
        }
        System.out.println("basamaklar toplami : " + basNumber);
        }


    }

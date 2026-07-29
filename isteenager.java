import java.util.Scanner;
public class isteenager {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter birth year: ");
        int year = scan.nextInt();

        int age = 2026 - year;
        if (age >= 13 && age <=18){
            System.out.println("you are a teenager");
        }else{
            System.out.println("you are not a teenager");
        }

        scan.close();
        
    }
}

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        ///Task 1
        System.out.println("Hello World");
        //Task 2
        System.out.println("Введите своё имя");
        Scanner sc = new Scanner(System.in);
        String user = null;
        if (sc.hasNextLine()){
            user = sc.nextLine();
        }
        System.out.println("Hello " + user );
        sc.close();
    }
}

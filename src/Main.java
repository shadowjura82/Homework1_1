import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter any message for SkyPro");
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();
        String[] strArray = str.split(" ");
        for (String x : strArray) {
            System.out.println(x);
        }
    }
}
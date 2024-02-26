import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextInt();
        double x = sc.nextInt();
        double y = sc.nextInt();

        double total = n/(x+y);

        System.out.printf("%.2f\n",total);

        sc.close();
    }
}

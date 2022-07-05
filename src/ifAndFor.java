import java.io.IOException;
import java.util.Scanner;



public class ifAndFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int usd = sc.nextInt();
            double bgn = (usd * 1.64549);
            System.out.println(String.format("%.2f", bgn));
    }
}

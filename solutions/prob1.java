import java.util.*;
class prob1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            System.out.println("Enter number");
            int n = sc.nextInt();
            int prod = 1;
            for(int i=1; i<=n; i++)
                prod *= i;
            System.out.println(prod);
        }
    }
}
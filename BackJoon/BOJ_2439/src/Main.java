import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<=N; i++){
            for(int space=N-i; space>0; space--){
                System.out.print(" ");
            }
            for(int star=1; star <=i; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
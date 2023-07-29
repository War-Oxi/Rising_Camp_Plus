import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalAmount = sc.nextInt();
        int itemTypeCount = sc.nextInt();

        int realAmount=0;
        for(int i=0; i<itemTypeCount; i++){
            int price = sc.nextInt();
            int amount = sc.nextInt();

            realAmount += price * amount;
        }

        if(totalAmount == realAmount){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
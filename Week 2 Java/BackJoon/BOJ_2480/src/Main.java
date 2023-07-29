import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numCount = new int[7];
        for(int i=0; i<numCount.length; i++)
            numCount[i] = 0;

        int[] dices = new int[3];
        for(int i=0; i<dices.length; i++) {
            dices[i] = sc.nextInt();
            numCount[dices[i]]++;
        }

        int priceNum=0, maxReapeatedNum=0;
        for(int i=1; i<numCount.length; i++){
            if(numCount[i] >= maxReapeatedNum) {
                maxReapeatedNum = numCount[i];
                priceNum = i;
            }
        }

        if(maxReapeatedNum == 3){
            System.out.println(10000 + priceNum * 1000);
        } else if (maxReapeatedNum == 2) {
            System.out.println(1000 + priceNum * 100);
        } else {
            System.out.println(priceNum * 100);
        }
    }
}


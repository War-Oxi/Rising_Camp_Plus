import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int curHour, curMinute, durationHour, durationMinute;
        curHour = sc.nextInt();
        curMinute = sc.nextInt();
        durationMinute = sc.nextInt();

        durationHour = durationMinute / 60;
        durationMinute %= 60;

        // 분 구하기
        curMinute += durationMinute;
        if(curMinute >= 60){
            durationHour += 1;
            curMinute %= 60;
        }

        // 시 구하기
        curHour += durationHour;
        if(curHour >= 24)
            curHour %= 24;

        System.out.println(curHour + " " + curMinute);
    }
}
import java.util.Scanner;

public class LoopSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("양의 정수 n을 입력하세요: ");

        int n = sc.nextInt();
        int sumFor = 0;

        for (int i = 1; i <= n; i++) {

            sumFor += i;

        }

        System.out.println("for문으로 만든 1부터 " + n + "까지의 합: " + sumFor);

        int i = 1;
        int sumWhile = 0;

        while (i <= n) {

            sumWhile += i;
            i++;

        }

        System.out.println("while문으로 만든 1부터 " + n + "까지의 합: " + sumWhile);
        sc.close();

    }

}

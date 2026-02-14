import java.util.Scanner;

public class ArrayAvg {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {

            System.out.print((i + 1) + "번째 점수 입력: ");
            scores[i] = sc.nextInt();
            sum += scores[i];

        }

        double avg = (double) sum / scores.length;

        System.out.println("총합: " + sum);
        System.out.println("평균: " + avg);
        sc.close();

        int maxVal = scores[0];
        int minVal = scores[0];

        for (int num : scores) {

            maxVal = Math.max(maxVal, num);
            minVal = Math.min(minVal, num);

        }

        System.out.println("최고점: " + maxVal);
        System.out.println("최저점: " + minVal);

    }

}

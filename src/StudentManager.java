import java.util.ArrayList;

public class StudentManager {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        //학생 추가
        list.add(new Student("철수", 90));
        list.add(new Student("영희", 80));
        list.add(new Student("민수", 70));

        //전체 출력
        System.out.println("=== 학생 목록 ===");

        for (Student s : list) {

            s.printInfo();

        }

        //평균 계산
        int sum = 0;

        for (Student s : list) {

            sum += s.score;

        }

        double avg = (double) sum / list.size();

        System.out.println("평균 점수: " + avg);

    }

}

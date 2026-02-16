import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> list = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {

            printMenu();
            int menu = sc.nextInt();

            if (menu == 1) {

                addStudent();

            } else if (menu == 2) {

                printAll();

            } else if (menu == 3) {

                findByName();

            } else if (menu == 4) {

                deleteByName();

            } else if (menu == 5) {

                System.out.println("프로그램 종료");
                break;

            } else {

                System.out.println("잘못된 입력입니다.");

            }

        }

        sc.close();

    }

    static void printMenu() {

        System.out.println("\n=== 학생 관리 프로그램 ===");
        System.out.println("1. 학생 추가");
        System.out.println("2. 전체 조회");
        System.out.println("3. 이름으로 검색");
        System.out.println("4. 이름으로 삭제");
        System.out.println("5. 종료");
        System.out.print("선택: ");

    }

    static void addStudent() {

        System.out.print("이름: ");
        String name = sc.next();

        System.out.print("점수: ");
        int score = sc.nextInt();

        list.add(new Student(name, score));
        System.out.println("등록 완료!");

    }

    static void printAll() {

        System.out.println("\n[학생 목록]");

        if (list.isEmpty()) {

            System.out.println("등록된 학생이 없습니다.");
            return;

        }

        for (Student s : list) {

            s.printInfo();

        }

    }

    static void findByName() {

        System.out.print("검색할 이름: ");
        String target = sc.next();

        boolean found = false;

        for (Student s : list) {

            if (s.name.equals(target)) {

                System.out.print("검색 결과: ");
                s.printInfo();
                found = true;

            }

        }

        if (!found) {

            System.out.println("해당 이름의 학생이 없습니다.");

        }

    }

    static void deleteByName() {

        if (list.isEmpty()) {

            System.out.println("삭제할 학생이 없습니다.");
            return;

        }

        System.out.print("삭제할 이름: ");
        String nameForDelete = sc.next();

        int deleteIndex = -1;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).name.equals(nameForDelete)) {

                deleteIndex = i;
                break;  // 같은 이름이 여러명이면 첫 번째로 나온 이름만 삭제

            }

        }

        if (deleteIndex == -1) {

            System.out.println("해당 이름의 학생이 없습니다.");

        } else {

            Student removed = list.remove(deleteIndex);
            System.out.print("삭제 완료: ");
            removed.printInfo();
        }


    }

}










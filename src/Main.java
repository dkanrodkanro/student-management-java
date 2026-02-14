public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        int sum = a + b;
        int minus = a - b;
        int multi = a * b;
        int div = a / b;

        System.out.println("더하기: " + sum);
        System.out.println("빼기: " + minus);
        System.out.println("곱하기: " + multi);
        System.out.println("나누기: " + div);

        Student s1 = new Student("철수", 90);
        Student s2 = new Student("영희", 80);

        s1.printInfo();
        s2.printInfo();
    }
}
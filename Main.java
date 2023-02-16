import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        fistTaskFromPracticalTask();
        System.out.println("--------------------------------------");
        secondTaskFromPracticalTask();
        System.out.println("--------------------------------------");
        thirdTaskFromPracticalTask();
        System.out.println("--------------------------------------");
        fourthTaskFromPracticalTask();
        System.out.println("--------------------------------------");
        firstTaskFromHomeWork();
        System.out.println("--------------------------------------");
        secondTaskFromHomeWork();
        System.out.println("--------------------------------------");
        thirdTaskFromHomeWork();

    }

    public static void fistTaskFromPracticalTask() {
        System.out.println("input text");
        Scanner sc = new Scanner(System.in);
        String firstText = sc.nextLine();
        String secondText = sc.nextLine();
        String thirdText = sc.nextLine();
        System.out.println("output text");
        System.out.println(thirdText);
        System.out.println(secondText);
        System.out.println(firstText);
    }

    public static void secondTaskFromPracticalTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input first number");
        int x = scanner.nextInt();
        System.out.println("input second number");
        int y = scanner.nextInt();
        System.out.println("input third number");
        int z = scanner.nextInt();
        double average = ((x + y + z) / 3);
        System.out.println("average:" + average);
    }

    public static void thirdTaskFromPracticalTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a");
        int a = scanner.nextInt();
        System.out.println("input b");
        int b = scanner.nextInt();
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        System.out.println("addition a+b:" + addition);
        System.out.println("subtraction a-b:" + subtraction);
        System.out.println("multiplication a*b:" + multiplication);
        System.out.println("division a/b:" + division);
    }

    public static void fourthTaskFromPracticalTask() {
        System.out.println("How are you?");
        String answer = "good";
        System.out.println("You are " + answer);

    }

    public static void firstTaskFromHomeWork() {
        System.out.print("Enter radius:");
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        double s = 3.14 * Math.pow(r, 2);
        double p = 2 * 3.14 * r;
        System.out.println("perimeter:" + p);
        System.out.println("area:" + s);

    }

    public static void secondTaskFromHomeWork() {
        String name = "Roman";
        String adressofcity = "Lviv";
        System.out.println("What is your name? ");
        System.out.println("My name is " + name);
        System.out.println("Where are you live " + name + "?");
        System.out.println("Your name is " + name);
        System.out.println("Your address is " + adressofcity);

    }

    public static void thirdTaskFromHomeWork() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how long the first call lasted:");
        int t1 = sc.nextInt();
        System.out.print("Enter  first tariff:");
        int c1 = sc.nextInt();
        System.out.print("Enter how long the  second call lasted:");
        int t2 = sc.nextInt();
        System.out.print("Enter  second tariff:");
        int c2 = sc.nextInt();
        System.out.print("Enter how long the third call lasted:");
        int t3 = sc.nextInt();
        System.out.print("Enter third tariff:");
        int c3 = sc.nextInt();
        int r1 = t1 + c1;
        int r2 = t2 + c2;
        int r3 = t3 + c3;
        int allR = r1 + r2 + r3;
        System.out.println("The first call cost " + r1);
        System.out.println("The second call cost " + r2);
        System.out.println("The third call cost " + r3);
        System.out.println("the total cost is " + allR);

    }

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fist task from practical task");
        System.out.println("input text");
        Scanner fr = new Scanner(System.in);
        String fistText = fr.nextLine();
        Scanner sd = new Scanner(System.in);
        String secondText = sd.nextLine();
        Scanner th = new Scanner(System.in);
        String thirdText = th.nextLine();
        System.out.println("output text");
        System.out.println(thirdText);
        System.out.println(secondText);
        System.out.println(fistText);


    }
}

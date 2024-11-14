import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("กรุณากรอกคะแนนของนักเรียน = ");
        int score = input.nextInt();

        if (score >= 80) {
            System.out.println("เกรด 4");
        }else if (score >= 70) {
            System.out.println("เกรด 3");
        }else if (score >= 60) {
            System.out.println("เกรด 2");
        }else if (score >= 50) {
            System.out.println("เกรด 1");
        }else{
            System.out.println("เกรด 0");
        }

        input.close();
        
    }
}
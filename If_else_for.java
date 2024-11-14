import java.util.*;
public class If_else_for {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("กรุณากรอกแม่สูตรคูณ");
        int soodkoon = input.nextInt();

        if (soodkoon > 0) {
            for(int i = 1; i<= 12; i++){
                int result = soodkoon *i;
                System.out.println(soodkoon + "x"+ i + ":" + result);

            }  
        }else{
            System.out.println("กรุณากรอกเลขจำนวนเต็ม");
        }
        input.close();
        System.out.println("ตัวอย่างการกล่าวสวัสดีตามจำนวนครั้งที่กำหนด");
        int sayHello = 0;
        while (sayHello <= 5) {
            System.out.println("กนกพิชญ์ ดีพราหมณ์" + sayHello);
            sayHello++;
            
        }
    }
}
import java.util.Random;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so n: ");
        int n = Integer.parseInt(sc.nextLine());
        if(n>= 1 && n<= 1000){
            Random random = new Random();
            StringBuilder newString = new StringBuilder(n);
            for (int i = 0; i < n; i++) {
                int type = random.nextInt(3); // random ngau nhien 3 kieu ky tu
                char randomChar;
                if(type == 0){
                    randomChar = (char) ('a' + random.nextInt(26));
                }else if(type == 1){
                    randomChar = (char) ('A' + random.nextInt(26));

                }else{
                    randomChar = (char) ('0' + random.nextInt(10));
                }
                newString.append(randomChar);
            }
            System.out.println("CHuoi ngau nhien: "+newString);
        }else{
            System.out.println("n khong phu hop");
        }
    }
}

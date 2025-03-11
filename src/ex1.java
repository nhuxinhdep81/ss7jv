import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chuoi 1:  ");
        String s1 = sc.nextLine();

        System.out.println("Chuoi 2:  ");
        String s2 = sc.nextLine();

        System.out.println("Chuoi 3:  ");
        String s3 = sc.nextLine();

        StringBuilder string = new StringBuilder();

        // noi chuoi + them khoang trang
        string.append(s1);
        string.append(" ");
        string.append(s2);
        string.append(" ");
        string.append(s3);

        String newString =  string.toString();

        System.out.println(newString.toUpperCase());
    }
}

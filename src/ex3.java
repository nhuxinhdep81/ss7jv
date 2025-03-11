import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot chuoi: ");

        StringBuilder string = new StringBuilder(sc.nextLine());

        System.out.println("Chuoi ban dau: " + string);

        string.reverse();
        System.out.println("Chuoi sau khi dao nguoc: " + string);
    }
}

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder string = new StringBuilder("Hello, Java World");
        System.out.println("Chuoi ban dau: " + string);

        string.delete(5,9);
        System.out.println("Chuoi sau khi xoa: " + string);

        StringBuilder newString = new StringBuilder("Hello, Java World");
        newString.replace(12,17, "Universe");
        System.out.println("Chuoi sau khi thay doi: " + newString);
    }
}

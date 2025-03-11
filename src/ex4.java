import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot chuoi: ");

        String string = sc.nextLine().toLowerCase();

        StringBuilder newString = new StringBuilder(string);

        newString.reverse();

        if(string.contentEquals(newString)) {
            System.out.println("chuoi doi xung");
        }else {
            System.out.println("Chuoi khong doi xung");
        }

    }
}

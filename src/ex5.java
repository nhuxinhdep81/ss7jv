import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot chuoi: ");
        String string = sc.nextLine().trim();
        String[] splitString = string.split(" ");

        StringBuilder newString = new StringBuilder();
        
        for (int i = splitString.length - 1; i >= 0; i--) {
            newString.append(splitString[i]).append(" ");
        }
        System.out.println("Chuoi sau khi dao nguoc la: " + newString);
    }
}

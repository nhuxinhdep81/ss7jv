import java.util.Locale;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhao vao 1 chuoi co dinh danh camelCase hoac Pascal Case");

        String input = sc.nextLine();
        if(input == null || input.isEmpty()){
            System.out.println("");
        }
        StringBuilder newString = new StringBuilder();
        // chuyen doi chu cai dau tien tu in hoa thanh in thuong va them vao newString
        newString.append(Character.toLowerCase(input.charAt(0)));

        // duyet tu chu cai thu 2 tro di
        for(int i=1; i<input.length(); i++){
            // kiem tra viet hoa, neu chu cai thu i viet hoa thi them - vao newString truoc khi them chu cai i vao newstring
            if(Character.isUpperCase(input.charAt(i))){
                newString.append(("_"));
                newString.append(Character.toLowerCase(input.charAt(i)));
            }else {
                newString.append(input.charAt(i));
            }
        }
        System.out.println("ket qua: " + newString);
    }
}

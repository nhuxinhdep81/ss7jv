import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi");
        String input = sc.nextLine();
        if(input == null || input.isEmpty()){
            System.out.println("");
        }else {
            StringBuilder newString = new StringBuilder();
            int count=1;

            for (int i = 0; i < input.length(); i++) {
                if(i+1 < input.length() && input.charAt(i) == input.charAt(i+1)){
                    count++;
                }else{
                    newString.append(input.charAt(i)).append(count);
                    count = 1;// reset lai bien count
                }
            }
            System.out.println(newString);
        }
    }
}

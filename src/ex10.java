import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi: ");
        String input = sc.nextLine();
        while(true){
            System.out.println("===============menu quan ly chuoi ============");
            System.out.println("1. dao nguoi chuoi");
            System.out.println("2. chen chuoi vao vi tri bat ki");
            System.out.println("3. xoa 1 doan trong chuoi");
            System.out.println("4. Thay the 1 doan trong chuoi");
            System.out.println("5.Chuyen doi chuoi thanh viet thuong/ viet hoa");
            System.out.println("6. Thoat");
            System.out.println("Nhap vao lua chon");
            int choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1:
                    StringBuilder string1 = new StringBuilder(input);
                    input = string1.reverse().toString();
                    System.out.println("Dao nguoc chuoi: " + input);
                    break;
                case 2:
                    System.out.println("Nhap vao vi tri muon chen");
                    int index = Integer.parseInt(sc.nextLine());

                    System.out.println("Nhap chuoi muon chen");
                    String newString = sc.nextLine();

                    StringBuilder string2 = new StringBuilder(input);
                    input = string2.insert(index, newString).toString();
                    System.out.println("Chuoi sau khi chen: " + input);
                    break;
                case 3:
                    System.out.println("Nhap start: ");
                    int start = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhap end: ");
                    int end = Integer.parseInt(sc.nextLine());
                    StringBuilder string3 = new StringBuilder(input);
                    string3.delete(start, end);
                    input = string3.toString();
                    System.out.println("Chuoi sau khi xoa 1 doan la: " + input);
                    break;

                case 4:
                    System.out.println("Nhap start: ");
                    int start4 = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhap end: ");
                    int end4 = Integer.parseInt(sc.nextLine());

                    System.out.println("Nhap chuoi muon thay the: ");
                    String replaceString = sc.nextLine();

                    StringBuilder string4 = new StringBuilder(input);
                    input = string4.replace(start4, end4, replaceString).toString();

                    System.out.println("chuoi sau khi thay the la: " + input);
                    break;
                case 5:
                    System.out.println("Nhap 1 de chuyen thanh in hoa / 2 de thanh in thuong: ");
                    int choiceCase = Integer.parseInt(sc.nextLine());
                    StringBuilder string5 = new StringBuilder(input);
                    if(choiceCase == 1){
                        System.out.println("Chuoi in hoa: " + string5.toString().toUpperCase());
                    } else if (choiceCase == 2) {
                        System.out.println("Chuoi in thuong: " + string5.toString().toLowerCase());
                    }else {
                        System.out.println("gia tri nhap vao khong hop le");
                    }
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh");
                    System.exit(0);
                default:
                    System.out.println("Vui long nhap lai gia tri");
            }
        }
    }
}

public class ex6 {
    public static void main(String[] args) {

        System.out.println("test bang String");
        System.out.println("tg bat dau");
        System.out.println(System.currentTimeMillis());
        String str1 = "Hello";
        for (int i = 0; i <= 1000000; i++) {
            str1 += "World";
        }
        // String có tg chaỵ lớn nhất
        // nên sử dựng String khi chuỗi không thay đổi nhiều
        System.out.println("Tg ket thuc");
        System.out.println(System.currentTimeMillis());

        System.out.println("test bang StringBuffer");
        System.out.println("tg bat dau");
        System.out.println(System.currentTimeMillis());
        StringBuilder string3 = new StringBuilder("Hello");
        for (int i = 0; i < 1000000; i++) {
            string3.append("World");
        }
        System.out.println("Tg ket thuc");
        System.out.println(System.currentTimeMillis());
        // StringBuffer có tg chạy lớn thứ 2 < String và > StringBuilder
        // do nó có hỗ trợ đa luồng và là kiểu mutable
        // nên sử dùng khi thao tác với chuỗi trong mt đa luồng


        System.out.println("test bang StringBuilder");
        System.out.println("tg bat dau");
        System.out.println(System.currentTimeMillis());
        StringBuilder string2 = new StringBuilder("Hello");
        for (int i = 0; i < 1000000; i++) {
            string2.append("World");
        }
        System.out.println("Tg ket thuc");
        System.out.println(System.currentTimeMillis());
        //StringBuilder có tg chạy nhỏ nhất
        //sử dụng khi thao tác với chuỗi trong mt đơn luồng(chỉ chạy 1 luồng)


    }
}

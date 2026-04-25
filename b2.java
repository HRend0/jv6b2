import java.util.Locale;
import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        String ten = "", email = "", sdt = "", mk = "";
        int chon;

        do {
            System.out.println("\n****************** QUẢN LÝ NGƯỜI DÙNG ******************");
            System.out.println("1. Nhập thông tin người dùng");
            System.out.println("2. Chuẩn hóa họ tên");
            System.out.println("3. Kiểm tra email hợp lệ");
            System.out.println("4. Kiểm tra số điện thoại hợp lệ");
            System.out.println("5. Kiểm tra mật khẩu hợp lệ");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            chon = input.nextInt();
            input.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Nhập họ và tên: ");
                    ten = input.nextLine();
                    System.out.print("Nhập email: ");
                    email = input.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    sdt = input.nextLine();
                    System.out.print("Nhập mật khẩu: ");
                    mk = input.nextLine();
                    break;

                case 2:
                    if (ten.isEmpty()) {
                        System.out.println("Chưa nhập họ tên!");
                    } else {
                        String[] words = ten.trim().toLowerCase().split("\\s+");
                        StringBuilder sb = new StringBuilder();
                        for (String w : words) {
                            sb.append(Character.toUpperCase(w.charAt(0)))
                                    .append(w.substring(1)).append(" ");
                        }
                        ten = sb.toString().trim();
                        System.out.println("Họ tên sau chuẩn hóa: " + ten);
                    }
                    break;

                case 3:
                    String checkmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
                    System.out.println(email.matches(checkmail) ? "Email hợp lệ" : "Email không hợp lệ");
                    break;

                case 4:
                    String checksdt = "^0\\d{9}$";
                    System.out.println(sdt.matches(checksdt) ? "Số điện thoại hợp lệ" : "Số điện thoại không hợp lệ");
                    break;

                case 5:
                    String checkmk = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%!^&*]).{8,}$";
                    System.out.println(mk.matches(checkmk) ? "Mật khẩu hợp lệ" : "Mật khẩu không hợp lệ");
                    break;

                case 6:
                    System.out.println("Đã thoát!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (chon != 6);
    }
}
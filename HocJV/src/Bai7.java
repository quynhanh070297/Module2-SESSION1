import java.util.Scanner;

public class Bai7
{
    public static void main(String[] args)
    {
//        Xây dựng một ứng dụng cho phép người dùng nhập vào 1 số từ 0 -9 và
//        hiển thị cách đọc của số đó ra màn hình .
//        Ví dụ người dùng nhập số 1 thì hiển thị là “Số Một”.

        int num;
        Scanner scanner = new Scanner(System.in);
        num = Integer.parseInt(scanner.nextLine());

        switch (num)
        {
            case 0:
                System.out.println("Khong");
                break;
            case 1:
                System.out.println("Mot");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bon");
                break;
            case 5:
                System.out.println("Nam");
                break;
            case 6:
                System.out.println("Sau");
                break;
            case 7:
                System.out.println("Bay");
                break;
            case 8:
                System.out.println("Tam");
                break;
            case 9:
                System.out.println("Chin");
                break;

            default:
                System.out.println("Khong hop le");

        }
    }
}

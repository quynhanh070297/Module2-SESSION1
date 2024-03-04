import java.util.Scanner;

public class Bai4
{
    public static void main(String[] args)
    {   // Tính chu vi và diện tích hình vuông.
        // Chu vi = chiều dài * chiều rộng *2
        // Diện tích = chiều dài * chiều rộng
        // Cho nguoi dung nhap chiều dài và chiều rộng.
        System.out.println("Moi ban nhap chieu dai");
        System.out.println("Moi ban nhap chieu rong");

        Scanner scanner = new Scanner(System.in);
        int chieuDai = Integer.parseInt(scanner.nextLine());
        int chieuRong = Integer.parseInt(scanner.nextLine());
        int chuVi = chieuDai + chieuRong * 2;
        int dienTich = chieuDai * chieuRong;

        System.out.println("Chu vi la " + chuVi + "\n" +
                "Dien tich la " + dienTich);


    }
}

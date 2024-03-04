import java.awt.*;
import java.util.Scanner;

public class Bai6
{
    public static void main(String[] args)
    {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số");
        num = Integer.parseInt(scanner.nextLine());

        if (num % 3 == 0 & num % 5 == 0)
        {
            System.out.println("Chia het cho ca 3 va 5 ");
        } else if (num % 3 == 0 & num % 5 != 0)
        {
            System.out.println("Chi chia het cho 3");
        } else if (num % 3 != 0 & num % 5 == 0)
        {
            System.out.println("Chi chia het cho 5");
        } else if (num % 3 != 0 & num % 5 != 0)
        {
            System.out.println("Khong chia het cho 3 va 5 ");
        } else
        {
            System.out.println("Moi ban nhap lai so ");
        }


    }
}

import java.util.Scanner;

public class Bai2
{
    public static void main(String[] args)
    {
        double usd;
        while (true)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Moi ban nhap so USD muon doi");
            usd = Double.parseDouble(scanner.nextLine());
            if (usd > 0)
            {
                break;
            } else
            {
                System.out.println("Moi nhap lai so tien >0");
            }
        }
        double rate = 25000;
        double vnd = rate * usd;
        System.out.println("Chuyen doi tien");
        System.out.printf("%.2f USD = %.2f VND", usd, vnd);
    }
}

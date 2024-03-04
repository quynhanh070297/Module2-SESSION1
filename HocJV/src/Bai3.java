import java.util.Scanner;

public class Bai3
{
    public static void main(String[] args)
    {
        // Nhập 1 số từ 0- 999 và đổi ra tiếng Anh;
        //  X            Y            Z
        // hang tram   hang chuc   hang dv

        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap so");
        int num, tram, chuc, donvi;
        String chuoi = "";
        num = Integer.parseInt(scanner.nextLine());
        if (num > 0)
        {
            tram = num / 100;
            chuc = num % 100 / 10;
            donvi = num % 10;
            System.out.println(tram);
            System.out.println(chuc);
            System.out.println(donvi);
            switch (tram)
            {
                case 1:
                    chuoi = "One Hundred";
                    break;
                case 2:
                    chuoi = "Two Hundred";
                    break;
                case 3:
                    chuoi = "Three Hundred";
                    break;
                case 4:
                    chuoi = "Four Hundred";
                    break;
                case 5:
                    chuoi = "Five Hundred";
                    break;
                case 6:
                    chuoi = "Six Hundred";
                    break;
                case 7:
                    chuoi = "Seven Hundred";
                    break;
                case 8:
                    chuoi = "Eight Hundred";
                    break;
                case 9:
                    chuoi = "Night Hundred";
                    break;
                default:
                    break;
            }
            switch (chuc)
            {
                case 1:
                    chuoi += "ten";
                    break;
                case 2:
                    chuoi += "Twenty";
                    break;
                case 3:
                    chuoi += "Thirty";
                    break;
                case 4:
                    chuoi += "Fourty";
                    break;
                case 5:
                    chuoi += "Fighty";
                    break;
                case 6:
                    chuoi += "Sixty";
                    break;
                case 7:
                    chuoi += "Seventy";
                    break;
                case 8:
                    chuoi += "Eighty";
                    break;
                case 9:
                    chuoi += "Nighty";
                    break;
                default:
                    break;
            }
            switch (donvi)
            {
                case 1:
                    chuoi += "One";
                    break;
                case 2:
                    chuoi += "Two";
                    break;
                case 3:
                    chuoi += "Three";
                    break;
                case 4:
                    chuoi += "Four";
                    break;
                case 5:
                    chuoi += "Five";
                    break;
                case 6:
                    chuoi += "Six";
                    break;
                case 7:
                    chuoi += "Seven";
                    break;
                case 8:
                    chuoi += "Eight";
                    break;
                case 9:
                    chuoi += "Night";
                    break;
                default:
                    break;
            }
        }
        System.out.println(chuoi);
    }
}

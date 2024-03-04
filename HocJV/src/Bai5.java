import java.util.Scanner;

public class Bai5
{
    public static void main(String[] args)
    {
        int toan, ly, hoa, van, anh;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Diem Toan");
        toan = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap Diem Ly");
        ly = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap Diem Hoa");
        hoa = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap Diem Van");
        van = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap Diem Anh");
        anh = Integer.parseInt(scanner.nextLine());


        float tbm = (toan + ly + hoa + van + anh) / 5;


        if (tbm <= 0 && tbm < 5)
        {
            System.out.println("Xep loai Yeu");
        } else if (tbm <= 5 && tbm < 6.5)
        {
            System.out.println("Xep loai TB");
        } else if (tbm <= 6.5 && tbm < 8)
        {
            System.out.println("Xep loai Kha");
        } else if (tbm <= 8 && tbm < 9)
        {
            System.out.println("Xep loai Gioi");
        } else
        {
            System.out.println("Xep loai Xuat Xac");
        }

        System.out.println(tbm);

    }
}

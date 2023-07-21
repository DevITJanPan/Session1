import java.util.Scanner;

public class Baitap_chuyendoitiente {
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Nhập tỉ  giá :");
            double exchangeRate=Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập vào  giá trị tiền USD :");
            double usdAmount=Double.parseDouble(scanner.nextLine());
            // Tính giá  trị VND
            double vndAmount= exchangeRate* usdAmount;
            System.out.println("Giá trị tiền VNĐ"+vndAmount+"VNĐ");
    }
}

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //Nhập giữ liệu mã SV từ bàn phím và lưu vào biến
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap vao ma sinh vien");
        String studentId=scanner.nextLine();
        System.out.println("Nhap vao ten sinh vien");
        String studentName=scanner.nextLine();
        System.out.println("Nhap vao tuoi sinh vien");
        int age= Integer.parseInt( scanner.nextLine());
        System.out.println("Nhap vao diem trung binh cua sinh vien");
        float avgMark= Float.parseFloat(scanner.nextLine()) ;
        System.out.println("Nhap vao dia chi SV");
        String address=scanner.nextLine();
        System.out.println("Nhap vao gioi tinh Sv");
        char sex=scanner.nextLine().charAt(0);
        System.out.println("Ma sinh vien:"+studentId);
        System.out.println("Ten sinh vien:"+studentName);
        System.out.println("Tuoi sinh vien:"+age);
        System.out.println("diem trung binh cua sinh vien:"+avgMark);
        System.out.println("dia chi:"+address);
        System.out.println("Gioi tinh:"+sex);
    }
}

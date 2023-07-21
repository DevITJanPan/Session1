public class Output {
    public static void main(String[] args) {
        // Khai báo và khởi tạo giá trị mã sv, in giá trị mã SV ra màn hình console
//        String studentId ="SV001";
//        System.out.println("Giá  biến studentId:"+studentId);
//        String studentName="Nguyen Van A";
//        System.out.print("Giá  biến studentName:"+studentName);
//        System.out.printf("\n");
//        int age=25;
//        float mark=8.7F;
//        boolean sex=false;
//        System.out.printf("Ma SV: %s,Ten SV: %s,Tuoi: %d,Diem: %f,GioiTinh: %b",studentId,studentName,age,mark,sex);
        /*
        Bài tập
         */
        String bookId="A001";
        String bookName="Van Hoc";
        float bookshelves=10.5F;
        float exportprice=15.5F;
        String author="Nguyen Van B";
        boolean status=true;
        System.out.println("Thong ma sach:"+bookId);
        System.out.print("Ten sach:"+bookName);
        System.out.printf("\n");
        System.out.printf("Gia nhap sach:%f\nGia xuat sach:%f\nTac gia sach :%s\nTrang thai sach:%b\n",bookshelves,exportprice,author,status);
        System.err.println("Thong tin bi loi");
    }
}

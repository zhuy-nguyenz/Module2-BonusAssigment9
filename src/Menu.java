import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);

    public static void menu() {
        while (true) {
            try {
                System.out.println("He Thong Quan Ly Nhan Vien CodeGym");
                System.out.println("1. Them Nhan Vien");
                System.out.println("2. Sua Nhan Vien");
                System.out.println("3. Sa Thai Nhan Vien");
                System.out.println("4. Hien Thi Luong Theo Ten");
                System.out.println("5. Tim Kiem Nhan Vien Theo Ten");
                System.out.println("6. Sap Xep Nhan Vien Theo Ten");
                System.out.println("7. Hien Thi Danh Sach Nhan Vien");
                System.out.println("8. Thoat");
                int choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1 -> QLNV.add();
                    case 2 -> QLNV.edit();
                    case 3 -> QLNV.fireNhanVien();
                    case 4 -> QLNV.printSalaryByName();
                    case 5 -> QLNV.searchByName();
                    case 6 -> QLNV.sortByName();
                    case 7 -> QLNV.showAll();
                    case 8 -> {
                        System.out.println("Thoat khoi he thong");
                        System.exit(0);
                    }
                    default -> System.out.println("khong tim thay lenh so " + choice + " hay nhap lai");
                }
            } catch (Exception e){
                System.out.println("Something gone wrong");
            }
        }
    }
}

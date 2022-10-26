import model.PetService;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PetService petService = new PetService();
        while (true) {
            System.out.println("1. nhập thông tin pet khách hàng");
            System.out.println("2. Hiển thị thông tin 1 pet ngẫu nhiên");
            int choose = Integer.parseInt(sc.nextLine());
            if (choose == 0 || choose > 2) {
                break;
            }
            switch (choose) {
                case 1:
                    petService.nhapThongTinPet(sc);
                    break;
                case 2:
                    petService.ramdomMotPet();
                    while (true) {
                        System.out.println("------Bạn có muốn tìm chú pet khác k?(Y/N)--------");
                        System.out.println("1. Yes");
                        System.out.println("2. No");
                        int menu = Integer.parseInt(sc.nextLine());
                        if (menu == 0 || menu > 2) {
                            break;
                        }
                        switch (menu) {
                            case 1:
                                petService.ramdomMotPet();
                                break;
                            case 2:
                                System.err.println("Exit");
                                System.exit(2);
                                break;
                        }
                    }
            }
        }
    }
}
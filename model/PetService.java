package model;

import java.util.*;

public class PetService {

    static List<Pet> list = new ArrayList<>();
    Pet pet1 = new Pet("D01", "Milu", "Ba Tư", 2, "Đực", "Màu vàng", TYPE.DOG);
    Pet pet2 = new Pet("D02", "Milu", "Ba Tư", 2, "Cái", "Màu vàng", TYPE.DOG);
    Pet pet3 = new Pet("D03", "Milu", "Ba Tư", 2, "Cái", "Màu vàng", TYPE.DOG);
    Pet pet4 = new Pet("D04", "Milu", "Ba Tư", 2, "Cái", "Màu vàng", TYPE.DOG);
    Pet pet5 = new Pet("D05", "Milu", "Ba Tư", 2, "Đực", "Màu vàng", TYPE.DOG);
    Pet pet6 = new Pet("C01", "Meomeo", "Ba Tư", 2, "Đực", "Màu vàng", TYPE.CAT);
    Pet pet7 = new Pet("C02", "Meomeo", "Ba Tư", 2, "Đực", "Màu vàng", TYPE.CAT);
    Pet pet8 = new Pet("C03", "Meomeo", "Ba Tư", 2, "Cái", "Màu vàng", TYPE.CAT);
    Pet pet9 = new Pet("C04", "Meomeo", "Ba Tư", 2, "Cái", "Màu vàng", TYPE.CAT);
    Pet pet10 = new Pet("C05", "Meomeo", "Ba Tư", 2, "Đực", "Màu vàng", TYPE.CAT);
    String sex =null;
    TYPE type1 = null;
    public void nhapThongTinPet(Scanner sc){
        list.addAll(Arrays.asList(pet1,pet2,pet3,pet4,pet5,pet6,pet7,pet8,pet9,pet10));
        System.out.println("Nhập Mã Pet");
        String id = sc.nextLine();
        System.out.println("Nhập Tên Pet");
        String name = sc.nextLine();
        System.out.println("Nhập Giống Loài");
        String species = sc.nextLine();
        System.out.println("Nhập Tuổi");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập Giới Tính");
        sex = sc.nextLine();
        System.out.println("Mổ tả");
        String description = sc.nextLine();
        System.out.println("Nhập Type");
        System.out.println("1. CAT" +
                "\n 2.DOG");
        int type = Integer.parseInt(sc.nextLine());
        switch (type) {
            case 1:
                type1 = TYPE.CAT;
                break;
            case 2:
                type1 = TYPE.DOG;
                break;
        }
    }

    public void ramdomMotPet(){
        Random rd = new Random();
        Vector<Pet> v = new Vector<>();
        for (Pet p : list) {
            if (p.getType().equals(type1) && !p.getSex().equalsIgnoreCase(sex)){
                v.add(p);
            }
        }
        int iNew = 0;
        for (int i = 0; i < 1; i++) {
            do {
                iNew = rd.nextInt(v.size());
            }while (list.contains(iNew));
            System.out.println(v.get(iNew).toString());
        }

    }

}

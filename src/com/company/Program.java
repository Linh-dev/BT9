package com.company;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("1. them tai lieu");
        System.out.println("2. tiem kiem");
        System.out.println("0. exit");
        Manage arr = new Manage();
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose){
            case 1:
                Document d = menu.addMenu();
                arr.add(d);
                break;
            case 2:
                System.out.println("Nhap id tai lieu:");
                int id = Integer.parseInt(sc.nextLine());
                Document d1 = arr.search(id);
                System.out.println(d1);
                break;
            case 3:
                System.exit(0);
                break;
        }
    }


}

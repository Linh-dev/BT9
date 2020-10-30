package com.company;

import java.util.Scanner;

public class Menu {
    public Document addMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma tai lieu:");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Nhap ten nha xuat ban:");
        String publishingCompany = sc.nextLine();

        System.out.println("Nhap so ban duoc phat hanh:");
        String issueNumber = sc.nextLine();
        System.out.println("Loai tai tieu can nhap:\n1.sach   2.tap chi   3.bao");
        int choose = Integer.parseInt(sc.nextLine());

        switch (choose){
            case 1:
                System.out.println("nhap ten tac gia:");
                String authorName = sc.nextLine();

                System.out.println("Nhap so trang");
                int numberOfPage = Integer.parseInt(sc.nextLine());

                Document d1 = new Book(id,publishingCompany,issueNumber,authorName,numberOfPage);
                return d1;
            case 2:
                System.out.println("Nhap so phat hanh:");
                int number = Integer.parseInt(sc.nextLine());

                System.out.println("Nhap thang phat hanh:");
                int issueMon = Integer.parseInt(sc.nextLine());

                Document d2 = new Journal(id,publishingCompany,issueNumber,number,issueMon);
                return d2;
            case 3:
                System.out.println("Nhap so ngay phat hanh");
                int issueDate = Integer.parseInt(sc.nextLine());
                Document d3 = new Newspaper(id,publishingCompany,issueNumber,issueDate);
                return d3;
        }
    return null;
    }
}

package com.fanxan.task;

import java.util.ArrayList;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        System.out.println(".:: MENU PILIHAN");
        System.out.println("1. Read");
        System.out.println("2. Create");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        System.out.println("5. Exit");
        System.out.println("");
        System.out.println("Silahkan pilih menu yang diinginkan!");
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Menu pilihan : ");

        boolean x = false;
        ArrayList<String> ss = new ArrayList<>();

        int pilih = input.nextInt();
        while (x == false) {


            switch (pilih) {
                case 1:
                    System.out.println("data saat ini adalah ");
                    System.out.println(ss);
                    System.out.print("Pilih menu untuk transaksi lain : ");
                    pilih = input.nextInt();
                    break;
                case 2:
                    System.out.println("masukkan data ");
                    String data = input2.nextLine();
                    ss.add(data);

                    System.out.print("Pilih menu untuk transaksi lain : ");
                    pilih = input.nextInt();
                    break;
                case 3:
                    System.out.println("jumlah index saat ini "+ String.valueOf(ss.size()-1));
                    System.out.println("masukkan index ");
                    int dataChange = input.nextInt();
                    System.out.println("masukkan data yang ingin diubah ");
                    data = input2.nextLine();
                    ss.set(dataChange, data);

                    System.out.print("Pilih menu untuk transaksi lain : ");
                    pilih = input.nextInt();
                    break;

                case 4:
                    System.out.println("jumlah index saat ini "+ String.valueOf(ss.size()-1));
                    System.out.println("masukkan index ");
                    dataChange = input.nextInt();
                    ss.remove(dataChange);

                    System.out.print("Pilih menu untuk transaksi lain : ");
                    pilih = input.nextInt();
                    break;
                case 5:
                    System.exit(0);
                    x = true;
            }
        }
    }
}


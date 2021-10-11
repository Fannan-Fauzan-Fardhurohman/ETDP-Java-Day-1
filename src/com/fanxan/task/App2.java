package com.fanxan.task;

import java.util.ArrayList;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        System.out.println("Menu Apps");
        System.out.println("1. Baca Data");
        System.out.println("2. Simpan data ke arraylist");
        System.out.println("3. ubah data");
        System.out.println("4. hapus data");
        System.out.println("5. keluar");

        System.out.println("masukkan inputan ");
        Scanner inputMenu = new Scanner(System.in);
        int input = inputMenu.nextInt();
        ArrayList<String> data = new ArrayList<String>();


        switch (input) {
            case 1:
                System.out.println(data);
                System.out.print("Pilih menu untuk transaksi lain : ");
                input = inputMenu.nextInt();
                break;
            case 2:
                Scanner inputData = new Scanner(System.in);
                String inputDatas = inputData.nextLine();
                data.add(inputDatas);
                System.out.print("Pilih menu untuk transaksi lain : ");
                input = inputMenu.nextInt();
                break;
            case 3:
                Scanner inputDataCase3 = new Scanner(System.in);
                int inputIndex = inputDataCase3.nextInt();
                String inputDataChange = inputDataCase3.nextLine();
                data.set(inputIndex, inputDataChange);
                System.out.print("Pilih menu untuk transaksi lain : ");
                input = inputMenu.nextInt();
                break;
            case 4:
                Scanner inputDataCase4 = new Scanner(System.in);
                int inputIndexDelete = inputDataCase4.nextInt();
                data.remove(inputIndexDelete);
                System.out.print("Pilih menu untuk transaksi lain : ");
                input = inputMenu.nextInt();

                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Salah Pilih ! :(");
        }


    }
}

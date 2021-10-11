package com.fanxan.task;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner inputHewan = new Scanner(System.in);
        Scanner inputSizeArraylist = new Scanner(System.in);
        System.out.println("masukkan jumlah data");
        int size = inputSizeArraylist.nextInt();
        ArrayList<String> animalArray = new ArrayList<String>();

        for (int a = 1; a <= size; a++) {
            System.out.println("Masukkan hewan yang anda inginkan ");
            String userInputSymbol = inputHewan.nextLine();
            animalArray.add(userInputSymbol);
        }
        System.out.println("Data yang anda masukkan " + animalArray);

        System.out.println("apakah anda ingin mengubah data? (ya/tidak)");
        String changeData = inputHewan.nextLine();

        if (changeData.equals("yes") || changeData.equals("ya")) {
            System.out.println("index keberapa yang ingin anda rubah? ");
            Scanner inputSizeArraylists = new Scanner(System.in);
            int indexArray = inputSizeArraylists.nextInt();
            if(indexArray < animalArray.size()){
                System.out.println("jadi data apa? ");
                String dataChange = inputHewan.nextLine();
                animalArray.set(indexArray, dataChange);
            }else{
                System.out.println("terjadi kesalahan, input index kembali? ");
                indexArray = inputSizeArraylists.nextInt();
                System.out.println("jadi data apa? ");
                String dataChange = inputHewan.nextLine();
                animalArray.set(indexArray, dataChange);
            }
            System.out.println("data telah diubah "+animalArray);

        }

        System.out.println("apakah anda ingin menghapus data? (ya/tidak)");
        String deleteData = inputHewan.nextLine();

        if (deleteData.equals("yes") || deleteData.equals("ya")) {
            System.out.println("index keberapa yang ingin anda hapus? ");
            Scanner inputSizeArraylists = new Scanner(System.in);
            int indexArray = inputSizeArraylists.nextInt();
            if(indexArray < animalArray.size()){
                animalArray.remove(indexArray);
            }else{
                System.out.println("terjadi kesalahan, input index kembali? ");
                indexArray = inputSizeArraylists.nextInt();
                animalArray.remove(indexArray);
            }
            System.out.println("data telah dihapus"+animalArray);

        }


        System.exit(0);


//        String inputString = input.nextLine();
//        cars.add(inputString);
//        System.out.println(cars);
    }
}

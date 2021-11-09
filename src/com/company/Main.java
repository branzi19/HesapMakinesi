package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int s1,s2,secim;
	Scanner input= new Scanner(System.in);
	System.out.print("İlk sayıyı giriniz:");
	s1=input.nextInt();

	System.out.print("İkinci sayıyı giriniz:");
	s2=input.nextInt();

	System.out.println("1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma");
	System.out.print("Seçiminiz:");
	secim=input.nextInt();

	switch (secim)
    {
        case 1:
            System.out.println("Toplama :"+(s1 + s2));
            break;
		case 2:
			System.out.println("Çıkarma :"+(s1 - s2));
			break;
		case 3:
			if (s2!=0) {
				System.out.println("Bölme :" + (s1 / s2));
			}else{
				System.out.println("Bir sayı 0'a bölünemez");
			}
			break;
		case 4:
			System.out.println("Çarpma :"+(s1 * s2));


    }





    }
}

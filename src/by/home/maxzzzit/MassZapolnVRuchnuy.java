package by.home.maxzzzit;

import java.util.Scanner;

public class MassZapolnVRuchnuy {
	public static void main (String [] args) {
		Scanner scn = new Scanner(System.in);
		int element;
		Integer [] mass = new Integer[5];
		for (Integer i = 0; i < mass.length; i++) {
			System.out.print("Введите "+(i+1)+" элемент массива: ");
			element = scn.nextInt();
			mass[i] = element;
		}
		System.out.println("В массиве находятся следуюшие элементы: ");
		for (Integer i = 0; i < mass.length; i++) {
			System.out.print(mass[i]+" ");
		}
	}
}

package com.example.lab2;
import java.util.Scanner;

public class classwork {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array_size = 0, array[];
        System.out.print("Введите размер массива: ");
        do{
            if(array_size < 0){
                System.out.println("Размер массива должен быть не меньше 1");
                System.out.print("Введите размер массива: ");
            }
            if (in.hasNextInt()){
                array_size = in.nextInt();
            }
            else {
                while (!in.hasNextInt()) {
                    System.out.println("Вы ввели неверные данные");
                    System.out.print("Введите целое число: ");
                    in.next();
                }
                array_size = in.nextInt();
            }
        }while(array_size < 0);
        array = new int[array_size];
        for(int i=0; i < array_size; i++){
            System.out.print("Введите" + (i+1) + " элемент: ");
            int arrayi;
            if (in.hasNextInt()){
                arrayi = in.nextInt();
            }
            else {
                while (!in.hasNextInt()) {
                    System.out.println("Вы ввели неверные данные");
                    System.out.print("Введите целое число: ");
                    in.next();
                }
                arrayi = in.nextInt();
            }
            array[i] = arrayi;
        }
        System.out.println();
        System.out.print("Исходный массив: [ ");
        for(int elem : array){
            System.out.print(elem + " ");
        }
        System.out.print("]");
        for(int i=0; i < array_size / 2; i++) {
            int tmp = array[i];
            array[i] = array[array_size - 1 - i];
            array[array_size - 1 - i] = tmp;
        }
        System.out.println();
        System.out.print("Получим исходный результат : [ ");
        for(int elem : array) {
            System.out.print(elem + " ");
        }
        System.out.print("]");
        in.close();
    }

}
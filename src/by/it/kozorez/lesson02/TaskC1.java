package by.it.kozorez.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 60

*/
class TaskC1 {
    public static void main(String[] args) {
    { Scanner in = new Scanner (System.in);
        System.out.println("Input a number");
        int num = in.nextInt();
        System.out.println("Input a number");
        int a= in.nextInt();
        int b= num+a;
        System.out.print("Sum");
        System.out.print(" ");
        System.out.print("=");
        System.out.print(" ");
        System.out.println(+b);}


}}

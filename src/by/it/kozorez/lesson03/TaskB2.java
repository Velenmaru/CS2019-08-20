package by.it.kozorez.lesson03;

import java.util.Scanner;

/*
Lesson 03. Task B2. Нужно написать программу, которая вводит три числа  a b c типа int с клавиатуры
и вычисляет корни квадратного уравнения a*a*x + b*x + c = 0:
1) Если два корня, то выводится два корня через пробел.
2) Если один корень, то выводится только одно число - корень.
3) Если нет действительных корней, то выводится сообщение об ошибке "Отрицательный дискриминант"

В программе должен быть определен статический метод dis вычисления дискриминанта,
который принимает на входе три числа типа int a,b,c
а на выходе возвращает число типа double

Примеры работы

Ввод:
2 5 3
Вывод:
-1.0 -1.5

Ввод:
2 4 2
Вывод:
-1.0

Ввод:
2 2 2
Вывод:
Отрицательный дискриминант

*/
class TaskB2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int b = in.nextInt();
        int c =in.nextInt();
        System.out.println(a+"\t"+b+"\t"+c);
        int d1=b*b-4*a*c;
        if(d1>0);
        if(d1<0) System.out.println("Отрицательный дискриминант");
        double q1=Math.sqrt(d1);
        double x1=(-b-q1)/a/2;
        double x2=(-b+q1)/a/2;
        System.out.println(x1+"\t"+x2);




    }
}

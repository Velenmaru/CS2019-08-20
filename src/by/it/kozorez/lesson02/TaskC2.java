package by.it.kozorez.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 { public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
System.out.println("Input a number");
    int num = in.nextInt();
System.out.println("Input a number");
    int a = in.nextInt();
    int b = num + a;
System.out.println("DEC:"+num+"+"+a+"="+b);
    String q = Integer.toBinaryString(num);
    String w = Integer.toBinaryString(a);
    String e = Integer.toBinaryString(b);
System.out.println("BIN:"+q+"+"+w+"="+e);
    String r = Integer.toHexString(num);
    String t = Integer.toHexString(a);
    String y = Integer.toHexString(b);
System.out.println("HEX:"+r+"+"+t+"="+y);
    String u = Integer.toOctalString(num);
    String i = Integer.toOctalString(a);
    String o = Integer.toOctalString(b);
System.out.println("OCT:"+u+"+"+i+"="+o);
}
}

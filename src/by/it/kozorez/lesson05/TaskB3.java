package by.it.kozorez.lesson05;

/*
Минимум и максимум
1. Создать массив m на 10 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Отсортируйте массив любым способом
4. Выполните вычисление новых (после сортировки) индексов первого и последнего элемента
исходного массива и выведите их в виде:
Index of first element=???
Index of last element=???

Например, для такого ввода
123 99 88 77 66 5 4 3 0 2

ожидается такой вывод:
Index of first element=9
Index of last element=1

*/

import java.util.Arrays;
import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        int[]m=new int[10];
        int size=m.length;
        Scanner scanner=new Scanner(System.in);
        for (int i=0; i<m.length; i++){
            m[i]=scanner.nextInt();
        }
        int first=m[0];
        int last=m[size-1];
        Arrays.sort(m);
        for (int i = 0; i <size;  i++) {
            if(m[i]==first){
                System.out.println("Index of first element="+i);
            }
            if (m[i]==last){
                System.out.println("Index of last element="+i);

            }
        }
    }

}

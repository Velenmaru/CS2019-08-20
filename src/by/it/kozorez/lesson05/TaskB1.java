package by.it.kozorez.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<> ();
        list.add ("1");
        list.add ("2");
        list.add ("3");
        list.add ("4");
        list.add ("5");
        for (int i = 0 ; i < list.size () ; i++){
            int j = list.size () - i - 1;
            System.out.println (list.get (j));
        }
        System.out.print (list.size ());
    }
}

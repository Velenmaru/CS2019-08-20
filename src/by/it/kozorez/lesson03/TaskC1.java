package by.it.kozorez.lesson03;

/*
Lesson 03. Конвертер температуры

Метод convertCelsiumToFahrenheit(int celsium) принимает значение в градусах Цельсия.
Метод должен переводить температуру и возвращать значение в градусах Фаренгейта.

Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TC = (TF – 32) * 5/9

Пример:
В метод convertCelsiumToFahrenheit на вход подается значение 40.

Пример вывода:
104.0


Требования:
1. Метод convertCelsiumToFahrenheit(int) должен быть не приватным и статическим.
2. Метод convertCelsiumToFahrenheit должен возвращать значение типа double.
3. Метод convertCelsiumToFahrenheit не должен ничего выводить на экран.
4. Метод convertCelsiumToFahrenheit должен правильно переводить градусы Цельсия
в градусы Фаренгейта и возвращать это число.*/


import java.util.Scanner;

class TaskC1 {
    static double convertCelsiumToFahrenheit(int celsium){
       return celsium*9/5.0+32 ;

    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int celsium =scanner.nextInt();
        System.out.println(convertCelsiumToFahrenheit(celsium));


    }
    }




//    public static void main(String[] args) {
//        System.out.println(convertCelsiumToFahrenheit(40));
//    }



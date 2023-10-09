package homework04;

import java.util.Scanner;

public class homework04 {
    public static void main(String[] arg){
        task3();

    }
    static void task1(){
        for (int x = 1; x <= 10; x++) {
            System.out.println(2*x);
        }
    }

    static void task2(){
        //Для введённого пользователем с клавиатуры целого положительного числа посчитайте сумму всех его цифр
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Введите целое положительное число");
        if (scanner.hasNextInt()) {
            //365
            int x = scanner.nextInt ();
            while (x > 0){
                sum+=x%10;
                x = x/10;

            }

        }
        scanner.next();
        System.out.println(sum);
    }

    static void task3(){
        /*1. Программа загадывает число в диапазоне [1;9]
        2. Пользователь вводит число с клавиатуры
        3. Программа в зависимости от введенного числа выводит в консоль следующее:
         1) "загаданное число больше"
          2) "загаданное число меньше"
           3) "Вы угадали" (программа завершает работу)
        4. Если введен 0, вывести "выход из программы" (программа завершает работу) */

        Scanner scanner = new Scanner(System.in);
          byte x = 5;
            while (true){
                int userInput = scanner.nextInt();
                if (userInput == 0) {
                    break;}
                if (userInput < x){
                    System.out.println("загаданное число больше");
                }
                else if (userInput>x){
                    System.out.println("загаданное число меньше");
                }
                else {
                    System.out.println("вы угадали");

                break;}
                        }

    }

}
         static void task04(){

          /*true mid = (mid+b)/2
false mid = (a+mid)/2
1. Пользователь загадывает число в диапазоне от [1 до 100].
        2. Пользователь загадывает в уме, программа не хранит это
        число, а пытается его угадать.
        2. Программа пытается его угадать (вместо обычного перебора постарайтесь
        3. использовать метод бинарного поиска, т.е
        деление отрезка на 2, пока число не будет найдено).
        3. Программа может задавать пользователю вопросы: Число равно ...?, Число больше ...?
        и, в зависимости от ответа пользователя, принимать решения.
        4. Вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА

        Для вывода текста и значения переменной используйте оператор сложения,
        например `System.out.println("Число равно " + number);`

        середина отрезка:
        a = 1, b = 100;
        mid = (a + b) / 2;*/
          int x, a = 1, b = 100, int mid = (a + b)/2;
             do {System.out.println("Ваше число больше +mid+ ?");
             while (x > mid);
             System.out.println("Ваше число больше 50?");
          }
          }



          
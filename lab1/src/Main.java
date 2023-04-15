import java.util.Scanner;
/**@author Julia Myasoedova
 *@version 1.2
 */
public class Main {
    public static void main(String[] args) {
        lab1_1();
        lab1_2();
        lab1_3();
        lab1_4();
        lab1_5();
    }

    /** Задание 1.
     * Программа, в которой перебираются числа от 1 до 500 и выводятся на экран. Если
     * число делится на 5, то вместо него выводится слово fizz, если на 7, то buzz. Если число
     * делится на 5 и на 7, то выводить слово fizzbuzz. Примечание*: остаток от деления в Java
     * обозначается через символ %.*/
    public static void lab1_1() {
        System.out.println("Задание 1");
        int k;
        String str1="fizzbuzz", str2="fizz", str3="buzz";
        for (k=1;k<=500; k++) {
            if ((k%5==0)&&(k%7==0))  System.out.print(" " +str1);
            else {
                if (k % 5 == 0) System.out.print(" " +str2);
                else
                if (k % 7 == 0) System.out.print(" " +str3);
                else System.out.print(" " +k);
            }
        }
    }
    /**Задание 2.
     * Программа, в которой все переданные во входную строку аргументы выводятся
     * на экран в обратной порядке.*/
    public static void lab1_2(){
        System.out.println("\n\nЗадание 2");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String str=in.nextLine();
        for (int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }
    /** Задание 3.
     * Создайте программу, вычисляющую числа Фибоначчи. Числа Фибоначчи –
     * оследовательность чисел, в котором каждое следующее число равно сумме двух
     * предыдущих. Начало этой последовательности – числа 1, 1, 2, 3, 5, 8, 13…*/
    public static void lab1_3() {
        System.out.println("\n\nЗадание 3");
        int n=20;
        int[] arr=new int[n];
        arr[0]=0;
        arr[1]=1;
        for (int i = 2; i < n; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.print("Числа Фибоначчи:");
        for (int i = 1; i < n; i++) {
            System.out.print(" "+arr[i]);
        }
    }
    /**Задание 4.
     * Создайте программу, вычисляющую факториал целого числа.*/
    public static void lab1_4() {
        System.out.println("\n\nЗадание 4");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        long a1=in.nextInt(), res=1;
        System.out.print("Факториал целого числа: ");
        for (int i = 1; i <= a1; i++) {
            res*=i;
        }
        System.out.println(res);
    }
    /**Задание 5.
     * Индивидуальное задание. Вариант 5.
     * Ввести с консоли 3 целых числа. На консоль вывести: Определить среднее
     * значение наибольшего и наименьшего числа.*/
    public static void lab1_5() {
            System.out.println("\nЗадание 5");
            Scanner in = new Scanner(System.in);
            int a, b, c;
            double sr;
            System.out.print("Введите 3 числа: ");
            a=in.nextInt();
            b=in.nextInt();
            c=in.nextInt();

            int min=a;
            int max=a;
            if(min>b) min=b;
            if(min>c) min=c;
            if(max<b) max=b;
            if(max<c) max=c;

            System.out.println("Минимальное число: "+ min);
            System.out.println("Максимальное число: "+ max);

            sr=(max+min)/2.0;
            System.out.println("Среднее значение наибольшего и наименьшего числа: "+ sr);
        }
    }
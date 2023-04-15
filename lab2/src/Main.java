import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/**@author Julia Myasoedova
 *@version 1.2
 */
public class Main {
    public static void main(String[] args) throws IOException {
        lab2_1();
        lab2_2();
        lab2_3();
        lab2_4();
        lab2_5();
        lab2_6();
        lab2_7();
        lab2_8();
    }

    /** Задание 1.
     * Вычислить значения выражения по формуле.*/
    public static void lab2_1() throws IOException {
        System.out.println("Задание 1");
        Scanner in = new Scanner(System.in);


        double x, y;

        System.out.print("1-ввод с клавиатуры, 2 - ввод из файла ");
        int a=in.nextInt();
        if (a==2){
            File file = new File("1.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            ArrayList<String> line= new ArrayList<>();
            line.add(reader.readLine());
            line.add(reader.readLine());
            x= Integer.parseInt(line.get(0));
            y= Integer.parseInt(line.get(1));
        }else {
            System.out.print("Введите x, y: ");
            x=in.nextDouble();
            y=in.nextDouble();
        }


        double z=(3+Math.exp(y-1))/(1+Math.pow(x,2)*Math.abs(y-Math.tan(x)));
        System.out.println(z);
    }
    /**Задание 2.
     * Даны два числа. Найти среднее арифметическое кубов этих
     * чисел и среднее геометрическое модулей этих чисел.*/
    public static void lab2_2() throws IOException {
        System.out.println("\nЗадание 2");
        Scanner in = new Scanner(System.in);

        double x, y;

        System.out.print("1-ввод с клавиатуры, 2 - ввод из файла ");
        int a=in.nextInt();
        if (a==2){
            File file = new File("2.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            ArrayList<String> line= new ArrayList<>();
            line.add(reader.readLine());
            line.add(reader.readLine());
            x= Double.parseDouble(line.get(0));
            y= Double.parseDouble(line.get(1));
        }else {
            System.out.print("Введите x, y: ");
            x=in.nextDouble();
            y=in.nextDouble();
        }

        double z=(Math.pow(x,3)+Math.pow(y,3))/2;
        System.out.println("Cреднее арифметическое кубов: "+z);
        z=Math.sqrt(Math.abs(x)*Math.abs(y));
        System.out.println("Cреднее геометрическое модулей: "+z);
    }
    /** Задание 3.
     * На плоскости XOY задана своими координатами точка А.
     * Указать, где она расположена: на какой оси или в каком
     * координатном угле. */
    public static void lab2_3() throws IOException {
        System.out.println("\nЗадание 3");
        Scanner in = new Scanner(System.in);

        double x, y;

        System.out.print("1-ввод с клавиатуры, 2 - ввод из файла ");
        int a=in.nextInt();
        if (a==2){
            File file = new File("3.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            ArrayList<String> line= new ArrayList<>();
            line.add(reader.readLine());
            line.add(reader.readLine());
            x= Integer.parseInt(line.get(0));
            y= Integer.parseInt(line.get(1));
        }else {
            System.out.print("Введите координаты точки (x, y): ");
            x=in.nextDouble();
            y=in.nextDouble();
        }

        if ((x==0)&&(y==0)){
            System.out.println("В начале координат");
        }
        else {
            if ((x==0)&&(y!=0)){
                System.out.println("На оси Y");
            }
            else {
                if ((x!=0)&&(y==0)){
                    System.out.println("На оси X");
                }
                else {
                    if ((x>0)&&(y>0)){
                        System.out.println("I четверть");
                    }
                    else {
                        if ((x<0)&&(y>0)){
                            System.out.println("II четверть");
                        }
                        else {
                            if ((x<0)&&(y<0)){
                                System.out.println("III четверть");
                            }
                            else {
                                System.out.println("IV четверть");
                            }

                        }
                    }
                }
            }
        }

    }

    /**Задание 4.
     * Дан круг радиуса R. Определить, поместится ли правильный
     * треугольник со стороной а в этом круге.*/
    public static void lab2_4() throws IOException {
        System.out.println("\nЗадание 4");
        Scanner in = new Scanner(System.in);

        double R, a;

        System.out.print("1-ввод с клавиатуры, 2 - ввод из файла ");
        int a1=in.nextInt();
        if (a1==2){
            File file = new File("4.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            ArrayList<String> line= new ArrayList<>();
            line.add(reader.readLine());
            line.add(reader.readLine());
            R = Double.parseDouble(line.get(0));
            a = Double.parseDouble(line.get(1));
        }else {
            System.out.print("Введите x, y: ");
            System.out.print("Введите радиус круга R: ");
            R=in.nextDouble();
            System.out.print("Введите сторону правильного треугольника a: ");
            a=in.nextDouble();
        }

        if (a <= 2 * R / Math.sqrt(3)) {
            System.out.println("Правильный треугольник со стороной a поместится в круг радиуса R");
        } else {
            System.out.println("Правильный треугольник со стороной a не поместится в круг радиуса R");
        }
    }
    /**Задание 5.
     * Составить программу, которая по данному числу (1-12) выводит
     * название соответствующего ему месяца.*/
    public static void lab2_5() throws IOException {
        System.out.println("\nЗадание 5");
        Scanner in = new Scanner(System.in);
        int month ;
        System.out.print("1-ввод с клавиатуры, 2 - ввод из файла ");
        int a=in.nextInt();
        if (a==2){
            File file = new File("5.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            ArrayList<String> line= new ArrayList<>();
            line.add(reader.readLine());
            month= Integer.parseInt(line.get(0));
        }else {
            System.out.print("Введите x, y: ");
            month=in.nextInt();
        }
        System.out.print("Введите номер месяца (1-12): ");
        switch (month) {
            case 1 -> System.out.println("Январь");
            case 2 -> System.out.println("Февраль");
            case 3 -> System.out.println("Март");
            case 4 -> System.out.println("Апрель");
            case 5 -> System.out.println("Май");
            case 6 -> System.out.println("Июнь");
            case 7 -> System.out.println("Июль");
            case 8 -> System.out.println("Август");
            case 9 -> System.out.println("Сентябрь");
            case 10 -> System.out.println("Октябрь");
            case 11 -> System.out.println("Ноябрь");
            case 12 -> System.out.println("Декабрь");
            default -> System.out.println("Неверный номер месяца!");
        }
    }
    /**Задание 6.
     * Дано натуральное число n. Проверить, есть ли в записи числа
     * три одинаковые цифры (n < 9999).*/
    public static void lab2_6() throws IOException {
        System.out.println("\nЗадание 6");
        Scanner in = new Scanner(System.in);
        int n ;
        System.out.print("1-ввод с клавиатуры, 2 - ввод из файла ");
        int a=in.nextInt();
        if (a==2){
            File file = new File("6.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            ArrayList<String> line= new ArrayList<>();
            line.add(reader.readLine());
            n= Integer.parseInt(line.get(0));
        }else {
            System.out.print("Введите n: ");
            n = in.nextInt();
        }
        boolean hasSameDigits = false;
        String nStr = Integer.toString(n);
        for (int i = 0; i < nStr.length() - 2; i++) {
            if (nStr.charAt(i) == nStr.charAt(i+1) && nStr.charAt(i) == nStr.charAt(i+2)) {
                hasSameDigits = true;
                break;
            }
        }
        if (hasSameDigits) {
            System.out.println("В записи числа есть три одинаковые цифры");
        } else {
            System.out.println("В записи числа нет трех одинаковых цифр");
        }
    }
    /**Задание 7.
     * Покажите, что для всех n = 1, 2, 3,
     * N (l5 + 25 + ... + n5) + (l7+27 + ... + n7) = 2 (l + 2 + ... + n)4.*/
    public static void lab2_7() throws IOException {
        System.out.println("\nЗадание 7");
        Scanner in = new Scanner(System.in);
        System.out.print("1-ввод с клавиатуры, 2 - ввод из файла ");
        int a1=in.nextInt(), n;
        if (a1==2){
            File file = new File("7.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            ArrayList<String> line= new ArrayList<>();
            line.add(reader.readLine());
            n= Integer.parseInt((line.get(0)));
        }else {

            n=in.nextInt();
        }

        int sum5 = 0, sum7 = 0, sum = 0;
        for (int i = 1; i <= n; i++) {
            sum5 += Math.pow(i, 5);
            sum7 += Math.pow(i, 7);
        }
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        int rightSide = 2 * (int)Math.pow(sum, 4);
        if (sum5 + sum7 == rightSide) {
            System.out.println("Уравнение верно для n = " + n);
        } else {
            System.out.println("Уравнение не верно для n = " + n);
        }
    }
    /**Задание 8.
     * Дано натуральное число n и действительное а. Найти сумму n членов ряда.*/
    public static void lab2_8() throws IOException {
        System.out.println("\nЗадание 8");
        Scanner in = new Scanner(System.in);
        File file = new File("8.txt");
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        double x,n, s=1, a=1, b=1, p=1, c;
        ArrayList<String> line= new ArrayList<>();
        line.add(reader.readLine());
        line.add(reader.readLine());
        System.out.print("1-ввод с клавиатуры, 2 - ввод из файла ");
        int a1=in.nextInt();
        if (a1==2){
            x= Double.parseDouble(line.get(0));
            n= Double.parseDouble(line.get(1));
        }else {

            System.out.println("Введите Х");
            x=in.nextDouble();
            System.out.println("Введите n");
            n=in.nextDouble();
        }

        for (int i = 1; i < n; i++) {
            p=-p;
            a*=x*x;
            b*=2*i;
            c=p*a/b;
            s+=c;
        }
        System.out.println("Сумма n членов ряда равна : " + s);
    }
}
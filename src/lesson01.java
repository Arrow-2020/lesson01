public class lesson01 //1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
{
    public static void main(String[] args) {

        // 2 переменные всех пройденных типов данных.
        System.out.println("\n" +
                "byte\n" + "8-битное знаковое целое число\n" + "от -128 до 127\n" +
                "short\n" + "16-битное знаковое целое число\n" + "от -32768 до 32767\n" +
                "int\n" + "32-битное знаковое целое число\n" + "от -2147483648 \n" + "до 2147483647\n" +
                "long\n" + "64-битное знаковое целое число\n" + "от -9223372036854775808 \n" + "до 9223372036854775807\n" +
                "float\n" + "32-битное знаковое число с плавающей запятой одинарной точности\n" + "\n" + "\n" +
                "double\n" + "64-битное знаковое число с плавающей запятой двойной точности\n" + "\n" + "\n" +
                "char\n" + "16-битный тип данных, предназначенный для хранения символов в кодировке Unicode\n" + "от '\\u0000' или 0 \n" + "до '\\uffff' или 65,535\n" +
                "boolean\n" + "логический тип данных\n" + "false, true\n");
    }

    // 3 Написать метод вычисляющий выражение.
    public static void maineThree(int a, int b, int c, int d) {
        System.out.println(a * (b + (c / d)));
    }

    // 4 Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20.
    public static boolean checkNumbers(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20)
        {
            return true;
        } else {
            return false;
        }
    }
    //5 Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
    // положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.

    public static void mainZero(int a)
    {
        if (a >= 0)
        {
            System.out.println("Значение" + a + "положительное");
        } else {
            System.out.println("Значение" + a + "отрицательное");
        }
    }

    //6 Написать метод, которому в качестве параметра передается целое число,
    // метод должен вернуть true, если число отрицательное
    static boolean positively(int a)
    {
        if (a < 0)
        {
            return true;
        } else
            {
            return false;
        }

    }



    /* 7  Написать метод, которому в качестве параметра передается строка,
     обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;*/

    static void helloName(String name)
    {
        System.out.println("Привет, " + name + "!");

    }

    //8. Написать метод, который определяет является ли год високосным, и выводит сообщение
    //в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й
    //– високосный.
    static void calendar (int year)
    {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }
}


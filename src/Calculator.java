import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String text = """
                Выберите действие:
                0: Выйти
                1: Сложениие
                2: Вычитание
                3: Умножение
                4: Деление
                5: Факториал
                """;
        System.out.println(text);

        int i = in.nextInt();

        switch (i){
            case 0:
                return;
            case 1:
                printSum();
                main(null);
                break;
            case 2:
                printDif();
                main(null);
                break;
            case 3:
                printMul();
                main(null);
                break;
            case 4:
                printDiv();
                main(null);
                break;
            case 5:
                printFact();
                main(null);
                break;
            default:
                System.out.println("Операция не найдена");
        }
    }

    static void printSum(){
        double x,y;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое слагаемое:");
        x = in.nextDouble();
        System.out.println("Введите второе слагаемое:");
        y = in.nextDouble();
        System.out.println("Сумма:\n"+sum(x,y));
    }
    static double sum(double x, double y){
        return x + y;
    }

    static void printDif(){
        double x,y;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите уменьшаемое:");
        x = in.nextDouble();
        System.out.println("Введите вычитаемое:");
        y = in.nextDouble();
        System.out.println("Разность:\n"+dif(x,y));
    }
    static double dif(double x, double y){
        return x - y;
    }

    static void printMul(){
        double x,y;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первый множитель:");
        x = in.nextDouble();
        System.out.println("Введите второй множитель:");
        y = in.nextDouble();
        System.out.println("Произведение:\n"+mul(x,y));
    }
    static double mul(double x, double y){
        return x*y;
    }

    static void printDiv(){
        double x,y;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите делимое:");
        x = in.nextDouble();
        System.out.println("Введите делитель:");
        y = in.nextDouble();
        try{
            System.out.println("Частное:\n"+div(x,y));
        }
        catch (ArithmeticException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
    static double div(double x, double y){
        if(y == 0){
            throw  new ArithmeticException("Dividing into zero");
        }
        return x/y; }

    static void printFact(){
        int x;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число X, не превышающее 20:");
        x = in.nextInt();
        System.out.println("X! = "+fact(x));
    }
    static long fact(int x){
        if(x==1){
            return 1;
        }
        return x*fact(x-1);
    }
}

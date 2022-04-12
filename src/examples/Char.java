package examples;

public class Char {
    public static void printingChars() {
        System.out.println('d'); //d
        System.out.println(Integer.valueOf('d')); //100
        System.out.println((int) 'd'); //100
        System.out.println('d' - 1); //99

        System.out.println("--------");

        System.out.println((char) ('d' - 1)); //c
        System.out.println((char) 'd' - 1); //99
        System.out.println((char) (198 - 'd')); //bracket must be to proper convert whole expression to char //b
        System.out.println((char) 198 - 'd'); //without brackets: //98
        System.out.println((char) 98); //b

        System.out.println("--------");

        char d = 'd';
        System.out.println((int)d); // 100
        System.out.println(d+d); //200
        System.out.println('d' + 'd'); //200
        System.out.println();
    }

    public static void main(String[] args) {
        Char.printingChars();
    }
}

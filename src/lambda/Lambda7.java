package lambda;

public class Lambda7 {
    interface Cast<T, S> {
        S method(T t, S s);
    }

    public static void printing(Cast<Integer, String> cast) {
        String str = cast.method(20, "SS");
        System.out.println(str);
    }

    public static String countNumbers(Cast<Integer, String> cast, int num) {
        return cast.method(10,"10") + num;
    }

    public static String countingNormally(int num) {
        return referenceMethod1(10, "10") + num;
    }

    public static String referenceMethod(Integer num, String str) {
        return num.toString() + str + "THIS IS REFERENCE";
    }

    public static String referenceMethod1(Integer integer, String str) {
        return str + integer;
    }

    public static void main(String[] args) {

        Cast<Integer, String> toString = (i, s) -> i.toString() + s;

        String out = toString.method(19, "SSS");
        System.out.println(out);

        // delivering to printing method another method as an argument to Interface type parameter
        printing(Lambda7::referenceMethod);
        System.out.println("---");

        String output = countNumbers(Lambda7::referenceMethod1, 9);
        System.out.println(output);
        System.out.println(countingNormally(8));
    }
}

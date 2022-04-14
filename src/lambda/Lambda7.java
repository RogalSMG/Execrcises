package lambda;

public class Lambda7 {
    interface Cast<T, S> {
        S method(T t, S s);
    }

    public static void main(String[] args) {
        Cast<Integer, String> toString = (i, s) -> i.toString() + s;

        String out = toString.method(19, "SSS");
        System.out.println(out);

        printing(Lambda7::referenceMethod);

    }


    public static String referenceMethod(Integer num, String str) {
        return num.toString() + str + "THIS IS REFERENCE";
    }


    public static void printing(Cast<Integer, String> cast) {
        String str = cast.method(20, "SS");
        System.out.println(str);
    }
}

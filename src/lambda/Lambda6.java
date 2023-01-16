package lambda;

public class Lambda6 {
    interface MyFunc<R> {
        boolean func(R t1, R t2);
    }

    // method in the same class with interface variable as a parameter
    static int counter(MyFunc<Integer> f, int a, int b) {
        int count = 0;
        if (f.func(a, b)) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // declare and initialize statement to myFunc variable t1 > t2 and parametrized it with integer
        MyFunc<Integer> myFunc = (t1, t2) -> t1 > t2;

        // calling method in the same class
        int out = counter(myFunc, 8, 7);
        System.out.println(out);

        // calling method in different class
        int out2 = AnotherClass.difference(myFunc, 13, 17);
        System.out.println(out2);

        int out3 = AnotherClass.difference(myFunc, 12, 18);
        System.out.println(out3);
    }
}

class AnotherClass {
    // method in different class with interface variable as a parameter
    static int difference(Lambda6.MyFunc<Integer> f, int a, int b) {

        // f.func - f is a delivered interface argument and "func" is name of this interface method
        if (f.func(a, b)) {
            return a - b;
        } else {
            return b - a;
        }
    }
}

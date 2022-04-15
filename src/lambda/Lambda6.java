package lambda;

public class Lambda6 {
    interface MyFunc<R> {
        boolean func(R t1, R t2);
    }

    static int counter(MyFunc<Integer> f, int a, int b) {
        int count = 0;
        if (f.func(a, b)) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        MyFunc<Integer> myFunc = (t1, t2) -> t1 > t2;

        int out = counter(myFunc, 8, 7);
        System.out.println(out);

        int out2 = AnotherClass.difference(myFunc, 13, 17);
        System.out.println(out2);

        int out3 = AnotherClass.difference(myFunc, 12, 18);
        System.out.println(out3);
    }
}

class AnotherClass {
    static int difference(Lambda6.MyFunc<Integer> f, int a, int b) {
        if (f.func(a, b)) {
            return a - b;
        } else {
            return b - a;
        }
    }
}

package lambda;

public class Lambda6 {
    interface MyFunc<R> {
        boolean func(R t1, R t2);
    }

    class InnerClassWithStaticMethod {
        static int counter(MyFunc<Integer> f) {
            int count = 0;
            if (f.func(7, 6)) {
                count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        MyFunc<Integer> myFunc = (t1, t2) -> t1 > t2;
        int out = InnerClassWithStaticMethod.counter(myFunc);
        System.out.println(out);

//        InnerClassWithStaticMethod.counter((t1, t2) -> );
    }
}

package lambda;

public class Lambda1 {
    private interface firstLambda {
        void doSth();
    }

    public static void main(String[] args) {
        firstLambda inter;
        inter = () -> System.out.println("doing");

        // print doing
        inter.doSth();

        // getting name of anonymous class
        String anonymousClass = inter.getClass().getName();
        System.out.println(anonymousClass);

        // make obj of LambdaTry class, constructor include lambda exp so field inter have assigned value when obj is created
        LambdaTry lambdaTry = new LambdaTry();
        lambdaTry.inter.doSth();
        // change value of inter field by using lambda
        lambdaTry.inter = () -> System.out.println("Using this");
        lambdaTry.inter.doSth();

        ClassWithTwoInterfaces lambdaTry1 = new ClassWithTwoInterfaces();
    }

    static class LambdaTry {
        // interface variable
        firstLambda inter;

        public LambdaTry() {
            this.inter = () -> System.out.println("I'm doing sth");
        }
    }
}

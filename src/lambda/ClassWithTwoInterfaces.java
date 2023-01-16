package lambda;

public class ClassWithTwoInterfaces {
    FirstLambdaInterface firstLambdaInterface;
    SecondLambdaInterface secondLambdaInterface;

    // default constructor
    public ClassWithTwoInterfaces() {
    }

    interface FirstLambdaInterface {
        void returnVoidInterfaceMethod();
    }

    interface SecondLambdaInterface {
        int returnIntInterfaceMethod();
    }
}

package lambda;

public class ClassWithTwoInterfaces {
    interface FirstLambdaInterface {
        void returnVoidInterfaceMethod();
    }

    interface SecondLambdaInterface {
        int returnIntInterfaceMethod();
    }
    FirstLambdaInterface firstLambdaInterface;
    SecondLambdaInterface secondLambdaInterface;
}

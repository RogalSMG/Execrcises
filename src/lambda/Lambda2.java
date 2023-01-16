package lambda;

public class Lambda2 {
    public static void main(String[] args) {
        // initialize class
        ClassWithTwoInterfaces lambdaTrySepClass = new ClassWithTwoInterfaces();

        // assign value to first interface
        lambdaTrySepClass.firstLambdaInterface = () -> {
            System.out.println("Print first");
            System.out.println("Print second");
        };

        // call first interface method
        lambdaTrySepClass.firstLambdaInterface.returnVoidInterfaceMethod();

        // assign nothing to lambda
        lambdaTrySepClass.firstLambdaInterface = () -> {
        };

        // calling empty method
        lambdaTrySepClass.firstLambdaInterface.returnVoidInterfaceMethod();

        System.out.println("-----");
        // assign expression to second int type interface method
        lambdaTrySepClass.secondLambdaInterface = () -> 5;
        int variableFromLambda = lambdaTrySepClass.secondLambdaInterface.returnIntInterfaceMethod();

        // calling method of second interface
        System.out.println(variableFromLambda);

        // new assignment to second interface method
        // there can be passed whole statement as an argument to interface method by using lambda expression
        lambdaTrySepClass.secondLambdaInterface = () -> (int) (Math.random() * 100); // projection needed because method of IVar return int type

        // each time when interface instance is called -> expression assigned to this interface variable is performed
        System.out.println(lambdaTrySepClass.secondLambdaInterface.returnIntInterfaceMethod());
        System.out.println(lambdaTrySepClass.secondLambdaInterface.returnIntInterfaceMethod());
    }
}

package lambda;

public class Lambda2 {
    public static void main(String[] args) {
        // initialize class
        ClassWithTwoInterfaces lambdaTrySepClass = new ClassWithTwoInterfaces();

        // assign value to second interface
        lambdaTrySepClass.firstLambdaInterface = () -> {
            System.out.println("Print first");
            System.out.println("Print second");
        };

        // use value of interface var
        lambdaTrySepClass.firstLambdaInterface.returnVoidInterfaceMethod();

        // assign nothing to lambda
        lambdaTrySepClass.firstLambdaInterface = () -> {};
        lambdaTrySepClass.firstLambdaInterface.returnVoidInterfaceMethod();

        System.out.println("-----");
        // assign expression to interface method
        lambdaTrySepClass.secondLambdaInterface = () -> 5;
        int variableFromLambda = lambdaTrySepClass.secondLambdaInterface.returnIntInterfaceMethod();
        System.out.println(variableFromLambda);

        // each time when interface instance is called -> expression assigned to this interface variable is performed
        lambdaTrySepClass.secondLambdaInterface = () -> (int) (Math.random() * 100); // projection needed because method of IVar return int type
        System.out.println(lambdaTrySepClass.secondLambdaInterface.returnIntInterfaceMethod());
        System.out.println(lambdaTrySepClass.secondLambdaInterface.returnIntInterfaceMethod());
    }
}

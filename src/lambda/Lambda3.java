package lambda;

/**
 * Lambda with interface
 */
public class Lambda3 {
    LambdaInterfaceParameterDouble lambdaField;

    public LambdaInterfaceParameterDouble getLambdaInterfaceParameterDouble() {
        return lambdaField;
    }

    public void setLambdaInterfaceParameterDouble(LambdaInterfaceParameterDouble lambdaField) {
        this.lambdaField = lambdaField;
    }

    public static void main(String[] args) {
        // first variable
        LambdaInterfaceDouble aDouble = () -> 1;
        System.out.println(aDouble.doubleMethod());

        System.out.println("---");

        LambdaInterfaceDouble aDouble1 = () -> 10;
        System.out.println(aDouble1.doubleMethod());
        System.out.println(aDouble.doubleMethod());

        System.out.println("---");

        LambdaInterfaceParameterDouble parameterDouble = (x, z) -> x * z;
        int result = parameterDouble.intMethodWithParam(4, 2);
        System.out.println(result);

        parameterDouble = (x, z) -> x * 2 * z;
        result = parameterDouble.intMethodWithParam(4, 2);
        System.out.println(result);

        System.out.println("---");

        // create class and assign expression to interface
        Lambda3 lambda3 = new Lambda3();
        lambda3.lambdaField = (x, z) -> x * z;

        //
        System.out.println(lambda3.lambdaField.intMethodWithParam(4, 3));

        // change interface method by using class setter
        lambda3.setLambdaInterfaceParameterDouble((x, z) -> x * z * 2);
        System.out.println(lambda3.lambdaField.intMethodWithParam(4, 3));

    }
}

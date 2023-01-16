package lambda;

public class Lambda3 {
    LambdaInterfaceTwoParameter lambdaField;

    public LambdaInterfaceTwoParameter getLambdaInterfaceParameterDouble() {
        return lambdaField;
    }

    public void setLambdaInterfaceParameterDouble(LambdaInterfaceTwoParameter lambdaField) {
        this.lambdaField = lambdaField;
    }

    /**
     * Lambda with interfaces, creating interface variables using public interfaces
     */
    public static void main(String[] args) {
        // first interface variable aDouble
        LambdaInterfaceDouble aDouble = () -> 1;
        System.out.println(aDouble.doubleMethod());

        System.out.println("---");

        // second variable aDouble1
        LambdaInterfaceDouble aDouble1 = () -> 10;
        System.out.println(aDouble1.doubleMethod());
        System.out.println(aDouble.doubleMethod());

        System.out.println("---");

        // different interface used to create parameterDouble interface variable
        LambdaInterfaceTwoParameter parameterDouble = (x, z) -> x * z;
        int result = parameterDouble.intMethodWithParam(4, 2);
        System.out.println(result);

        // reassign expression assigned to parameterDouble
        parameterDouble = (x, z) -> x * 2 * z;
        result = parameterDouble.intMethodWithParam(4, 2);
        System.out.println(result);

        System.out.println("---");

        // create class and assign expression to interface
        Lambda3 lambda3 = new Lambda3();
        lambda3.lambdaField = (x, z) -> x * z;
        System.out.println(lambda3.lambdaField.intMethodWithParam(4, 3));

        // change interface method by using class setter method
        lambda3.setLambdaInterfaceParameterDouble((x, z) -> x * z * 2);
        // Calling method from class field
        System.out.println(lambda3.lambdaField.intMethodWithParam(4, 3));
        // Calling interface method by class getter
        System.out.println(lambda3.getLambdaInterfaceParameterDouble().intMethodWithParam(5,5));

    }
}

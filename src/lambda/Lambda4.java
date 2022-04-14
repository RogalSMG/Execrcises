package lambda;

public class Lambda4 {
    interface ParametrizedI<T> {
        T method(T var);
    }

    public static void main(String[] args) {
        // functional interface variable reversString parametrized with generic type String
        ParametrizedI<String> reversString = var -> {
            StringBuilder output = new StringBuilder();
            for (int i = var.length() - 1; i >= 0; i--) {
                output.append(var.charAt(i));
            }
            return output.toString();
        };

        System.out.println(reversString.method("String"));

        // functional interface variable factorial parametrized with generic type Integer
        ParametrizedI<Integer> factorial = var -> {
            int result = 1;
            for (int i = 1; i <= var; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println(factorial.method(5));
    }
}

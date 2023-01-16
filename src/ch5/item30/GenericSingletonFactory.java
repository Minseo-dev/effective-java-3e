package ch5.item30;

import java.util.function.UnaryOperator;

public class GenericSingletonFactory {

    private static UnaryOperator<Object> IDENTITY_FN = (t) -> t;

    @SuppressWarnings("unchecked")
    public static <T> UnaryOperator<T> identityFunction() {
        return (UnaryOperator<T>) IDENTITY_FN;
    }

    public static void main(String[] args) {

        String[] strings = {"민서", "오로라", "나일론"};

        UnaryOperator<String> sameString = identityFunction();

        for (String s : strings)
            System.out.println(sameString.apply(s));

    }

}

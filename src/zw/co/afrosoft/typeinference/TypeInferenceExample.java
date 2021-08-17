package zw.co.afrosoft.typeinference;

public class TypeInferenceExample {

    public static void main(String[] args) {
        StringLengthLambda findLength = (String name) -> name.length();
        System.out.println( findLength.getLength("shedza"));
    }
}
interface StringLengthLambda{
    int getLength(String s);
}

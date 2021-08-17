package zw.co.afrosoft.example;

public class Main {

    public static void main(String[] args) {


        MyLambda firstLine = () -> System.out.println("lambda expression");


        MyAddLambda addFunction=(int a, int b) -> a+b;


          MyAddLambda  safeDivision=(int a, int b) -> {
                if(b==0) return 0;
                return a/b;
            };

        //    doubleFunction = (int a) -> a*2;

         //   stringLengthCountFunction = (String s) -> s.length();


    }

}


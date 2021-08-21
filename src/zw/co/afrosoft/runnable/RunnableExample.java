package zw.co.afrosoft.runnable;

public class RunnableExample {
    public static void main(String[] args) {

     Thread thread = new Thread(new Runnable() {
         @Override
         public void run() {
             System.out.println("printed inside runnable");
         }
     });
    }

    Thread myLambdaThread = new Thread(()-> System.out.println("printed inside lambda runnable"));
}

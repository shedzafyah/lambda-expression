package zw.co.afrosoft.exercise;

import java.util.*;
import java.util.concurrent.locks.*;

public class SolutionInJava8 {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
          new Person("shelton", "shamu",23),
          new Person("owen", "maleta",23),
                new Person("lisa", "moyo",30),
                new Person("gainmore", "shamu",12)
        );

        /*
            Sort List by firstname
         */

        System.out.println("********************* Printing all names **************");
        Collections.sort(personList, (p1,p2)->p1.getFirstname().compareTo(p2.getFirstname()));
        printAll(personList, p-> true);

        /*
        Print all firstname that start with s
         */
        System.out.println("******* printing all firstnames starting with S************");
        printAll(personList, p-> p.getFirstname().startsWith("s"));

        /*
        printing all lastnames that start with m
         */
        System.out.println("***********printing all lastnames that starts with M*************");
        printAll(personList, p-> p.getLastname().startsWith("m"));

    }

    static void printAll(List<Person> people , Condition c){
        for ( Person p : people
             ) {
            if(c.test(p))
            System.out.println(p);
        }
    }

}

interface Comparable{
    void test(Person p);
}

interface Condition{
    boolean test( Person p);
}

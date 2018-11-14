/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autotestproject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Administrator
 */
public class Hello {
    /**
     * @param args the command line arguments
     */
    
    public static <T> int linearSearch(List<T> list, Predicate<T> check){
        
        for(int i = 0; i < list.size(); i++){
            if(check.test(list.get(i)))
                return i;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Lists
        List<String> alpha = new ArrayList();
        List<Integer> beta = new ArrayList();
        
        //Predicates
        Predicate<Integer> n1 = i -> (i == 0);
        Predicate<Integer> n2 = i -> (i == 4);
        Predicate<Integer> n3 = i -> (i == 11);
        Predicate<String> str1 = i -> (i == "First");
        Predicate<String> str2 = i -> (i == "Yup");
        Predicate<String> str3 = i -> (i == "MegaL");
        
        //Adding elements to integer list
        for(int i = 0; i < 10; i++)
            beta.add(i);
        
        //Adding elements to String list
        alpha.add("First");
        alpha.add("Absesce");
        alpha.add("Yup");
        alpha.add("Absesce");
        alpha.add("Absesce");
        
        int a = linearSearch(alpha, str1);
        int b = linearSearch(alpha, str2);
        int c = linearSearch(alpha, str3);
        
        int d = linearSearch(beta, n1);
        int e = linearSearch(beta, n2);
        int f = linearSearch(beta, n3);
        
        for(int i = 0; i < 10; i++)
            System.out.println(beta.get(i));
        
        System.out.println("===========================================================================");

        for(int i = 0; i < alpha.size(); i++)
            System.out.println(alpha.get(i));
        
        System.out.println("Hello World!" + " First's index = " + a + ", Yup's index = " + b + ", Non existing index = " + c);
        System.out.println("Hello World!" + " 0's index = " + d + ", 4's index = " + e + ", Non existing index = " + f);
    }
}
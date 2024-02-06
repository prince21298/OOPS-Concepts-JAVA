package com.ExceptionHnadling;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int a = 5;
        int b = 2;
        try{
            int value  = divide(a,b);
            System.out.println(value);
            Scanner string = new Scanner(System.in);
            System.out.print("Enter your input .... ");
            String userName = string.nextLine();
            if(userName.equals("Prince1")){
                throw new MyException("Name is Correct");
            }
            else{
                throw new MyException(new Throwable("It should have Name Called Prince1"));
            }
//            string.close();
        }
        catch ( MyException error){
            System.out.println(error.getMessage());
        }
        catch (Exception error){
            if(error.getMessage().trim().toLowerCase(Locale.ROOT).equals("exception")){
                System.out.println(  "Arithmetic" + error.getMessage());
            }
            else{
                System.out.println(error.getMessage());

            }

        }
        finally {
            System.out.println("Done ..");
        }
    }

     public static int divide(int a, int b) throws ArithmeticException {
        if (a == 0 || b == 0){
            throw new ArithmeticException("Any Parameter can't be Zero");
        }
        else{
            System.out.println(a/b);
            return a/b;
        }
     }

}

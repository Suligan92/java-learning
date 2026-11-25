package org.example.exceptions;

public class ExceptionsDemo {
    public static void main(String[] args) {
       try {
           int[] a = new int[3];
           a[3] = 1;
       }  catch (Exception e) {
           System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
       } finally {
           System.out.println("gata");
       }

       try {
           String s = null;
           System.out.println(s.length());
       } catch (Exception e) {
           System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
       } finally {
           System.out.println("gata");
       }

       try {
           int n = Integer.parseInt("12x");
       } catch (Exception e) {
           System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
       }  finally {
           System.out.println("gata");
       }

        System.out.println(test());

    }

    static int test() {
        try {
            return 1;
        } finally {
            System.out.println("gata");
        }
    }
}

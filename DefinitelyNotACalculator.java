import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.lang.Math;
/**
 * This class represents an interactive calculator
 * @author Ananya Heroor
 */
public class DefinitelyNotACalculator{
    public static void main (String[] args){
        System.out.println("Good day, Mr. Finch! Welcome to your totally-not-a-calculator.");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Please input an expression:");
        String input = sc.nextLine().toLowerCase();
        String [] a = input.split(" ");
        while (!input.equals("quit")){
            if (!a[0].equals("+")&&!a[0].equals("-")&&!a[0].equals("*")&&!a[0].equals("/")&&!a[0].equals("abs")&&!a[0].equals("log")&&!a[0].equals("sqrt")&&!a[0].equals("pow")&&!a[0].equals("rand")&&!a[0].equals("sum")&&!a[0].equals("sort")&&!a[0].equals("max") &&(a.length<=3||a.length>=3)){
                System.out.println("Error! Command not found.");
            }else if ((a.length>3 && !a[0].equals("sum")&&!a[0].equals("sort"))||(a.length>=3 && (a[0].equals("abs")||a[0].equals("log")||a[0].equals("sqrt")))){
                System.out.println("Error! Too many arguments.");
            }else if (((!a[0].equals("abs")||!a[0].equals("log")||!a[0].equals("sqrt")||!a[0].equals("rand")))&&(a.length<2)){
                System.out.println("Error! Not enough arguments!");
            }else if ((a[0].equals("+")||a[0].equals("-")||a[0].equals("*")||a[0].equals("/")||a[0].equals("max")||a[0].equals("pow")||a[0].equals("abs")||a[0].equals("sqrt")||a[0].equals("rand")||a[0].equals("sum")||a[0].equals("sort"))&&a.length==1){
                System.out.println("Error! Not enough arguments!");
            }else if ((a[0].equals("+")||a[0].equals("-")||a[0].equals("*")||a[0].equals("/")||a[0].equals("max")||a[0].equals("pow"))&&a.length==2){
                System.out.println("Error! Not enough arguments!");
            }else if (a[0].equals("+")){
                try{
                double x = Double.valueOf(a[1]).doubleValue();
                double y = Double.valueOf(a[2]).doubleValue();
                System.out.println(x+y);   
                } catch(Exception e){
                    System.out.println("Error! Incorrect type in argument.");
                }
            }else if (a[0].equals("-")){
                try{
                double x = Double.valueOf(a[1]).doubleValue();
                double y = Double.valueOf(a[2]).doubleValue();
                System.out.println(x-y);   
                } catch (Exception e){
                    System.out.println("Error! Incorrect type in argument.");
                }
            }else if (a[0].equals("*")){
                try{
                double x = Double.valueOf(a[1]).doubleValue();
                double y = Double.valueOf(a[2]).doubleValue();
                System.out.println(x*y);
                } catch (Exception e){
                    System.out.println("Error! Incorrect type in argument.");
                }
            }else if (a[0].equals("/")){
                try{
                double x = Double.valueOf(a[1]).doubleValue();
                double y = Double.valueOf(a[2]).doubleValue();
                System.out.println(x/y);
                } catch (Exception e){
                System.out.println("Error! Incorrect type in argument.");
                }
            }else if (a[0].equals("max")){
                try{
                double x = Double.valueOf(a[1]).doubleValue();
                double y = Double.valueOf(a[2]).doubleValue();
                System.out.println(Math.max(x, y));
                } catch (Exception e){
                System.out.println("Error! Incorrect type in argument.");
                }
            }else if (a[0].equals("pow")){
                try{
                double x = Double.valueOf(a[1]).doubleValue();
                double y = Double.valueOf(a[2]).doubleValue();
                System.out.println(Math.pow(x, y));
                } catch (Exception e){
                System.out.println("Error! Incorrect type in argument.");
                }
            }else if (a[0].equals("abs")){
                try{
                double x = Double.valueOf(a[1]).doubleValue();
                System.out.println(Math.abs(x));
                } catch (Exception e){
                System.out.println("Error! Incorrect type in argument.");
                }
            }else if (a[0].equals("log")){
                try{
                double x = Double.valueOf(a[1]).doubleValue();
                System.out.println(Math.log10(x));
                } catch (Exception e){
                System.out.println("Error! Incorrect type in argument.");
                }
            }else if (a[0].equals("sqrt")){
                try{
                double x = Double.valueOf(a[1]).doubleValue();
                System.out.println(Math.sqrt(x));
                } catch (Exception e){
                System.out.println("Error! Incorrect type in argument.");
                }
            }else if (a[0].equals("rand")&& a.length==3){ 
                try{
                double x = Double.valueOf(a[1]).doubleValue();
                double y = Double.valueOf(a[2]).doubleValue();
                int min = Math.min((int)(x),(int)(y));
                int max = Math.max((int)(x), (int) (y));
                System.out.println(r.nextInt((max-min)+1)+min);   
                } catch (Exception e){
                System.out.println("Error! Incorrect type in argument.");
                }
            }else if (a[0].equals("rand")&& a.length==2){
                try{
                double x = Double.valueOf(a[1]).doubleValue();
                System.out.println(0 + (x-0)*r.nextDouble());   
                } catch (Exception e){
                System.out.println("Error! Incorrect type in argument.");
                }
            }else if (a[0].equals("sum")){
                try{
                    double sum = 0;
                    for (int i = 1; i<a.length;i++){
                        sum += Double.valueOf(a[i]).doubleValue();
                    }
                    System.out.println(sum);
                } catch (Exception e){
                    System.out.println("Error! Incorrect type in argument.");
                }
            }else if (a[0].equals("sort")){ 
                try{
                double [] b = new double[a.length-1];
                for (int i = 1; i<a.length;i++){
                    b[i-1]=Double.valueOf(a[i]).doubleValue();
                }
                Arrays.sort(b);
                for(int i = 0; i<b.length;i++){
                    System.out.print(b[i]+ " ");
                }
                System.out.println();
                } catch (Exception e){
                    System.out.println("Error! Incorrect type in argument.");
                }
            }
            System.out.print("Please input an expression:");
            input = sc.nextLine().toLowerCase();
            a = input.split(" "); 
        }
        System.out.println("Have a nice day, Mr. Finch!");
    }

}
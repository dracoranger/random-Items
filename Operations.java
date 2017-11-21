**
 * Created by x86445 on 8/18/2015.
 */
//import java.util.Scanner;
import java.io.FileNotFoundException;
import java.lang.Math;
import java.io.PrintWriter;
import java.io.FileNotFoundException;


public class main {

    public static void main(String[] args)throws FileNotFoundException {

        PrintWriter write= new PrintWriter("output.txt");
        write.flush();

        int input=1, i=1, iLess=0, iHolder=0, fibCount=0, sqrtInp=0;
        String result="", stringChecker="";
        boolean works=true, prior=false;
        //long overflowProtect=0;


        int[] fib= new int [32];
        //int[] prime= new int [10000];

        while(i<1000001)//Creates fib sequence
        {
            fib[fibCount]=i;
            iHolder=i;
            i=i+iLess;
            iLess=iHolder;
            fibCount++;
        }

        while(input<1000001) {   //MAIN FUNCTION


            //System.out.println("Please input number.");
            //input = scan.nextInt();
            stringChecker = Integer.toString(input);

            for (int j = 0; j < 32; j++)//Checks fib sequence
            {
                if (input == fib[j]) {
                    result += "Fibbits";
                    prior = true;
                    j=33;
                }
            }

            iHolder = stringChecker.length();
            for (int j = 0; j < iHolder / 2; j++)//takes input as a string, compares each part to itself
            {
                String a, b;
                a = stringChecker.substring(j, j + 1);
                b = stringChecker.substring(iHolder - j - 1, iHolder - j);
                if (a.compareTo(b) != 0) {
                    works = false;
                    j = iHolder;
                }
            }
            if (works) {
                if (prior) {
                    result += " ";
                }
                result += "BitstiB";
                prior = true;
            }
            works = true;

            sqrtInp = (int) Math.sqrt(input);
            sqrtInp++;

            for (int j = sqrtInp; j >= 2; j--)//Checks if prime.  Since the sqrt +1 will go through all possible combos,
            {                            //this speeds up the equation.
                //int debug=j%sqrtInp;   //debug code had input rather than j.  fixed
                //System.out.println(debug);
                if (input == 2 || input == 3) {
                    j = 0;
                } else if (input % j == 0) {
                    works = false;
                    j = 0;
                }
                    //I think this takes up too many cycles.  Going to try different solution.
            }



            if (works) {
                if (prior) {
                    result += " ";
                }
                result += "BitsForEveryone!";
                prior = true;
            }
            works = true;


            if (input % 3 == 0) {
                if (prior) {
                    result += " ";
                }
                result += "CrowdOfBits";
                prior = true;
            }
            if (input % 5 == 0) {
                if (prior) {
                    result += " ";
                }
                result += "MuchBits";
            }

            write.println(input + " " + result);
            if(input%10000==0) {
                System.out.println(input + " " + result);
            }

            i=1;
            iLess=0;
            iHolder=0;
            fibCount=0;
            sqrtInp=0;
            result="";
            stringChecker="";
            works=true;
            prior=false;
            input++;
        }
            input=1000000;
            i=input/15;

            while(input%5!=0&&input%3!=0)
            {
                input=input-1;
            }
            //overflowProtect=(input+15)*(i/2);  Number too large to deal with normally, need to be inventive
            //System.out.println(overflowProtect);
            int a=5*i/2;
            int b=i/2;

            String resultA=Integer.toString(a);
            String resultB=Integer.toString(b);
            result=resultB+resultA;
            write.println(result);
            System.out.println(result);
            write.close();

            //System.out.println("Do you wish to go again?  press 0 for no");
            //input=scan.nextInt();
            //if(input==0)
            //{
              //  keepgoing=false;
            //}



    }
}

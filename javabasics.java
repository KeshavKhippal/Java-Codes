import java.util.Scanner;

public class javabasics {
    public static void main(String[] args) {
        // int a=10;
        int b=5;
        // String name="Tony Stark";
        // System.out.println("a");
        // System.out.println(a);
        // System.out.println(name);


        // a=55;
        // System.out.println(a);

        // Data types
        byte a=8; //-128 to 127(1byte)
        System.out.println(a);
        char ch='a'; //1byte
        System.out.println(ch);

        boolean var=true; //1 byte
        System.out.println(var);

        float price=12.50f; //4bytes
        System.out.println(price);

        int num=10; // 4bytes  -2B to +2B
        System.out.println(num);
        //long 8 bytes
        //double 8 bytes
        short n=240; //2bytes
        System.out.println(n);

        int sum=a+b;
        System.out.println(sum);
        // -> single line comments
        /* multi line commnets
         * jkgnkd
         * bd
         * bd
         */

         //INPUT in java
         Scanner sc=new Scanner(System.in);
        //  String input=sc.next(); // next() function capture till first space
        //  System.out.println(input);

        //  String fullName=sc.nextLine();
        //  System.out.println(fullName);

        //  boolean varu=sc.nextBoolean();
        //  System.out.println(varu    );


         //TYPE Conversion   byte->short->int->float->long->double called widening conversion or implicit conversion
         long a1=25;
        //  int b1=a1; //not compatible , int is smaller than long, cause LOSSY CONVERSION
        //  System.out.println(b1);

        // float number=sc.nextInt();
        // System.out.println(number);



        // TYPE CASTING(Narrowing casting/ explicit conversion) -> jo java mhi krne deta kyuki data loss
        float a2=25.12346876786f;
        int b2=(int)a2;
        System.out.println(b2);

        char c='a';
        char c2='b';
        int number=c;
        int number2=c2;
        System.out.println(number);
        System.out.println(number2);



        /*TYPE PROMOTION
            a+b*c/e
            1.chote datatypes(byte,short,character) ko auto convert krke bada kr de rha
        sirf expression ke saath hote hai
        2. if one operand is long,float,dowble, all will be converted to largest possivle one out of these three
         */ 
        char x='a';
        char y='b';
        char z='c';
        // char xy=a-b;  error cant conv
        System.out.println(x);
        System.out.println((int)x);
        System.out.println((int)y); 
        System.out.println(y-x);
        // byte bt=a+b+c; cant conv int to byte cause it converted all to int
        // we can forcefully do it
        // byte bt=(byte)x+y+z;


        int h1=10; //conv to double
        float h2=20.25f; //conv to double
        long h3=25;//conv to double
        double d=30; //already is double
        double ans= a+b+c+d;
        System.out.println(ans);

        /*
         WRONG
         byte b=5;
         b=b*2; error, cause its an expression,  hence ot will convert it to int, but you are assigning the int to byte causong lossy conversion, thererfore java gives error
         */
        /*
          RIGHT 
          byte b=5;
          b=(byte)b*
         */
    }

}

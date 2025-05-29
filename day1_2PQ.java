import java.util.*;
public class day1_2PQ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();
        // float average=(a+b+c)/3;
        // System.out.println(average);
        
        // int side=sc.nextInt();
        // System.out.println("Area of square is: "+(side*side));

        // float pencilPrice=sc.nextFloat();
        // float penPrice=sc.nextFloat();
        // float eraserPrice=sc.nextFloat();
        // float total=pencilPrice+penPrice+eraserPrice;
        // float gst=(float)total*0.18f;
        // float taxedPrice=total+gst;
        // System.out.println(total);
        // System.out.println(gst);
        // System.out.println(taxedPrice);

        byte b=4;
        char c='a';
        short s=512;
        int i=1000;
        float f=3.14f;
        double d=99.9954;
        double result= (f*b)+(i%c)-(d*s);
        System.out.println(result);
    }
}

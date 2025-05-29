import java.util.*;
public class pattern {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        int n=6;  
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<=n-i-1;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int line=1;line<=5;line++)
        // {
        //     for(int star=1;star<=line;star++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        System.out.println("RECTANGLE----------------------------");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==0 || i==n-1 || j==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("----------Inverted and Rotated half pyramid---------------");
        for(int i=0;i<n;i++) {
            for(int j=0;j<n-i-1;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("Inverted half pyramid");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
                System.out.print("*");
            System.out.println();
        }


        System.out.println("---------------inverted pyramid with number-=----------------------");
        for(int i=0;i<n+1;i++)
        {   int k=1;
            for(int j=0;j<n-i;j++)
            {
                // int k=1;
                System.out.print(k++);    
            }
            System.out.println();
        }

        System.out.println(("Floyd Triangle"));
        int k=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(k+++" ");
            }
            System.out.println();
        }

        System.out.println("================0-1-Triangle===================");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if((i+j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println("=====================BUTTERFLY=====================");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j<i+1)
                    System.out.print("*");
                else System.out.print(" ");
            }
            for(k=0;k<n;k++)
            {
                if(k<n-i-1)
                    System.out.print(" ");
                else System.out.print("*");
            }

            System.out.println();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j<n-i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(k=0;k<n;k++)
            {
                if(k<i+1) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}


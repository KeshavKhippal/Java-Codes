import java.io.*;
import java.util.ArrayList;
public class BufferedReaderDemo {
    public static void main(String[] args) {     
        // try {
        //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //     System.out.print("Enter name: ");
        //     String data=br.readLine();
        //     System.out.print("Hello,"+ data+" !");
        //     br.close();

        // } catch (IOException e) {
        //     System.out.println("IO Error occurred: " + e.getMessage());
        // }
    
    //     try{
    //         BufferedReader br=new BufferedReader(new FileReader("testfile.txt"));
    //         String line;
    //         while((line=br.readLine())!=null)
    //         {
    //             System.out.println(line);
    //         }
    //         br.close();

    //     }
    //     catch(IOException e)
    //     {
    //         System.out.println("IO exception has occured");
    //     }
    // }

        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the names");
            ArrayList<String> names=new ArrayList<>();
            names.add(br.readLine());
            names.add(br.readLine());
            names.add(br.readLine());
            names.add(br.readLine());
            names.add(br.readLine());
            br.close();
            // none of this data is yet written to a file

            BufferedWriter bw=new BufferedWriter(new FileWriter("names.txt",true));
                BufferedReader br=new BufferedReader(new FileWriter("phonebook.txt",true));
            for(String n: names)
            {
                bw.write(n);
                bw.newLine();
            }
            bw.close();
            System.out.println("All names have bee written to names.txt");

            BufferedReader brf=new BufferedReader(new FileReader("names.txt"));
            System.out.println("Content of names.txt is: ");
            String line=brf.readLine();
            while(line!=null)
            {
                System.out.println(line);
                line=brf.readLine();
            }
            brf.close();
        }
        catch(IOException e)
        {
            System.out.println("Something not wanted occures.");
        }
    }
}

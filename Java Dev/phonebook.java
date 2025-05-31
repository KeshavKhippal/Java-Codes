import java.util.*;
// import java.io.File;
import java.io.*;
// import java.io.IOException;
// import java.util.Scanne;

public class phonebook {
    private  Map<String, String> phonebook = new HashMap<>();

    // function to add contact in phonebook
    public void addContact(String name, String number) {
        phonebook.put(name, number);
        System.out.println("Contact added successfully");
    }

    // function to search the name in contact and get its number
    public String searchContact(String name) {
        if (phonebook.containsKey(name)) {
            System.out.println("Contact Found!!");
            return phonebook.get(name);
        }
        return "Not Available";
    }

    // function to remove a contact from HashMap
    public void deleteContact(String name) {
        if (phonebook.containsKey(name)) {
            phonebook.remove(name);
            System.out.println("DELETED CONTACT");
        } else
            System.out.println("Contact Not Available");
    }

    // function to update number
    public void updateContact(String name, String newNumber) {
        if (phonebook.containsKey(name)) {
            phonebook.put(name, newNumber);
            System.out.println("Contact updated successfully");
        } else {
            System.out.println("Contact Not found!! Creating one");
            phonebook.put(name, newNumber);
            System.out.println("Contact created successfully");
        }
    }
    public void exportContactsToFile()
    {
        try
        {
            try {
                Set<String> existing=new HashSet<>();
                File f=new File("phonebook.txt");

                if(f.exists())
                {
                    //this ensures that the file is adresdy present it reds the the file, reaches to eof and after this we append to the file

                    //no no this makes the content of file into hashset, making sure, 
                    // so list-> hashset->bufferreaderadd the files into hasset-> and we append new entries-> if duplicate, dont add-> add if not duplicate.
                    BufferedReader br=new BufferedReader(new FileReader(f));
                    String line;
                    while((line=br.readLine())!=null)
                        existing.add(line.trim());
                    br.close();
                }
                //append new entries only+ remove duplicate entries
                BufferedWriter bw=new BufferedWriter(new FileWriter(f,true));
                for(Map.Entry<String,String> entry: phonebook.entrySet() )
                {
                    String line=entry.getKey() + ":"+ entry.getValue();
                    if(!existing.contains(line))
                    {
                        bw.write(line);
                        bw.newLine();;
                    }
                }
                bw.close();
                System.out.println("Contact have been exported");
            }       
            catch (Exception e) {
                System.out.println("Some IO Exception occured");
                e.printStackTrace();
            }
            // BufferedWriter bw=new BufferedWriter(new FileWriter("phonebook.txt",true));
            // for(Map.Entry<String,String> entry:phonebook.entrySet())
            // {
            //     bw.write(entry.getKey()+ ":"+ entry.getValue()); 
            //     bw.newLine();
            // }
            // System.out.println("File Written Successfully");
            // bw.close();
        }
        catch(IOException e)
        {
            System.out.println("Some IO exception occured");
            e.printStackTrace();
        }
    }

    // print all contact
    public void showAllContact() {
        // using entry set method
        for (Map.Entry<String, String> entry : phonebook.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        phonebook pn = new phonebook();
        boolean check =true;
        while(check)
        {
            System.out.println("===PHONEBOOK MENU===");
            System.out.println("1.Add Contact");
            System.out.println("2.Search Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Update Contact");
            System.out.println("5.Show All Contact");
            System.out.println("6. Exit");
            System.out.println("Enter your choice");
            int n=sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 1:
                    System.out.println(" Enter name and then number");
                    String addName=sc.nextLine();
                    String addphone=sc.nextLine();
                    pn.addContact(addName, addphone);
                    break;
                case 2:
                    System.out.println(" Enter name to search");
                    String searchName=sc.nextLine();
                    pn.searchContact(searchName);
                    break;
                case 3:
                    System.out.println(" Enter name to delete");
                    String deleteName=sc.nextLine();
                    pn.deleteContact(deleteName);
                    break;
                case 4:
                    System.out.println(" Enter name and then  new number");
                    String sameName=sc.nextLine();
                    String newNum=sc.nextLine();
                    pn.updateContact(sameName, newNum);
                    break;
                case 5:
                    if (pn.phonebook.isEmpty()) {
                        System.out.println("Phonebook is empty.");
                    } else {
                        pn.showAllContact();
                    }
                    break;
                case 6:
                    check = false;
                    System.out.println("===========Thankyou for using the software==========");
                    break;
                default:
                    System.out.println("Wrong input!!, try again");
                    break;
        }


    }

}}

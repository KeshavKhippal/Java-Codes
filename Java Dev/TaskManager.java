import java.util.*;
public class taskmanager {
    private List<String> taskList=new ArrayList<>();
    //function to add a new task to manager
    public void addTask(String task)
    {
        taskList.add(task);
    }
    //function to remove task from present list using index
    public boolean removeTask(int index)
    {
        boolean check=false;
       
        if (index >= 0 && index < taskList.size()) {
            taskList.remove(index);
            check = true;
        }
        return check;
    }
    //function to update value at an index
    public boolean updateTask(int index, String newTask)
    {
        if(index>=0 && index<taskList.size())
        {
            taskList.set(index,newTask);
            // System.out.println("Task updated Successfully");
            return true;
        }
        return false;
    }
    //function to print all the alues of List
    public void printAll()
    {
        for(String f: taskList)
        {
            System.out.println(f);
        }
        //prints value with index
        for(int i=0;i<taskList.size();i++)
        {
            System.out.println(i+":"+ taskList.get(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        taskmanager tm = new taskmanager();
        tm.addTask("Wakeup");
        tm.addTask("FreshUp");
        tm.addTask("Wakeup");
        tm.addTask("Wakeup");
        tm.addTask("Wakeu545p");
        tm.addTask("Wakeu545p");
        tm.addTask("Wak54eup");
        tm.addTask("Wakeu45p");
        tm.printAll();
        System.out.println("Enter index to update ");
        int index=sc.nextInt();
        sc.nextLine(); // consume the leftover newline
        System.out.println("enter new task to update with:");
        String newTask=sc.nextLine();
        if(tm.updateTask(index,newTask))
        {
            System.out.println("Task updated successfully");
        }
        tm.printAll();
        index=2;
        if(tm.removeTask(index))
        {
            System.out.println("Task removed successfully");
        }
        tm.printAll();
    }
}

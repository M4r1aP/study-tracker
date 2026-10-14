import java.util.ArrayList;
import java.util.Scanner;

class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();
         while(true){
            System.out.println("press 1 to add a task");
            System.out.println("press 2 to view all tasks");
            System.out.println("press 3 to mark a task as done");
            System.out.println("press 4 to exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.println("enter the name of the task you want to add: ");
                    Task task = new Task(sc.nextLine());
                    task.name = sc.nextLine();
                    task.done= false;
                    tasks.add(task);
                    break;
                case 2:
                    for (Task t:tasks){              
                        if(t.isDone()){
                            System.out.println("[x]"+t.getName());
                        } else {
                            System.out.println("[ ]"+t.getName());
                        }                
                    }
                    break;
                case 3:
                    if (tasks.isEmpty()){
                        System.out.println("No tasks to be completed");
                        break;
                    }
                    for (int i=0;i<tasks.size();i++){
                        System.out.println((i+1)+ "." + tasks.get(i).getName());
                        ;
                    }
                    System.out.println("Enter the task number: ");
                    int taskNumber = sc.nextInt();
                    sc.nextLine();
                    if(taskNumber >= 1 && taskNumber <= tasks.size()){
                        tasks.get(taskNumber -1).setDone();
                        System.out.println("Task marked as done");
                    } else {
                        System.out.println("invalid task number");
                    }
                    break;                
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
             }
         }

    }
}
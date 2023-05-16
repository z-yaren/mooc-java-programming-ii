import java.util.Scanner;

public class UserInterface {
    
    private TodoList todoList;
    private Scanner scan;

    public UserInterface(TodoList todoList, Scanner scan){
        this.todoList = todoList;
        this.scan = scan;
    }

    public void start(){
        while(true){
            System.out.println("Command: ");
            String cmd = scan.nextLine();
            if(cmd.equals("stop")) break;

            if(cmd.equals("add")){
                
                String str = scan.nextLine();
                this.todoList.add(str);

            }else if(cmd.equals("list")){

                this.todoList.print();

            } else if (cmd.equals("remove")){

                System.out.println("Which one is removed?");
                int remove = Integer.valueOf(scan.nextLine());
                this.todoList.remove(remove);
            }
        }
    }
}

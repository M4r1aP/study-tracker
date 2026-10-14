public class Task {
    String name;
    boolean done;

    public Task(String name){
        this.name = name;
        this.done = false;
    }
    public Task(String name, boolean done){
        this.name = name;
        this.done = done;
    }
    //getters + setters for the variables
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public boolean isDone(){
        return this.done;
    }
    public void setDone(){
        done=true;
    }
}

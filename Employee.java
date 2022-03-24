class Solve{
    
    private String id;
    private String name;
    private String department;
    private int age;
    
    public Solve(){        
    }

    //constructor with age argument
    public Solve(String id, String name, String department, int age){
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
    }
 
    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getDepartment() {
        return department;
    }
 
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public String toString(){
 
        return "[" + 
            this.getId() + 
            " : " + 
            this.getName() + 
            " : " + 
            this.getDepartment() + 
            "]";
    }
    
    
}

public class Employee{
    public static void main(String[] args){
        Solve Chig = new Solve("21","Chirag","Automation",24);
        //String name = Chig.getName();
        System.out.println(Chig.toString());
    }
}
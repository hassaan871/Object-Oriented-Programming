//Account class that constains a name as an instance variable
//and methods to get and set its value

public class Account {
    
    private String name; //instance variable
    
    //Setter Method
    public void setName(String name){
        //Parameters are local variables
        this.name = name;
    }

    // Getter Method
    public String getName(){
        return name; //return value of name to caller
    }
}
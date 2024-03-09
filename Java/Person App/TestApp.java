public class TestApp {
    public static void main(String args[]){
        Person p1 = new Person();
        p1.id = 1;
        p1.name = "Dr Nasheeta Adil";
        p1.age = 24;

        Person p2 = new Person();
        p2.id = 2;
        p2.name = "M. Hassaan Adil";
        p2.age = 22;

        printData(p1);
        printData(p2);
    }

    public static void printData(Person p){
        System.out.println("ID: "+p.id);
        System.out.println("Name: "+p.name);
        System.out.println("Age: "+p.age);
    }
}

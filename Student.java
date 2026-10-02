public class Student{
    private int id;
    private String name;
    private double marks;

    //Constructor
    public Student(int id, String name, double marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    //getters
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getMarks(){
        return marks;
    }

    //setters
    public void setName(String name){
        this.name=name;
    }

    public void setMarks(double marks){
        this.marks=marks;
    }

    public void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
        System.out.println("---------------\n");
    }

}
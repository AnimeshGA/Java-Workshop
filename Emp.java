import java.util.Scanner;
class MyClass {
    String add;
    int year;
    String name;
    MyClass(String n,int y,String a){
        name=n;
        year=y;
        add=a;
    }
    
    public static void main(String[] args) {
        MyClass obj=new MyClass("Robert",1994,"64C-WallsStreet");
        obj.print_info();
        MyClass obj1=new MyClass("Sam",2000,"68D-WallsStreet");
        obj1.print_info();
        MyClass obj2=new MyClass("John",1999,"64D-WallsStreet");
        obj2.print_info();
    }
    void print_info(){
        System.out.println(name+" "+year+" "+add+" ");
    }
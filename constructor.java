package SoftwareTesting;

class constructor {
    int age;
    String name;
    int rollno;

    constructor(){
        System.out.println("No argumnt constructor");
    }
    constructor(String n){
        System.out.println("One argument");
        String Name = n;
    }
    void display(){
        System.out.println(age+" "+"Name"+" "+rollno);
    }
    public static void main(String[] args) {
        constructor obj = new constructor();
        obj.age = 20;
        obj.name = "Nikhil";
        obj.rollno = 22;

        obj.display();

        constructor obj2 = new constructor("Hari");
        obj2.display();
    }
}

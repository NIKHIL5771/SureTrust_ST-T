package SoftwareTesting.OOPs;

class student {
    int rollno;
    String name;
    int age;

    public static void main(String[] args) {
        student nikhil = new student();
        nikhil.age=22;
        nikhil.name= "NIKHIL";
        nikhil.rollno=22;

        System.out.println(nikhil.rollno +" "+ nikhil.name +" "+ nikhil.age);

        student mounika = new student();
        mounika.age=24;
        mounika.name= "MOUNIKA";
        mounika.rollno=24;

    }
}

package SoftwareTesting.OOPs;

class student1 {
    String name;
    int rollno;
    int age;

    void insert(int r, String n, int a){
        int rollno = r;
        String name = n;
        int age = a;
    }
        void display(){
            System.out.println(rollno+" "+name+" "+age);
        }
    public static void main(String[] args) {
        
        student1 obj = new student1();
        obj.insert(22, "Nikhil", 23);
        obj.display();
    }
}

package SoftwareTesting;

public class stati {
    int id;
    String name;
    static String college_name = "MIT PUNE";

    void insert(int i, String n, String c){
        id = i;
        name = n;
        college_name = c;

    }
    void display(){
        System.out.println("ID= "+ id +" name= "+ name +" College Name= " + college_name);
    }
    public static void main(String[] args) {
        stati sc = new stati();
        sc.insert(12, "Nikhil", "MIT" );
        sc.display();
    }
}

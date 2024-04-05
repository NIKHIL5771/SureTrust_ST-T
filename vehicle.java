package SoftwareTesting;

class vehical{
    void run(){
        System.out.println("Vehicle is running");
    }
}
class bike extends vehical{
    void run(){
        System.out.println("Bike is running");
    }
}
class vehicle {
    public static void main(String[] args) {
        bike b1 = new bike();
        b1.run();
    }
    
}

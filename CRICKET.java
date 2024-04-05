package SoftwareTesting;

class rcb {
    void bat(){
        System.out.println("Virat is batting");
    }
}
class srh extends rcb {
    void bowl(){
        System.out.println("Pat Cummins is bowling");
    }
}
class umpire extends srh{
    void runout(){
        System.out.println("NOT OUT");
    }
}

public class CRICKET {

    public static void main(String[] args) {
        srh s1 = new srh();
        s1.bowl();
        s1.bat();

        umpire u1 = new umpire();
        u1.runout();
        u1.bowl();
        u1.bat();
    }
}

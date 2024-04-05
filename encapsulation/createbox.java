package SoftwareTesting.encapsulation;

public class createbox {
    public static void main(String[] args) {
        common c = new common();
        int h = c.height = 15;
        int l = c.length = 20;
        int w = c.width = 13;
        c.setdimension(l, w, h);
    }
}

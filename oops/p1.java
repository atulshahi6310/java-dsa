public class p1{
    public static void main(String args[]) {
        Pen p1 = new Pen();         // Capital "P" for class name
        p1.setColor("blue");        // Set the color
        p1.setTip(5);               // Set the tip size
        System.out.println(p1.color); // Print color
        System.out.println(p1.tip);   // Print tip size (optional)
    }
}

class Pen {
    String color;
    int tip;

    public void setColor(String color) {
        this.color = color; // "this" refers to the object's variable
    }

    public void setTip(int tip) {
        this.tip = tip;
    }
}

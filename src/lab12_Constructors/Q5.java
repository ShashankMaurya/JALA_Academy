package lab12_Constructors;

public class Q5 {
    Q5() {
        System.out.println("default constructor evoked");
    }

    public static void main(String[] args) {
        Q5 obj = new Q5();
    }
}
// TODO: a constructor is called when an object is created. So, a constructor can't be called explicitly for the same object.
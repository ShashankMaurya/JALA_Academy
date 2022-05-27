package lab10_Interfaces;

public class Q9 {
    private interface inter11 {
        void fun();
    }
    static class newclass implements inter11{
        @Override
        public void fun() {
            System.out.println("Function called");
        }
        public static void main(String[] args) {
            newclass obj = new newclass();
            obj.fun();
        }
    }
}

package lab9_Abstract_Class;

abstract class Q1 {
    abstract void abstract_fun();
    void not_abstract_fun()
    {
        System.out.println("This function is not abstract.");
    }
}
class subclass01 extends Q1
{
    void abstract_fun()
    {
        System.out.println("This function is abstract.");
    }

    public static void main(String[] args) {
        Q1 obj = new subclass01();  // TODO: storing the reference of child_class in the object of super_class
        obj.not_abstract_fun();

        subclass01 ob=new subclass01();
        ob.abstract_fun();
        ob.not_abstract_fun();
    }
}

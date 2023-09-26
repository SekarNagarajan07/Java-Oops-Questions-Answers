class Parent {
    public void print(){
        System.out.println("This is parent class");
    }
}
class Child extends Parent {
    public void print(){
        System.out.println("This is child class");
    }
}
class Program {
    public static void main(String[] args) {
       Parent p = new Parent();
       p.print();

       Child c = new Child();
       c.print();

        ((Parent) c).print();
    }
}
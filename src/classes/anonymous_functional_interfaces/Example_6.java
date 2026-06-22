package classes.anonymous_functional_interfaces;
/*
* Notes:-
*   anonymous class are created based on the interface and classes.
*   interface is acting like a parent
* Notes - 1:
*   an interface has a single abstract method is known as functional interface.
*
* */
interface Parent {
    void getData();
}

class Child implements Parent{
    public void getData(){
        System.out.println("This child class implementation");
    }
}

public class Example_6 {
    static void main(String[] args) {
        Parent p = new Child();
        p.getData();

        Parent p1 = new Parent() {
            @Override
            public void getData() {
                System.out.println("This is anonymous class Implementation");
            }
        };
        p1.getData();
    }
}

class BaseClass{
    int x = 10;
    BaseClass(){
        System.out.println("Base Class Constructor");
    }
}

class DerivedClass extends BaseClass{
    int x = 20;
    DerivedClass(){
        System.out.println("Derived Class Constructor");
    }

    public void callSuper(){
        System.out.println(super.x); // refers to the base class's x
    }
}

class BaseClass2{
    BaseClass2(int x){
        System.out.println("Base Class Constructor");
    }
}

class DerivedClass2{
    DerivedClass2(){
        //super(10);
        System.out.println("Derived Class Constructor");
    }
}


class Questions{
    public void Q1(){
        DerivedClass derivedClass = new DerivedClass(); // the base class constructor will also be called.

        derivedClass.callSuper();
    }

    public void Q2(){
        DerivedClass2 derivedClass = new DerivedClass2(); // the base class construct will not be called here because the default constructor is not present in the base class.
        // we have to call super and pass value to call the constructor of base class.
    }
}

public class OOPSQuestions{
    public static void main(String[] args){
        Questions questions=new Questions();

        questions.Q2();
    }
}
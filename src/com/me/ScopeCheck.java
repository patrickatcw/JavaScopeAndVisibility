package com.me;
//initial code from JavaScope program
//class
public class ScopeCheck {

    //variables
    public int publicVar = 0;
    private int privateVar = 1;

    //constructor with no params
    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar +
                ": privateVar = " + privateVar);
    }

    //getter just for private var
    public int getPrivateVar() {
        return privateVar;

        //go to main
    }

    //method
    public void timesTwo() {
        int privateVar = 2;
        for (int i = 0; i < 10; i++) {
            /*System.out.println(i + " times two is " +
                    i * privateVar);*/   //*if i wanted to use private int privateVar = 1; this.privateVar

            //back to main
        }

    }

    //step 1 for visibility, method for InnerClass
    public void useInnerClass(){
        //step 2 an instance of InnerClass
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer class: " + innerClass.varThree);

        //step 3 back to main

    }

    //new class, inside class
    public class InnerClass {

        //variable
        public int varThree = 3; //if this was not here, program would find private int privateVar = 1;

        //constructor
        public InnerClass() {
            System.out.println("InnereClass created, privateVar is " + privateVar);
        }

        //method from above, now in Innerclass, comment out sout in method above
        public void timesTwo() {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " times two is " +
                        i * privateVar);

                //back to main to create an instance for Innerclass
            }
        }
    }

}

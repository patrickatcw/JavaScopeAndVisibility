package com.me;


public class Main {

    public static void main(String[] args) {

        String varFour = "this is private to main()";
        ScopeCheck scopeInstance = new ScopeCheck();

        System.out.println("********************");
        //step 3 instance for use inner
        scopeInstance.useInnerClass(); //then run
        System.out.println("********************");

        //step 4 calling another method
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        System.out.println("varThree is not accessible here " + innerClass.varThree);
        System.out.println("************************");  //then run

    }

}

        /*results;
        ScopeCheck created, publicVar = 0: privateVar = 1
        ********************
        InnereClass created, privateVar is 1
        varThree from outer class: 3
        ********************
        InnereClass created, privateVar is 1
        varThree is not accessible here 3
        ************************
        */
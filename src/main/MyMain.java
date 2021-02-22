package main;

import infix.postfix.InfixToPostfix;

public class MyMain {
    public static void main(String[] args){
        String infixString = "A+B-C*D";
        InfixToPostfix convertor = new InfixToPostfix();
        String postfix = convertor.infixToPostfix(infixString);

        System.out.println("postfix = " + postfix);
    }
}

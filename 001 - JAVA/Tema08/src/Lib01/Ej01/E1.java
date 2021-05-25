package Lib01.Ej01;

import java.util.Stack;

public class E1 {

    public static void main(String[] args) {
        
       Stack<String> st = new Stack();
       st.push("Juan");
       st.push("Ana");
       st.push("Luis");

       System.out.println(st.size());

       st.pop();

       System.out.println(st.size());

       System.out.println(st.peek());

       System.out.println(st.size());

       while(!st.isEmpty()){
           System.out.println("Extraigo a " + st.pop());
       }

    }
    
}

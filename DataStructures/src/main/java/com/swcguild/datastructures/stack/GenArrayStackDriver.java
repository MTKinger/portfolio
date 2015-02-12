package com.swcguild.datastructures.stack;

public class GenArrayStackDriver {

    public static void main(String[] args) {
        GenStack<String> st = new GenArrayStack<>();

        st.push("foo");
        String age = "bar";
        st.push(age);

        GenStack<Integer> llLinkedListStack = new GenLinkedListStack<>();

        llLinkedListStack.push(42);
        llLinkedListStack.push(23);
        llLinkedListStack.push(16);
        llLinkedListStack.push(15);
        llLinkedListStack.push(8);
        llLinkedListStack.push(4);

        for (int i = 0; i < 50; i++) {
            llLinkedListStack.push(42);
            llLinkedListStack.push(23);
            llLinkedListStack.push(16);
            llLinkedListStack.push(15);
            llLinkedListStack.push(8);
            llLinkedListStack.push(4);
            System.out.print(llLinkedListStack.pop() + "-");
            System.out.print(llLinkedListStack.pop() + "-");
            System.out.print(llLinkedListStack.pop() + "-");
            System.out.print(llLinkedListStack.pop() + "-");
            System.out.print(llLinkedListStack.pop() + "-");
            System.out.println(llLinkedListStack.pop());
        }

    }

}

public class MainActivity {
    public static void main(String[] args) {

        Stack<String> myStack = new Stack();

        try {
            System.out.print(myStack.size());
            myStack.push("a");
            System.out.print(myStack.size());
            myStack.push("b");
            System.out.print(myStack.size());
            myStack.push("c");
            System.out.print(myStack.size());
            myStack.push("d");
            System.out.print(myStack.size());
            myStack.push("e");
            System.out.print(myStack.size());
            //myStack.push("f"); //Uncomment to test overflow


            System.out.print(myStack.pop());
            System.out.print(myStack.pop());
            System.out.print(myStack.pop());
            System.out.print(myStack.pop());
            System.out.print(myStack.pop());

            //System.out.print(myStack.pop()); //Uncomment to test underflow


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

Question: https://leetcode.com/problems/implement-queue-using-stacks/

Solution:  https://leetcode.com/problems/implement-queue-using-stacks/discuss/1959127/Short-O(1)-amortized-Java


class MyQueue {

    private Stack<Integer> input = new Stack<>();
    private Stack<Integer> output = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        input.push(x);          //TC: O( N )
    }

    public int pop() {

                    // Method 01:
        // if (!output.isEmpty())
        //         output.pop();
        // else{
        //     while (input.isEmpty()){
        //         output.push(input.pop());
        //     }
        //     output.pop();
        // }

                    // Method 02
    //     if (output.isEmpty()){                      //TC: O( N )  ---> Amortized O( 1 )
    //         while (!input.isEmpty()){
    //             output.push(input.pop());
    //         }
    //     }
    //     return  output.pop();

                    // Method 03
        peek();
        return output.pop();

    }

    public int peek() {
         if (output.isEmpty()){                      //TC: O( N )  ---> Amortized O( 1 )
            while (!input.isEmpty()){
                output.push(input.pop());
            }
        }
        return  output.peek();
    }

    public boolean empty() {

        return (input.isEmpty() && output.isEmpty() );

    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

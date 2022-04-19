Question: https://leetcode.com/problems/implement-stack-using-queues/

Solution: https://leetcode.com/problems/implement-stack-using-queues/discuss/1962586/Only-push-is-O(n)-others-are-O(1).-Using-one-queue.

// https://www.youtube.com/watch?v=jDZQKzEtbYQ

class MyStack {

    private Queue<Integer> queue;

    public MyStack() {
        this.queue = new  LinkedList<Integer>();
//Queue is an interface in Java, and the LinkedList class implement Deque which is an interface extend Queue.
    }

    public void push(int x) {

       queue.add(x);
       for(int i=0;i<queue.size()-1;i++)
       {
           queue.add(queue.poll());
       }

    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        //return (queue.size()>0)?false:true;
	return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

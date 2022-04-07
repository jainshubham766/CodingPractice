Question: https://leetcode.com/problems/last-stone-weight/submissions/

Answer: https://leetcode.com/problems/last-stone-weight/discuss/1921769/Java-best-intuitive-solution-oror-Priority-Queue-oror-1ms-99-faster


class Solution {
    public int lastStoneWeight(int[] stones) {

/*
The example below explains the following basic operations of the priority queue.

boolean add(E element): This method inserts the specified element into this priority queue.
public peek(): This method retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
public poll(): This method retrieves and removes the head of this queue, or returns null if this queue is empty.
*/

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones){
            pq.add(stone);
        }

        while (pq.size()>1){
            int y= pq.poll();
            int x= pq.poll();
            if(x!=y)
                pq.add(y-x);
        }


        return pq.isEmpty() ? 0:pq.peek();

    }
}

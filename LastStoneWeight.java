import java.util.PriorityQueue;

class Solution {
    public int lastStoneWeight1(int[] stones) {
        //! NOT WORKED
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < stones.length; ++i) pq.add(stones[i]);
        while(pq.size() > 1){
            // int prevTop = pq.peek();
            // pq.remove();
            // int currTop = pq.peek();
            // pq.remove();
            if(pq.poll() == pq.poll()) continue;
            else pq.add(pq.poll() - pq.poll());
        }
        return (pq.size() == 0) ? 0 : pq.poll() + 2;
    }
    public int lastStoneWeight(int[] A) {
    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)-> b - a);
        for (int a : A) pq.offer(a);
        while (pq.size() > 1) pq.offer(pq.poll() - pq.poll());
        return pq.poll();
    }

}
public class LastStoneWeight {
    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        Solution s = new Solution();
        System.out.println(s.lastStoneWeight(stones));
    }
}

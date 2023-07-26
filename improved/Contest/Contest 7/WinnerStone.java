public class Solution {
    public int solve(int[] A) {
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        int n = A.length;
        if(n==1 ){
            return A[0];
        }
        for(int i=0;i<A.length;i++){
            pq.add(A[i]);
        }
        int result = 0;
        while(pq.size()>1){
            int top1 = pq.remove();
            int top2 = pq.remove();
             result = top1-top2;
            pq.add(result);
        }
        
        return result;
    }
}

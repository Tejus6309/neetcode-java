class Solution {
    public int findKthLargest(int[] nums, int k) {
      Queue<Integer> q = new PriorityQueue<>();

      for(int x : nums){
        q.offer(x);
      }  

      while(q.size() > k){
        q.poll();
      }

      return q.poll();
    }
}
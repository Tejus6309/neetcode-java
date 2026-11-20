class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for(int x : stones){
            q.offer(x);
        }

        while(q.size() > 1){
            int x = q.poll();
            int y = q.poll();

            if(x != y){
                q.offer(x - y);
            }
        }

        if(q.isEmpty()){
            return 0;
        }

        return q.poll();
    }
}
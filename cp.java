class Solution {
    public int[] twoSum(int[] n, int t) {
        
        int m[] = new int[2];
        
        HashMap<Integer,Integer> map = new HashMap<>();
      
        for(int i=0;i<n.length;i++)
        {
            if(map.containsKey(t-n[i]))
            {
                m[0]=map.get(t-n[i]);
                m[1]=i;
                break;
            }
            
            map.put(n[i],i);
        }
        return m;
    }
}

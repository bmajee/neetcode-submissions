class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;

        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            int freq = count.getOrDefault(num, 0);
            count.put(num, freq + 1);
        }

        List<Integer>[] buckets = new List[n + 1];
        for (int i = 0; i <= n; i++) {
            buckets[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            buckets[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int idx = 0;
        for (int freq = n; freq >= 1 && idx < k; freq--) {
            for (int num : buckets[freq]) {
                result[idx++] = num;
                if (idx == k) break;
            }
        }

        return result;
    }
}
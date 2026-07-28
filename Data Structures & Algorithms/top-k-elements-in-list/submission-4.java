class Solution {
    public int[] topKFrequent(int[] nums, int k) {

    // Step 1: Frequency map
    Map<Integer, Integer> freqMap = new HashMap<>();

    for (int num : nums) {
        freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
    }

    // Step 2: Bucket array
    List<Integer>[] bucket = new List[nums.length + 1];

    for (int num : freqMap.keySet()) {
        int freq = freqMap.get(num);

        if (bucket[freq] == null) {
            bucket[freq] = new ArrayList<>();
        }

        bucket[freq].add(num);
    }

    // Step 3: Collect top k
    int[] result = new int[k];
    int index = 0;

    for (int freq = bucket.length - 1; freq >= 1 && index < k; freq--) {

        if (bucket[freq] != null) {

            for (int num : bucket[freq]) {

                result[index++] = num;

                if (index == k) {
                    break;
                }
            }
        }
    }

    return result;
}
    
}

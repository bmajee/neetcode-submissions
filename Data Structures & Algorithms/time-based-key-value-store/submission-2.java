

class TimeMap {

    private Map<String, List<Pair<Integer, String>>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }

        map.get(key).add(new Pair<>(timestamp, value));
    }

    public String get(String key, int timestamp) {

        if (!map.containsKey(key)) {
            return "";
        }

        List<Pair<Integer, String>> list = map.get(key);

        int left = 0;
        int right = list.size() - 1;

        String result = "";

        while (left <= right) {
            int mid = left + (right - left) / 2;

            Pair<Integer, String> p = list.get(mid);

            if (p.getKey() == timestamp){
                return p.getValue();
            }else if (p.getKey() <= timestamp) {
                result = p.getValue(); // valid answer
                left = mid + 1;        // look for a larger timestamp
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
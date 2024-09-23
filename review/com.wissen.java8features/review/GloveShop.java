package review;
import java.util.HashMap;
import java.util.Map;

public class GloveShop {
    public static int getTotalLoss(int N, int[] tags) {
        // Map to store the count of each tag
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count the occurrences of each tag
        for (int tag : tags) {
            countMap.put(tag, countMap.getOrDefault(tag, 0) + 1);
        }

        int totalLoss = 0;

        // Iterate through the count map to calculate loss
        for (int tag : countMap.keySet()) {
            int count = countMap.get(tag);
            totalLoss += count % 2 * tag; // Loss from unsold single gloves
        }

        return totalLoss;
    }

    public static void main(String[] args) {
        int N = 5;
        int[] tags = {10, 20, 15, 20, 20};

        int totalLoss = getTotalLoss(N, tags);
        System.out.println("Total loss: " + totalLoss);
    }
}

package Practice_Questions;
    import java.util.ArrayList;
public class Practice_Question_2 {



    public static ArrayList<Integer> generateBeautifulArray(int n) {
        ArrayList<Integer> nums = new ArrayList<>();

        // Generate a permutation of integers in the range [1, n]
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }

        // Shuffle the ArrayList to get a random permutation
        java.util.Collections.shuffle(nums);

        // Check if the generated permutation satisfies the condition
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = i + 1; k < j; k++) {
                    if (2 * nums.get(k) == nums.get(i) + nums.get(j)) {
                        // If the condition is violated, shuffle again and repeat
                        return generateBeautifulArray(n);
                    }
                }
            }
        }

        // If the condition is satisfied, return the beautiful ArrayList
        return nums;
    }

    public static void main(String[] args) {
        int n = 4;
        ArrayList<Integer> beautifulArray = generateBeautifulArray(n);
        System.out.println(beautifulArray);
    }
}

    


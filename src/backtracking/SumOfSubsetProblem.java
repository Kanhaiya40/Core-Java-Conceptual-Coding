package backtracking;

public class SumOfSubsetProblem {

    static int subset_count = 0;

    static void subset_sum(int[] list, int sum, int starting_index, String subset, int target_sum) {
        if (target_sum == sum) {
            subset_count++;
            System.out.println(subset);
            if (starting_index < list.length)
                subset_sum(list, sum - list[starting_index - 1], starting_index, subset + list[starting_index - 1], target_sum);
        } else {
            for (int i = starting_index; i < list.length; i++) {
                subset_sum(list, sum + list[i], i + 1, subset + list[i], target_sum);
            }
        }
    }

    public static void main(String[] args) {
        int[] list = {1,2,3,4,5};
        subset_sum(list, 0, 0, "", 6);
        System.out.println(subset_count);
    }
}

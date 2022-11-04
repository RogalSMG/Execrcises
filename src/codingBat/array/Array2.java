package codingBat.array;

public class Array2 {
    /**
     * Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index).
     * Return the count of the number of times that the two elements differ by 2 or less, but are not equal.
     */
    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (Math.abs(nums1[i] - nums2[i]) > 0 && (Math.abs(nums1[i] - nums2[i]) <= 2)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}.
     */
    public boolean has77(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        if (nums[nums.length - 2] == 7 && nums[nums.length - 2] == nums[nums.length - 1]) {
            return true;
        }
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 7) {
                if (nums[i + 1] == 7) {
                    return true;
                } else if (nums[i + 2] == 7) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
     */
    public boolean has12(int[] nums) {
//        int index = IntStream.range(0, nums.length)
//                .filter(i -> 1 == nums[i])
//                .findFirst()
//                .orElse(-1);

        //Search index of 1
        int index1 = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                index1 = i;
                break;
            }
        }
        //Check if 1 was founded in array, if not return false
        if (index1 == -1) {
            return false;
        }

        for (int i = index1 + 1; i < nums.length; i++) {
            if (nums[i] == 2) {
                return true;
            }
        }
        return false;
    }

    /**
     * Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
     */
    public boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
                return true;
            } else if (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1) {
                return true;
            }
        }
        return false;
    }


}

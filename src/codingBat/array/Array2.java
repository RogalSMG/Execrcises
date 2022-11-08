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

    /**
     * Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.
     */
    public boolean haveThree(int[] nums) {
        int count = 0;
        int count3 = 0;
        if (nums.length < 5) {
            return false;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 && nums[i] == 3) {
                count3++;
                if (nums[i + 1] != 3) {
                    count++;
                    continue;
                }
            }

            if (i == nums.length - 1 && nums[nums.length - 1] == 3) {
                count3++;
                if (nums[i] == 3 && nums[i - 1] != 3) {
                    count++;
                }
                break;
            }

            if (nums[i] == 3) {
                count3++;
                if (nums[i + 1] != 3 && nums[i - 1] != 3) {
                    count++;
                }
            }
        }
        return count == 3 && count3 == 3;
    }

    /**
     * Given an array of ints, return true if every 2 that appears in the array is next to another 2.
     */ // TODO: 08/11/2022
    public boolean twoTwo(int[] nums) {
        boolean previous = nums[0] == 2;
        boolean last = nums[nums.length - 1] == 2;

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == 2 && previous) {
                continue;
            }

            if (nums[i] != 2 && previous) {
                previous = false;
                continue;
            }

            if (nums[i] == 2 && !previous && nums[i + 1] != 2) {
                previous = true;
            }

        }
        return true;
    }

    /**
     * Return true if the group of N numbers at the start and end of the array are the same. For example, with {5, 6, 45, 99, 13, 5, 6},
     * the ends are the same for n=0 and n=2, and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.
     */
    public boolean sameEnds(int[] nums, int len) {
        if (len == 0) {
            return true;
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[nums.length - len + i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.
     */
    public boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] - nums[i + 1] == -1 && nums[i + 1] - nums[i + 2] == -1) {
                return true;
            }
        }
        return false;
    }
}

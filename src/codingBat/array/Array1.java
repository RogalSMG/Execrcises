package codingBat.array;

import java.util.Arrays;

public class Array1 {
    /**
     * Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
     */
    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    /**
     * Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
     */
    public boolean sameFirstLast(int[] nums) {

        if (nums.length > 0) {
            return nums[0] == nums[nums.length - 1];
        } else return false;
    }

    /**
     * Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
     */
    public int[] makePi() {
        return new int[]{3, 1, 4};

//        int[] ints = new int[]{3,1,4};
//        return ints;
    }

    /**
     * Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
     */
    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    /**
     * Given an array of ints length 3, return the sum of all the elements.
     */
    public int sum3(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    /**
     * Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
     */
    public int[] rotateLeft3(int[] nums) {
        int first = nums[0];
        System.arraycopy(nums, 1, nums, 0, nums.length - 1);
        nums[nums.length - 1] = first;
        return nums;
    }

    /**
     * Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
     */
    public int[] reverse3(int[] nums) {
        int[] out = new int[nums.length];

        int count = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            out[count] = nums[i];
            count++;
        }
        return out;
    }

    /**
     * Given an array of ints length 3, figure out which is larger, the first or last element in the array,
     * and set all the other elements to be that value. Return the changed array.
     */
    public int[] maxEnd3(int[] nums) {
        int largest = nums[0];
        if (largest < nums[nums.length - 1]) {
            largest = nums[nums.length - 1];
        }
        Arrays.fill(nums, largest);
        return nums;
    }

    /**
     * Given an array of ints, return the sum of the first 2 elements in the array.
     * If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
     */
    public int sum2(int[] nums) {
        if (nums.length <= 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else return nums[0] + nums[1];
    }

    /**
     * Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
     */
    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[a.length / 2], b[b.length / 2]};
    }

    /**
     * Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.
     */
    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    /**
     * Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.
     */
    public int[] midThree(int[] nums) {
        int[] out = new int[3];
        int count = 0;
        for (int i = nums.length / 2 - 1; i < nums.length / 2 + 2; i++) {
            out[count] = nums[i];
            count++;
        }
        return out;
    }

    /**
     * Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be at least 1.
     */
    public int maxTriple(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int a = nums[0];
        int b = nums[nums.length / 2];
        int c = nums[nums.length - 1];

        int largest = a;
        if (largest < b) {
            largest = b;
        }
        if (largest < c) {
            largest = c;
        }
        return largest;
    }

    /**
     * Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.
     */
    public int[] frontPiece(int[] nums) {
        if (nums.length <= 2) {
            return nums;
        }
        int[] ints = new int[2];
        ints[0] = nums[0];
        ints[1] = nums[1];
        return ints;
    }

    /**
     * Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b.
     * The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.
     */
    public int[] make2(int[] a, int[] b) {
        if (a.length == 2) {
            return a;
        } else if (a.length > 2) {
            return new int[]{a[0], a[1]};
        }
        if (a.length == 0) {
            return new int[]{b[0], b[1]};
        }
        return new int[]{a[0], b[0]};
    }

    /**
     * Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.
     */
    public int[] front11(int[] a, int[] b) {
        int lenghtA = a.length;
        int lenghtB = b.length;
        if (lenghtA == 0 && lenghtB == 0) {
            return new int[]{};
        } else if (lenghtA > 0 && lenghtB == 0) {
            return new int[]{a[0]};
        } else if (lenghtA == 0 && lenghtB > 0) {
            return new int[]{b[0]};
        } else return new int[]{a[0], b[0]};
    }
}

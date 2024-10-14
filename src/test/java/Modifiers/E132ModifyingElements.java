package Modifiers;

public class E132ModifyingElements {
    public static double[][] reduce10(double[][] nums) {
        double[][] result = new double[nums.length][nums[0].length]; // initialize return array
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                result[i][j] = nums[i][j] - 10;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        double[][] array = {{8,5,9,6},
                {5,4,7,3},{4,6,2,7}};
         double[][] result = reduce10(array);
        // print new array
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}

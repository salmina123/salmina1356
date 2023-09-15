public class Main {
    public static void main(String[] args) {
        double[] fractionalNums = {2.1, 55.6, 8.1, -4.1, 7.8, 6.1, -84.9, 4.5, 3.2, -72.7, 9.5, -3.1, 5.9, -9.9, 32.3 };
        double average = 0.0;
        int count = 0;
        //
        //
        for (int a1=0; a1 < fractionalNums.length; a1++) {
            if (fractionalNums[a1] < 0) {
                for (int a2=a1+1; a2 < fractionalNums.length; a2++) {
                    if (fractionalNums[a2] > 0){
                        average = average + fractionalNums[a2];
                        //average += fractionalNums[a2];
                        count++;
                    }
                }
                break;
            }
            System.out.println ("average" + average);
            System.out.println("count"+ count);
            System.out.println("average/count"+ average/count);

        }
    }
}

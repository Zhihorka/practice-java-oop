public class practiceBlock5Task5 {

    public static int longestRun(int[] arr){
        int longest = 1;
        int cur = 1;
        short flag = 0;
        for (int i = 1; i < arr.length; i++){
            int prev = arr[i - 1];
            if (prev + 1 == arr[i] && flag == 0)
                flag = 1;
            else if (prev - 1 == arr[i] && flag ==0)
                flag = -1;
            else if ((prev + 1 != arr[i] && prev - 1 != arr[i])){
                flag = 0;
                if (cur > longest)
                    longest = cur;
                cur = 1;
                continue;
            }
            if (prev + flag == arr[i]) {
                cur++;
            }
        }
        if (cur > longest)
            longest = cur;
        return longest;
    }

    public static void main(String[] args) {
        int [][] longArr= {{1,2,3,5,6,7,8,9}, {1,2,3,10,11,15}, {5,4,2,1}, {3,5,7,10,15}};
        System.out.println(longestRun(longArr[0]));
        System.out.println(longestRun(longArr[1]));
        System.out.println(longestRun(longArr[2]));
        System.out.println(longestRun(longArr[3]));
    }
}

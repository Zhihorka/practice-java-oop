public class practiceBlock5Task8 {

    public static int maxPossible(int inp, int rep){
        int len = Integer.toString(inp).length();
        int max = -1, maxIndex = 0;
        int[] arr = new int[len];
        for (int i = len - 1; i >= 0; i--){
            arr[i] = inp % 10;
            inp = inp / 10;
        }
        int lenRep = Integer.toString(rep).length();
        int[] arrRep = new int[lenRep];
        for (int i = 0 ; i < lenRep; i++){
            arrRep[i] = rep % 10;
            rep = rep / 10;
            if (max < arrRep[i]){
                max = arrRep[i];
                maxIndex = i;
            }
        }
        boolean stop = false;
        while (!stop){
            for (int i = 0 ; i < len; i++) {
                if (arr[i] < max){
                    arr[i] = max;
                    max = -1;
                    arrRep[maxIndex] = -1;
                    stop = false;
                    break;
                }
                stop = true;
            }
            for (int i = 0 ; i < lenRep; i++){
                if (max < arrRep[i]){
                    max = arrRep[i];
                    maxIndex = i;
                }
            }
        }
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < len; i++) {
            out.append(arr[i]);
        }
        return Integer.parseInt(out.toString());
    }


    public static void main(String[] args) {
        System.out.println(maxPossible(9328, 456) );
        System.out.println(maxPossible(523, 76) );
        System.out.println(maxPossible(9132, 5564) );
        System.out.println(maxPossible(8732, 91255) );
    }
}

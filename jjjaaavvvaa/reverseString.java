public class reverseString {
    public static void main(String[] args) {
        String str = "hello";
        StringBuilder sb = new StringBuilder(str);
//        for (int i=str.length()-1;i>=0;i--) {
//            sb.append(str.charAt(i));
//        }

        sb.reverse();

        System.out.println(sb.toString());
    }
}


//class largestEle {
//    public static void main(String[] args) {
//        int[][] mat = {{1,2,3},{89,98,65},{45,56,23}};
//        int max = mat[0][0];
//
//        for(int i=0; i< mat.length; i++) {
//            for(int j=0;j<mat.length;j++) {
//                if (mat[i][j] > max) {
//                    max = mat[i][j];
//                }
//            }
//        }
//        System.out.println(max);
//
//    }
//}

//class Factorial {
//    public static void main(String[] args) {
//        int num = 8;
//        System.out.println(fact(num));
//    }
//
//    public static int fact(int num) {
//        if(num == 0) {
//            return 1;
//        }
//        return num * fact(num-1);
//    }
//}
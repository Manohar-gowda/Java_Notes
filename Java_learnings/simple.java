import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return  t;
    }
}

public class simple {
    public static void main(String[] args) {
//        Box<Integer> integerBox = new Box<>();
//        integerBox.set(9);
//        System.out.println(integerBox.get());
//
//        Box<String> strBox = new Box<>();
//        strBox.set("Hello");
//        System.out.println(strBox.get());

//        ------------------------------------------------------------------------------------

//        int[][] Marr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        MatrixSpiral.printSpiral(Marr);

//        ------------------------------------------------------------------------------------

         ListofList.print();

    }
}

class MatrixSpiral {
    public static void printSpiral(int[][] Marr) {
        int top = 0;
        int bottom = Marr.length-1;
        int left = 0;
        int right = Marr.length-1;

        int dir = 0;
        while(top <= bottom && left <= right) {
            if(dir == 0) {
                for (int i=left;i<=right;i++) {
                    System.out.println(Marr[top][i]);
                } top++;
                dir = 1;
            }
            else if(dir == 1) {
                for(int i=top;i<=bottom;i++) {
                    System.out.println(Marr[i][right]);
                } right--;
                dir = 2;
            }
            else if(dir == 2) {
                for(int i=right;i>=left;i--) {
                    System.out.println(Marr[bottom][i]);
                } bottom--;
                dir = 3;
            }
            else if(dir == 3) {
                for(int i=bottom;i>=top;i--) {
                    System.out.println(Marr[i][left]);
                }left++;
                dir = 0;
            }

        }
    }
}


class ListofList {

    public static void print() {
        List<List<Integer>> li = new ArrayList<>();
        li.add(new ArrayList<>(Arrays.asList(1,2,3)));
        li.add(new ArrayList<>(Arrays.asList(4,5,6)));
        li.add(new ArrayList<>(Arrays.asList(7,8,9)));
        System.out.println(li);
    }

}
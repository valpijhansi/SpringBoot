// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.List;

class nonNegativeArray {

    public static List<Integer> processList(List<Integer> arr){
        List<Integer> res = new ArrayList<>();
        for(int num:arr){
            if(num>=0)
                res.add(num);
            else
                 res.add(num*num);
        }
        return res;
    }
    public static void main(String args[]){
        List<Integer>list = new ArrayList<>();
        list.add(-2);
        list.add(3);
        list.add(4);

        System.out.println(processList(list));
    }
}

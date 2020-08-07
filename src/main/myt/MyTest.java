import java.util.*;

public class MyTest {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<Integer>(1000000);
        for(int i=0;i<1000000;i++)
            set.add(i);
        System.out.println(getRandom(set));
}

    public static List<Integer> getRandom(Set<Integer> params){
        if (params.size()<500000){
            System.out.println("参数个数小于50万"); }
        Random random = new Random();
        int i = random.nextInt(400000);
        ArrayList<Integer> integers = new ArrayList<Integer>(params);
        List<Integer> subList = integers.subList(i, i + 100000);
        return subList;
    }
}

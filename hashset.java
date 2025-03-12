import java.util.*;
//(sort)ordered,unique elements
/*class hashset{
    public static void main(String[] args){
        Set<Integer>set1=new HashSet<>();
        for(int i=0;i<9;i++){
            set1.add(i);
        }
        System.out.print(set1);
    }
}*/

class hashset{
    public static void main(String[] args){
        int[] arr={4,1,1,2,22,3};
        Set<Integer>set1=new LinkedHashSet<>();
        for(int ele:arr){
            set1.add(ele);
        }
        System.out.print(set1);
    }
}

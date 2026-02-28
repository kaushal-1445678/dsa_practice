package countFreq;
import java.util.*;
public class countFreq {
    public static void main(String[] args) {
        int[] a={10,15,15,10,20,20,20,20,10,10,20};
        freq(a);
    }
    public static void freq(int[] a){
        int n=a.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
    }

}

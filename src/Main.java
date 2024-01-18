import java.util.*;


public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 66, 77, 33, 8, 2, 7));
        changeList(nums);
        Set<Integer> nums2 = new HashSet<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 66, 77, 33, 8, 2, 7));
        System.out.println();
        System.out.println(nums2);

        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три", "gg", "gg"));
        stringOfList(strings);

    }
    public static void changeList(List<Integer> list){
        for(int i = 0;i<list.size();i++){
            if(list.get(i)%2!=0){
                System.out.print(list.get(i)+",");

            }

        }
        System.out.println();

    }
    public  static  void stringOfList(List<String> list){
        Set<String> set=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        int i=0;
        for(String str:list){
            i=0;
            for (String str2:list){
                if(str==str2){
                    set.add(str);
                }
                if(str.equals(str2)){
                    i++;
                }
            }
            System.out.println(i);

        }
        System.out.println(set);
    }
}
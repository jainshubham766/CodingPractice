import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[]args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        list1.add(4);
        list1.add(9);
        list1.add(89);
        System.out.println(list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        System.out.println(list2);
//        if (list1.size()==0 && list2.size()==0)return list1;
//        if (list1.size()==0 ) return list2;
//        if (list2.size()==0 ) return list1;
        List<Integer> ls = new ArrayList<>();
        int i=0,j=0;

        while (i<list1.size()   &&  j<list2.size()){
            if (list1.get(i)==list2.get(j)){
                ls.add(list1.get(i));
                ls.add(list2.get(j));
                i++;j++;
            } else if (list1.get(i)<list2.get(j)){
                ls.add(list1.get(i));
                i++;
            }  else if (list1.get(i)>list2.get(j)){
                ls.add(list2.get(j));
                j++;
            }
        }

        while(i<list1.size()){
            ls.add(list1.get(i));
            i++;
        }

        while(j<list2.size()){
            ls.add(list2.get(j));
            j++;
        }
        System.out.println(ls);
    }
}

Question: https://leetcode.com/problems/baseball-game/
Solution: https://leetcode.com/problems/baseball-game/discuss/1931511/Simple-JAVA-100-faster-List-O(n)-Single-Pass

class Solution {
    public int calPoints(String[] ops) {


        if (ops.length == 1)    return Integer.valueOf(ops[0]);

        int total=0;
        List<Integer> score = new ArrayList<>();

        for (String op : ops){

            switch (op){
                case "C":  total-=score.remove(score.size()-1); // Calculating TOTAL Hand to hand
                        break;
                case "D":
                    int d= score.get(score.size()-1)*2;
                    score.add(d);
                    total+=d;// Calculating TOTAL Hand to hand

                        break;

                case "+": int sum = score.get(score.size()-1) +  score.get(score.size()-2);
                    score.add(sum);
                    total+=sum;// Calculating TOTAL Hand to hand
                    break;

                default: score.add(Integer.valueOf(op));
                    total += Integer.valueOf(op);       // Calculating TOTAL Hand to hand
            }

        }

        // NO NEED as we are doing in single iteration
//         for (Integer i : score){
//             total += i;
//         }

        return total;
    }
}

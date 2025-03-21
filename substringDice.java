
import java.util.ArrayList;

public class substringDice{
    static ArrayList<Integer> solution(int p,int up){
        if(up ==0){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<Integer> update = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 6&&i<=up ; i++) {
            
            if(p+i <= up){
                update.add(i);
                solution(i+p, up-i);
            }

        }
        list.addAll(update);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(solution(0, 5));
    }
}
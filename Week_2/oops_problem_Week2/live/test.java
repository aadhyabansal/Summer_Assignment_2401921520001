package Week_2.oops_problem_Week2.live;

import Week_2.oops_problem_Week2.music.Playable;
import Week_2.oops_problem_Week2.music.string.Veena;
import Week_2.oops_problem_Week2.music.wind.Saxophone;

public class test {
    public static void main(String[] args){
        Veena v=new Veena();
        v.play();
        Saxophone s=new Saxophone();
        s.play();
        Playable p1=v;
        Playable p2=s;
        p1.play();
        p2.play();   
    }
}

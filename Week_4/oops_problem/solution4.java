class box{
    int len,br;
    public box(int a, int b){
        this.len=a;
        this.br=b;
    }
    int area(){
        return len*br;
    }
}

class box3d extends box{
    int height;
    public box3d(int a, int b, int c){
        super(a,b);
        this.height=c;
    }
    int volume(){
        return len*br*height;
    }
}

public class solution4 {
    public static void main(String[] args) {
        box b1=new box(2,3);
        System.out.println(b1.area());

        box3d b2=new box3d(2,3,2);
        System.out.println(b2.volume());
    }
}

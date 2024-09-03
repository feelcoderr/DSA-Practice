public class LCM {
    public static int HCF(int x, int y){
        while(x!=y){
            if(x>y)
            x=x-y;
            else
            y=y-x;
        }
        return x;
    }
    public static int LCM(int x, int y){
        int lcm=(x*y)/HCF(x,y);
        return lcm;
    }
    public static void main(String args[]){
        int x=3, y=4;
        System.out.println(LCM(x,y));
    }
}

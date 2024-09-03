public class HCF{
    static int hcf(int x, int y){
        int maxFactor=1;
        for(int i=2; i<Math.min(x,y); i++){
            if(x%i==0 && y%i==0){
                maxFactor=i;
            }
        }
        return maxFactor;
    }
    public static void main(String args[]){
        int x=36, y=60;
        System.out.println(hcf(x, y));
    }
}
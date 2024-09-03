public class Permutation {
    public static void main(String args[]){
        int student=5;
        int seats=9;

        //Find number of permutation of students and seats
        //nPr=n!/(n-r)!
        int fact1=1;
        for(int i=student; i>1; i--){
            fact1=fact1*i;
        }

        int fact2= 1;
        for(int i=student-seats; i>1; i--){
            fact2=fact2*i;
        }
        
        int permutation=fact1/fact2;
        System.out.println(permutation);
    }
}

public class TypeConversion {
    //Binary to decimal
    public static int binToDec(int binary){
        int ld;
        int n=0;
        int decimal=0;
        while(binary>0){
            ld=binary%10;
            binary=binary/10;
            decimal+=ld*Math.pow(2,n);
            n++;
        }
        return decimal;
    }
    //Octal to decimal
    public static int octToDec(int octal){
        int ld;
        int n=0;
        int decimal=0;
        while(octal>0){
            ld=octal%10;
            octal=octal/10;
            decimal+=ld*Math.pow(8,n);
            n++;
        }
        return decimal;
    }
    //Hexadecimal to decimal
    public static int hexToDec(String num){
        num=num.toUpperCase();
        String hex="0123456789ABCDEF";
        int value;
        int dec=0;
        for(int i=0; i<num.length(); i++){
            value=hex.indexOf(num.charAt(i));
            dec=dec*16+value;
        }
        return dec;
    }
    //Decimal to binary
    public static int[] decToBin(int dec){
        int bin[]= new int[20];
        int idx=0;
        while(dec>0){
            bin[idx++]=dec%2;
            dec/=2;
        }
        return bin;
    }
    //Decimal to Octal
    public static int[] decToOct(int dec){
        int oct[]=new int[20];
        int idx=0;
        while(dec>0){
            oct[idx++]=dec%8;
            dec/=8;
        }
        return oct;
    }
    //
    public static void main(String args[]){
        int binary=101;
        System.out.println(binToDec(binary));

        int octal=2001;
        System.out.println(octToDec(octal));
    }
}

import java.util.*;
enum NumberToWord{
    ONE(1, "ONE"), TWO(2, "TWO"), THREE(3, "THREE"), FOUR(4, "FOUR"), FIVE(5, "FIVE"), SIX(6, "SIX"), SEVEN(7, "SEVEN"), EIGHT(8, "EIGHT"), NINE(9, "NINE"),
    TEN(10, "TEN"), ELEVEN(11, "ELEVEN"), TWELVE(12, "TWELVE"), THIRTEEN(13, "THIRTEEN"), FOURTEEN(14, "FOURTEEN"), FIFTEEN(15, "FIFTEEN"), SIXTEEN(16, "SIXTEEN"),
    SEVENTEEN(17, "SEVENTEEN"), EIGHTEEN(18, "EIGHTEEN"), NINETEEN(19, "NINETEEN"), TWENTY(20, "TWENTY"), THIRTY(30, "THIRTY"), FORTY(40, "FORTY"), 
    FIFTY(50, "FIFTY"), SIXTY(60, "SIXTY"), SEVENTY(70, "SEVENTY"), EIGHTY(80, "EIGHTY"), NINETY(90, "NINETY"), HUNDRED(100, "HUNDRED"), THOUSAND(1000, "THOUSAND");

    private final int value;
    private final String word;

    NumberToWord(int value,String word){
        this.value = value;
        this.word = word;
    }

    public static String getWord(int number){
        for(NumberToWord nw : NumberToWord.values()){
            if(nw.value == number){
                return nw.word;
            }
        }
        return "";
    }

    public static String convert(int number){
        if(number ==0) return "ZERO";
        if(number>=1000) return convert(number/1000)+" THOUSAND"+(number%1000!=0 ?" "+convert(number%1000):"");
        if(number>=100) return convert(number/100)+" HUNDRED"+(number%100!=0 ?" "+convert(number%100):"");
        if(number>=20) return getWord((number/10)*10)+(number%10!=0 ?" "+convert(number%10):"");
        return getWord(number);
    }


}

public class Eenum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        System.out.println(NumberToWord.convert(num).trim());
    }
}
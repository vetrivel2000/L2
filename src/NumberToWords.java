import java.util.Scanner;
public class NumberToWords {
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        String ones[]={"ten","one","two","three","four","five","six","seven","eight","nine"};
        String twos[]={"twenty","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String tens[]={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        int number=scan.nextInt();
        int count=0;
        if(number==0)
        {
            System.out.println("zero");
        }
        else if(number<=10)
        {
            System.out.println(ones[number%10]);
        }
        else if(number>=11 && number<=20)
        {
            System.out.println(twos[number%10]);
        }
        else if(number>20&&number<1000)
        {
            int temp=number;
            while (temp!=0)
            {
                count++;
                temp=temp/10;
            }
            if(count==2)
            {
                System.out.print(tens[number/10]+" ");
                System.out.print(ones[number%10]);
            }
            if(count==3)
            {
                System.out.print(ones[number/100]+" hundred ");
                number=number-((number/100)*100);
                if(number==0)
                {
                    System.exit(0);
                }
                else if(number>=11&&number<=20)
                {
                    System.out.print("and ");
                    System.out.println(twos[number%10]);
                }
                else if (number%10==0 && number>10)
                {
                    System.out.print("and ");
                    System.out.print(tens[number/10]+" ");
                }
                else
                {
                    System.out.print("and ");
                    System.out.print(tens[number/10]+" ");
                    System.out.print(ones[number%10]);
                }
            }
        }
    }
}
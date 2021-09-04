public class SubstringMatching {
    public static void main(String[] args){
        String string1="testing123";
        String string2="1234";
        int index=0;
        int count=0;
        int flag=0;
        int length1=string1.length();
        int length2=string2.length();
        for(int i=0;i<=length1-length2;i++)
        {
            char letter1=string1.charAt(i);
            char letter2=string2.charAt(0);
            if(letter1==letter2)
            {
                for (int j = i,k=0; j<i+length2 ; j++,k++) {
                    letter1=string1.charAt(j);
                    letter2=string2.charAt(k);
                    if(letter1==letter2) {
                        index = j;
                        count++;
                        flag=1;
                    }
                    else
                    {
                        flag=0;
                    }
                }
            }
            if(flag==1)
                break;
            else
                count=0;
        }
        if(count==length2)
            System.out.println(index-(length2-1));
        else
            System.out.println("-1");
    }
}

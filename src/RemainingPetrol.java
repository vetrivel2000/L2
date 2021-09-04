
public class RemainingPetrol {
    public static void main(String[] args)
    {
        int remainingPetrol=2;
        char[] petrolBunks={'A','B','C'};
        int[] bunkDistances={1,7,3};
        int[] bunkCapacity={6,4,2};
        int flag=1;
        for(int i=0;i<petrolBunks.length;i++)
        {
            remainingPetrol=remainingPetrol-bunkDistances[i];
            if(remainingPetrol<0)
            {
                flag=0;
            }
            else {
                flag=1;
                remainingPetrol+=bunkCapacity[i];
            }
        }
        if(flag==1)
        {
            System.out.println(remainingPetrol+" litres of Petrol remaining");
        }
        else {
            System.out.println("Running out Of Petrol");
        }
    }
}

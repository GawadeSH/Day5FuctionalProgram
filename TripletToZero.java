public class TripletToZero
{
    public static void main(String[] arg) {
        int arr[]={1,-2,1,4,5,-9,2,7,4};
        int n=arr.length;
        Triplet(arr,n);

    }

    static void Triplet(int arr[],int n)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                for (int k = j + 1; k < n; k++)
                {
                    if (arr[i] + arr[j] + arr[k] == 0)
                    {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }
    }
}

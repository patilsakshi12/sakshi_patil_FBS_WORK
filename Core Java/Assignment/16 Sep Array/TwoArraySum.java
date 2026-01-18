
class SumArray{
  public static void main(String args[])
  {
    int arr[]={1,2,3,4,5};
    int brr[]={10,20,30,40,50};
    int crr[]=new int[5];
    int i;
    for(i=0;i<arr.length;i++)
  {
    crr[i]=arr[i]+brr[i];
  }
  System.out.println("Result of array(crr):");
   for(i=0;i<crr.length;i++)
  {
    System.out.print(crr[i]+" ");
}
}
}


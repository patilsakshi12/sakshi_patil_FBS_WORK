class Perfect
{
  public static void main(String args[])
  {
   int num=6;
		int i=1,sum=0;
		while(i<num)
		{
			if(num % i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		if(sum==num)
			System.out.println("Perfect number");
		else
			System.out.println("Not Perfect number");
			
	}

}

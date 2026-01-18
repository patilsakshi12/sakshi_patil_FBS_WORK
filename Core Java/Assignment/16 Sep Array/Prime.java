import java.util.Scanner;

class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Prime numbers in the array:");
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            if (n <= 1)
                continue;

            int flag=0;

            for (int j = 2; j <n; j++) { 
                if (n % j == 0) {
                    flag=1;
                    break;
                }
            }

            if (flag==0) {
                System.out.println(n + " is Prime");
            }
        }
    }
}

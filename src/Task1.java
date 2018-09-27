
import java.util.Scanner;

public class Task1 {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int arr[] = new int[n];
int sum = 0;
for(int i = 0; i < arr.length; i++) {
arr[i] = in.nextInt();
sum += arr[i];
}
double avg1= sum/n;
int avg = (int) Math.round(avg1);
System.out.println(avg);
}

}
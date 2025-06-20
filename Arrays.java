// sum of elements in an array
/*class Arrays
{
public static void main(String[] args)
{
int a[]={1,2,3,4,5};
int sum=0;
for(int b:a)
{
 sum=sum+b;
}
System.out.println(sum);
}
}


//avg of array elements
class Arrays
{
public static void main(String[] args)
{
int a[]={1,2,3,4,5};
int sum=0;
float avg=0;
for(int b:a)
{
 sum+=b;
avg=sum/2;
}
System.out.println(sum);
System.out.println(avg);
}
}

//index of an paticular element
class Arrays
{
public static void main(String[] args)
{
int a[]={1,2,3,4,5};
 int target=4;
for(int i=0;i<a.length;i++)
{
if(a[i]==target)
{
System.out.println(i);
}
}
}
}


// array conatins specific element or  not
class Arrays
{
public static void main(String[] args)
{
int a[]={1,2,3,4,5};
 int target=4;
int count=0;
for(int i=0;i<a.length;i++)
{
if(a[i]==target)
{
count++;
}

}
if(count==1)
{
System.out.println("element found at position");
}
else
{
System.out.println("element is not found");
}
}
}

//remove of an element
class Arrays
{
public static void main(String[] args)
{
int a[]={1,2,3,4,5};
int target=3;
int b[]=new int[(a.length)-1];
int j= 0;
for(int i=0;i<a.length;i++)
{
if(a[i]!=target)
{
b[j]=a[i];
j++;
}
}
for( int i=0;i<b.length;i++)
{
System.out.println(b[i]+" ");
}
}
}*/

//copy of one array into another array
class Arrays
{
public  static void main(String[] args)
{
int a[]={1,2,5,6,7};
int b[]=new int[(a.length)-1];
for(int i=0; i<b.length; i++)
{
b[i]=a[i];
System.out.print(a[i]+" ");
System.out.println(" ");
}
for(int i=0; i<b.length; i++)
{
System.out.print(b[i]+" ");
}
}
}



import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Old array
        int[] oldArray = {1, 2, 3, 4};
        System.out.println("Old Array:");
        for (int i = 0; i < oldArray.length; i++) {
            System.out.print(oldArray[i] + " ");
        }

        // Ask user for new number
        System.out.print("\nEnter number to add: ");
        int newNumber = sc.nextInt();

        // New array size is old size + 1
        int[] newArray = new int[oldArray.length + 1];

        // Copy old array into new array
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }

        // Add new number at the end
        newArray[newArray.length - 1] = newNumber;

        // Show new array
        System.out.println("New Array:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

        sc.close();
    }
}


public class MinMaxArray {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {10, 5, 25, 8, 15};

        // Assume first element is min and max
        int min = numbers[0];
        int max = numbers[0];

        // Go through the array one by one
        for (int i = 1; i < numbers.length; i++) {
            // Check for smaller value
            if (numbers[i] < min) {
                min = numbers[i];
            }

            // Check for larger value
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Show the result
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}


public class ReverseArray {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Original Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Reverse logic
        System.out.println("\nReversed Array:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}



public class CommonElements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        System.out.println("Common elements:");

        // Check each element of array1
        for (int i = 0; i < array1.length; i++) {
            // Compare with each element of array2
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                    break; // To avoid printing duplicates
                }
            }
        }
    }
}

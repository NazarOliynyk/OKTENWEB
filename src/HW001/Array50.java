package HW001;

public class Array50 {
    public static void main(String[] args) {

        int [] arr50odd = new int[50];
        int [] arr50even = new int[50];

        System.out.println("The array of even numbers");
        for (int i= 0; i<arr50even.length; i++){
            arr50even[i]=i*2;
            System.out.println(arr50even[i]);
        }

        System.out.println("The array of odd numbers backward");

        int x=arr50odd.length-1;
        int y=99;

        while (x>=0)
        {
            arr50odd[x]=y;
            System.out.println(arr50odd[x]);
            x--;
            y=y-2;
            //System.out.println(arr50even[x]); // do not write in after x--; !!!
        }

        System.out.println ("sdvbsjkvbjkdfbvkjn nsdfvjnfjkvn sdvfkv  \n sdkvnvnkvn dnfvinro vfgnorgvn");

    }
}

package HW001;

public class RunThroughArray {
    // int [] arr10 = new int []{2,17,13,6,22,31,45,66,100,-18};
    public static void main(String[] args) {

        //int[] arrNew = {2,17,13,6,22,31,45,66,100,-18}; // it works also

        int [] arr10 = new int []{2,17,13,6,22,31,45,66,100,-18};
        int i=0;
        System.out.println("The odd iterations while");
        while (i<arr10.length){

//            System.out.print("The odd iterations");
            if (i%2!=0){
                System.out.println(arr10[i]);
                //i++;
            }i++;
        }
        System.out.println("The odd iterations for");
        for (int j = 0; j < arr10.length; j++) {
            if(j%2!=0)
            {
                System.out.println(arr10[j]);

            }
        }
        System.out.println("The odd array members while");
        int y=0;
        while (y<arr10.length){

//            System.out.print("The odd iterations");
            if (arr10[y]%2!=0){
                System.out.println(arr10[y]);
                //i++;
            }y++;
        }
        System.out.println("The odd array members for");
        for (int j = 0; j < arr10.length; j++) {
            if(arr10[j]%2!=0)
            {
                System.out.println(arr10[j]);

            }
        }
        System.out.println("The odd array members for backward direction");

        for (int j = arr10.length-1; j >=0; j--) {
            if(arr10[j]%2!=0)
            {
                System.out.println(arr10[j]);

            }

        }
        System.out.println("The odd array members while backward direction");
        int k=arr10.length-1;
        while (k>=0)
        {
            System.out.println(arr10[k]);
            k--;
        }
    }

}

package LibraryCreation;


public class TryIncrease {

    public static Book [][] increaseArray(Book[][] book, int increase){

        int[] lengthOfSubarrays = new int[book.length];

        for (int i = 0; i < book.length; i++) {
            for (int j = 0; j < book[i].length; j++) {
                lengthOfSubarrays[i]=book[i].length;

            }

        }
// System.out.println("lengthOfSubarrays= "+lengthOfSubarrays[0]);


        Book increasedArray [][] = new Book[book.length][];

        for (int i = 0; i < increasedArray.length; i++) {

            increasedArray[i] = new Book[lengthOfSubarrays[i]+increase];
        }

        for (int i = 0; i < book.length; i++) {
            for (int j = 0; j < book[i].length; j++) {
                increasedArray[i][j] = book[i][j];
//  System.out.println("length of increased subarays= "+increasedArray[i].length);
            }

        }

        return increasedArray;
    }


    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();
        Book b4 = new Book();
        b1.setId(101);
        b1.setName("FirsFirst");
        b1.setAuthor("FirstFirstAuthor");
        b1.setYear(1111);

        b2.setId(102);
        b2.setName("FirsSecond");
        b2.setAuthor("FirstSecondAuthor");
        b2.setYear(1112);

        b3.setId(201);
        b3.setName("SecondFirst");
        b3.setAuthor("SecondFirstAuthor");
        b3.setYear(1113);

        b4.setId(201);
        b4.setName("SecondSecond");
        b4.setAuthor("SecondSecondAuthor");
        b4.setYear(1114);
        Book [] arr1 = new Book[]{b1, b2};
        Book [] arr2 = new Book[]{b3, b4};
        Book [][] books = new Book[][]{arr1, arr2};

        System.out.println("Array before increase");

        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books[i].length; j++) {
                System.out.println(books[i][j]);

            }

        }

        Book [][] increased=increaseArray(books, 3);

        System.out.println("Array after increase");

        for (int i = 0; i < increased.length; i++) {
            for (int j = 0; j < increased[i].length; j++) {
                System.out.println(increased[i][j]);

            }

        }

    }
}
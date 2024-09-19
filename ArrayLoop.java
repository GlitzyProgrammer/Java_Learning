public class ArrayLoop {
    public static void main(String[] args) {
        int[] arr2 = new int[10];//size 10 0-9
        int[] arr1 = {1, 2, 3, 4, 5}; //creating with intial values
        //Arrays are objects function similar to other lanagues
        // assigning and accessing arrays are just as similar. 
        arr2[0] = 4;
        arr2[1] = arr2[0] + 5;
        for (int i=0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
            //this prints out a new line :)
        }
        // The loops look very close to C/C++

    }
}

package exercise.ReverseArray;

public class ReverseArrayClient {
    public static void intArray() {
        ReverseArray<Integer> stack = new ReverseArray();
        int[] arr = {1,2,3,4,5};

        System.out.println("Interger Array After: ");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
            stack.push(arr[i]);
        }
        System.out.println("");

        System.out.println("Interger Array Before: ");
        for (int i=0; i<arr.length; i++) {
            arr[i] = stack.pop();
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    public static void stringArray() {
        ReverseArray<String> stack = new ReverseArray();
        String string = "Day la mot mang";
        String[] arr = string.split("\\s");

        System.out.println("String Array After: ");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
            stack.push(arr[i]);
        }
        System.out.println("");

        System.out.println("String Array Before: ");
        for (int i=0; i<arr.length; i++) {
            arr[i] = stack.pop();
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        intArray();
        stringArray();
    }
}

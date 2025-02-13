package Problems.Heap;
public class InsertionHeap {
    static void heapify(int[] arr, int n, int i)
    {
        int parent = (i - 1) / 2;
        if (parent >= 0) {
            if (arr[i] > arr[parent]) {
                int temp = arr[i];
                arr[i] = arr[parent];
                arr[parent] = temp;
                heapify(arr, n, parent);
            }
        }
    }
    static int insertNode(int[] arr, int n, int Key)
    {
        n = n + 1;
        arr[n - 1] = Key;
        heapify(arr, n, n - 1);
        return n;
    }
    static void printArray(int[] arr, int n)
    {
        for (int i = 0; i < n; ++i)
            System.out.println(arr[i] + " ");

        System.out.println();
    }

    // Driver Code
    public static void main(String args[])
    {
        // Array representation of Max-Heap
        // 10
        // / \
        // 5 3
        // / \
        // 2 4

        // maximum size of the array
        int MAX = 1000;
        int[] arr = new int[MAX];

        // initializing some values
        arr[0] = 10;
        arr[1] = 5;
        arr[2] = 3;
        arr[3] = 2;
        arr[4] = 4;

        // Current size of the array
        int n = 5;

        // the element to be inserted
        int Key = 15;

        // The function inserts the new element to the heap and
        // returns the new size of the array
        n = insertNode(arr, n, Key);

        printArray(arr, n);
        // Final Heap will be:
        // 15
        // / \
        // 5	 10
        // / \ /
        // 2 4 3
    }
}

// The code is contributed by Gautam goel

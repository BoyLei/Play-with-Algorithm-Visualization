import java.util.Random;


public class SelectionSortData {

    private int N;

    private int[] numbers;
    public int orderedIndex;           // [0...orderedIndex) 是有序的
    public int currentCompareIndex;    // 当前正在比较的元素索引
    public int currentMinIndex;

    public SelectionSortData(int N, int randomBound){
        this.N = N;

        numbers = new int[N];

        Random rand = new Random();
        for( int i = 0 ; i < N ; i ++)
            numbers[i] = rand.nextInt(randomBound) + 1;
    }

    public int N(){
        return N;
    }

    public int get(int index){
        if( index < 0 || index >= numbers.length)
            throw new IllegalArgumentException("Invalid index to access Selection Sort Data.");

        return numbers[index];
    }

    public void swap(int i, int j) {
        int t = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = t;
    }
}
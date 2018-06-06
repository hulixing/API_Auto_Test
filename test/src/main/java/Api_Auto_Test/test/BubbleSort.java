package Api_Auto_Test.test;
 
public class BubbleSort{
	public static void main(String[] args) {
		int arr[]= {1,5,22,11,88,66};
		bubbleSort(arr);
		
	}

	 public static void bubbleSort(int[] arr) {
	        for (int i = 0; i < arr.length - 1; i++) {
	            boolean flag = true;//设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已然完成。
	            for (int j = 0; j < arr.length - 1 - i; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    swap(arr,j,j+1);
	                    flag = false;	                    
	                }
	            }
	            if (flag) {
	                break;
	            }
	        }
	    }
	 public static void swap(int []arr,int a,int b){
		    int temp = arr[a];
		    arr[a] = arr[b];
		    arr[b] = temp;
		}
}

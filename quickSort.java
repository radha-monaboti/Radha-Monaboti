public class quickSort {
    static int partition(int[] arr,int low,int high){
        int pivot=arr[high],i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
    public static void main(String[] args){
        int[] arr={10,42,39,546,45,55};
        System.out.println("Before sorting:");
        for(int i:arr)
            System.out.println(i+" ");
        quickSort(arr,0,arr.length-1);
        System.out.println("After sorting:");
        System.out.println();
        for(int i:arr)
            System.out.println(i+" ");
    }
}

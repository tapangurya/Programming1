// package merge_short;

public class Program1 {
    public static void merge_short(int [] arr,int start, int end){
        if(start<end){
            int mid =(start+end)/2;
            merge_short(arr, start, mid);
            merge_short(arr, mid+1, end);
            merge(arr, start, mid, end);
        }

    }
    public static void merge(int [] arr, int start, int mid, int end){
        //s1:
        int leftSize= mid-start+1;
        int rightArraySize= end-mid;
        //s2: 
        int []left_Array= new int [leftSize];
        int [] right_Array = new int[rightArraySize];
        //copy data to left array
        for(int i =0 ; i<left_Array.length; i++){
            left_Array[i]=arr[start + i];//importent
        }
        // copy right data 
        for(int i=0; i<rightArraySize;i++){
            right_Array[i]= arr[mid+1 +i];
        }
        // merge left and right array
        // index i,j,k represent left right original
        int i=0,j=0,k=start;
        while(i<leftSize && j<rightArraySize){
            if(left_Array[i]<right_Array[j]){
                arr[k++]=left_Array[i++];
            }
            else{
                arr[k++]= right_Array[j++];
            }
        }
                //copy the remaining element
                //left
                while(i<leftSize){
                    arr[k++]= left_Array[i++];
                }
                //right
                while(i<rightArraySize){
                    arr[k++]= right_Array[j++];
                }

    }

    //utiliti method
    public static void printArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+",");
        }
    }
    public static void main(String[] args) {
        int [] a ={5,7,3,4,2,0,1};
        merge_short(a, 0, a.length-1);
        printArray(a);

        
    }
}

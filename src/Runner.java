public class Runner {

    public void main (String[] args){
        int[] test = {0,1,9,6,8,3,11,12};
        BubbleSwap(test);
        System.out.println(test);
    }

    public void swap(int[] arr, int pos1, int pos2){
        if(arr.length-1 > pos1 && arr.length-1 > pos2){
            int x = arr[pos2];
            arr[pos2] = arr[pos1];
            arr[pos1] = x;
        }
    }
    
    public void BubbleSwap(int[] arr){
        boolean done = false;
        int m = 1;
        int x = -1;
        while(!done){
            for(int i = 0; i < arr.length; i++){
                if(arr[i] > arr[i+1]){
                    swap(arr,i,i+1);
                    x = i + 1;
                }
            }
            m = arr.length - x;
            if(x == -1){
                done = true;
            }
        }
    }
}

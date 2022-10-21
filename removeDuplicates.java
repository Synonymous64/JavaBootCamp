public class removeDuplicates {
    public void duplicateRemoved(int[] arr){
        int[] res = new int[arr.length - 1];
        for(int i = 0; i < arr.length; ++i) res[arr[i]]++;
        for(int i = 0; i < res.length; ++i){
            if(res[arr[i]] == 1){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,9,9};
        removeDuplicates d = new removeDuplicates();
        d.duplicateRemoved(arr);

    }
}

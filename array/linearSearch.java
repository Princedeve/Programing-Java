package array;

public class linearSearch {
    public static int linearSearch(int arr[], int n){

        for(int i = 0; i<arr.length; i++){
            if(n == arr[i]){
            return i;
            }
        }
        return -1;
    }
    public static int linearSearch2(String arr[], String key){
    for(int i = 0; i<arr.length; i++){
        if(key == arr[i]){
            return i;
        }
    }
    return -1;
 }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10,12,14,16};
        String menu[] = {"dosa", "chole bhature", "samosa"};
        int index = linearSearch(arr, 10);
        // int index = linearSearch2(menu, "chole bhature");
        if(index == -1){
            System.out.println("NOT found");
        }else{
            System.out.println("Index found is : "+index);
        }
    }
}

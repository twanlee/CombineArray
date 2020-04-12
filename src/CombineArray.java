public class CombineArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {7,8,9};
        int [] newArray = new int[arr1.length + arr2.length];
        int j=0;
        for (int i=0; i<newArray.length; i++){
            if(i<arr1.length){
                newArray[i] = arr1[i];
            }else{
                newArray[i] = arr2[j];
                j++;
            }
        }
        for(int x: newArray) System.out.print(" "+x);
    }
   }

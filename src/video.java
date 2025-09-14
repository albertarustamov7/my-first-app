public class video {
    public static void main(String[] args) {
    byte []  nums1 = new byte[]{1,2,4};
   int sum1= summaArray(nums1);
        System.out.println("Резльтат "+ sum1);



    }
    public static int summaArray(byte [] arr){
        int suma =0;
    for (byte i =0; i<arr.length;i++){
        suma +=arr[i];
        }
        return suma;
    }
}

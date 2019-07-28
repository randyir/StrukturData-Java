package penjumlahanarray;
import java.util.Arrays;
public class PenjumlahanArray {
   public static void main(String[] args) {
       int[] a = {1, 2, 4, 8};
       int[] b = {16, 32, 64, 128};
       int totalA = 0;
       int totalB = 0;
       int total;
       
       for(int num : a){
           totalA = totalA+num;
       }
       for(int num : b){
           totalB = totalB+num;
       }
       total = totalA + totalB;
       
       System.out.println("Jumlah Nilai dari Kedua Array : "+total);
       
       int[] ab = new int[a.length+b.length];
       System.arraycopy(a, 0, ab, 0, b.length);
       System.arraycopy(b, 0, ab, a.length, b.length);
       
       System.out.print("Gabungan Data dari Kedua Array : ");
       System.out.println(Arrays.toString(ab));    
  }  
}
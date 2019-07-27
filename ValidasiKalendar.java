/* RANDY IKHSAN RAMADHAN - 18360021 - Struktur Data */
package validasikalendar;
import java.util.Scanner;
public class ValidasiKalendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hari = 0, tanggal, bulan, tahun;
        boolean Tanggal, Bulan, Valid;
        String hasil, namaBulan = null;
       
        System.out.print("Masukkan Tanggal : ");
        tanggal = input.nextInt();
        System.out.print("Masukkan Bulan : ");
        bulan = input.nextInt();
        System.out.print("Masukkan Tahun : ");
        tahun = input.nextInt();
        
        if(bulan==1){
            hari = 31;
            namaBulan = " Januari ";
        }
        else if(bulan==2){
            if((tahun % 4 == 0 && tahun % 100!=0) || tahun %400 == 0){
                hari=29;
                namaBulan = " Februari ";
            }
            else{
                hari=28;
                namaBulan = " Februari ";
            }
        }
        else if(bulan==3){
            hari = 31;
            namaBulan = " Maret ";
        }
        else if(bulan==4){
            hari = 30;
            namaBulan = " April ";
        }
        else if(bulan==5){
            hari = 31;
            namaBulan = " Mei ";
        }
        else if(bulan==6){
            hari = 30;
            namaBulan = " Juni ";
        }
        else if(bulan==7){
            hari = 31;
            namaBulan = " Juli ";
        }
        else if(bulan==8){
            hari = 31;
            namaBulan = " Agustus ";
        }
        else if(bulan==9){
            hari = 30;
            namaBulan = " September ";
        }
        else if(bulan==10){
            hari = 31;
            namaBulan = " Oktober ";
        }
        else if(bulan==11){
            hari = 30;
            namaBulan = " November ";
            
        }
        else if(bulan==12){
            hari = 31;
            namaBulan = " Desember ";
        }
        else{
            namaBulan = " undefined ";
        }
        
        Tanggal = tanggal >=1 && tanggal <= hari;
        Bulan = bulan >=1 && bulan <=12;
        Valid = Tanggal && Bulan;
        
        if(Valid){
            hasil = " valid.";
        }
        else{
            hasil = " tidak valid.";
        }
        System.out.println("");
        System.out.println(tanggal+namaBulan+tahun+hasil);
    }
}
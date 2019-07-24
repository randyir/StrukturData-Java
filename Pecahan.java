package pecahan;

public class Pecahan {
  int bulat,pembilang,penyebut;
  
  Pecahan(){
      bulat=0;pembilang=0;penyebut=1;
  }
  Pecahan(int x){
      bulat=x;pembilang=0;penyebut=1;
  }
   Pecahan(int x,int y){
      bulat=0;pembilang=x;penyebut=y;
  }
   Pecahan(int x,int y,int z){
      bulat=x;pembilang=y;penyebut=z;
  }
  int gcd (int x, int y){
    if(y==0) return(x);
    else return (gcd(y,x%y));
  }
  
  void reduksi(){
  int temp=gcd(pembilang,penyebut);
  pembilang=pembilang/temp; penyebut=penyebut/temp;
  if(pembilang>=penyebut){
      bulat=pembilang/penyebut;
      pembilang=pembilang %penyebut;
  }
  else bulat=0;
    }
  
  Pecahan tambah(Pecahan X) {
    Pecahan T = new Pecahan()  ;
    T.bulat=0;
    T.pembilang=(bulat*penyebut+pembilang)*X.penyebut + penyebut*(X.bulat*X.penyebut+X.pembilang);
    T.penyebut=penyebut*X.penyebut;
    T.reduksi();
    return T;
  }
  Pecahan kurang(Pecahan X) {
    Pecahan T = new Pecahan()  ;
    T.bulat=0;
    T.pembilang=(bulat*penyebut+pembilang)*X.penyebut - penyebut*(X.bulat*X.penyebut+X.pembilang);
    T.penyebut=penyebut*X.penyebut;
    T.reduksi();
    return T;
  }
  Pecahan kali(Pecahan X) {
    Pecahan T = new Pecahan()  ;
    T.bulat=0;
    T.pembilang=(bulat*penyebut+pembilang)*(X.bulat*X.penyebut+X.pembilang);
    T.penyebut=penyebut*X.penyebut;
    T.reduksi();
    return T;
  }
 
   Pecahan bagi(Pecahan X) {
    Pecahan T = new Pecahan()  ;
    T.bulat=0;
    T.pembilang=(bulat*penyebut+pembilang)*X.penyebut;
    T.penyebut=penyebut*(X.bulat*X.penyebut+X.pembilang);
    T.reduksi();
    return T;
  }
  
  String toStr(){
      String T="";
      if(penyebut ==1)
          if(pembilang==0)
              T=T+bulat;
          else {
              T=T+(bulat+pembilang);
              pembilang=0;
          }
      else if(bulat==0)
          T=T+pembilang+"/"+penyebut;
          else
      T=T+bulat+" "+pembilang+"/"+penyebut;
      return (T);
  }
  
    public static void main(String[] args) {
       Pecahan x=new Pecahan();
       Pecahan A=new Pecahan(5,4,3);
       Pecahan B=new Pecahan(2,5);
      
       System.out.println("Diketahui :\nA = "+A.toStr()+"\nB = "+B.toStr()+"\n");
       x=A.tambah(B);
       System.out.println("A + B = "+x.toStr());
       x=A.kurang(B);
       System.out.println("A - B = "+x.toStr());
       x=A.kali(B);
       System.out.println("A * B = "+x.toStr());
       x=A.bagi(B);
       System.out.println("A / B = "+x.toStr());
    }   
}
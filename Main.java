import java.util.*;

class Main {
  public static void main(String[] args) {
    
    int number,temp,terssayi=0;
    
    Scanner scan=new Scanner (System.in);
    System.out.println("Lütfen bir sayı giriniz.");
    number = scan.nextInt();
    
    temp=number;
    
    while(temp!=0){
      int sonsayı=temp%10;
      terssayi=terssayi*10+sonsayı;
      temp/=10;
    } 
    System.out.println("Girdiğiniz sayi: "+number);
    System.out.println("Girdiğiniz sayının tersi: "+terssayi);
    
    if(number==terssayi){
      System.out.println(number+" sayısı polindrom bir sayıdır.");
    }else{
      System.out.println(number+" sayısı polindrom bir sayı değildir.");
    }
  }
}

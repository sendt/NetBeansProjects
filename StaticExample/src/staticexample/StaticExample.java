/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticexample;

import java.util.*;
import calisma.*;

/**
 *
 * @author root
 */
public class StaticExample extends calisma.ArrayList{

    public StaticExample(String color) {
        System.out.println("kedi oluştu");
        System.out.println(a);
        System.out.println(d);
        System.out.println("we called constructor method and created new object");
        System.out.println("whic one is "+color);
    }
    

    
    public static void main(String[] args) {
        calisma.ArrayList aaA=new calisma.ArrayList();
        //NewClass n=new NewClass();
        //System.out.println(n.y);
//       String [] d=new String[5];
//       String [] d1=new String[3];
//        System.out.println("atam işlemleri yapıldı..");
//        d1[0]="ret";d1[1]="dert";d1[2]="def";
//        d[0]="bauram";
//        d[1]="bayram";
//        d[2]="aydnı";
//        d[3]="aydın";
//        d[4]="ali";
//        System.out.println("birinci  dizi");
//        EkranaBas(d);
//        System.out.println("***************************************\n ikinci dizi");
//        EkranaBas(d1);
//        System.arraycopy(d1, 0, d, 2, d1.length);
//        System.out.println("brinici diziyi ikinc idiziye attık bakalım sınuca");
//        System.out.println("***************************************\n ikinci dizi");
//        EkranaBas(d);
    }
    public static void EkranaBas(String  d[]){
        for (int i = 0; i < d.length; i++) 
            System.out.print(" "+d[i]+" ");
        
    }
    
}
class NewClass{
    int y;
    public static void main(String[] args) {
        StaticExample f=new StaticExample("blue");
    }
}
class Araba{
   
    String renk;
    int model;
    Araba(){
        this("mavi",94);
        
    }
    Araba(String renk,int model){
        this.model=model;
        this.renk=renk;
        //System.out.print(this.model +" modelde ve "+this.renk+" renkte bir araba oluşturuldu..");
    
    }
    public void Sur(String isim){
        System.out.println(isim+ " arabayı sürüyor");
    }
    public void Sur(String isim,String where){
        System.out.println(isim +" arabayı "+where +" gidiyor");
    }
    public void Sur (){
        System.out.println("araba sürülüyor");
    }
    public static void main(String[] args) {
        Araba a1=new Araba();
        
      //a1.Sur();
     // a1.Sur("bayram");
     // a1.Sur("bayram", "okula");
     
        a1=new Araba("sarı", 200);//System.gc();
        System.out.println("sonuncu araabannın rengi ve modeli "+a1.renk+" "+a1.model);
       
    }
    public void finalize(){
        System.out.println(" gereksiz araba yok ediliyor..");
    }
    
}
class Ornek{
    public static void main(String[] args) {
        System.out.println("başladı bakalım hangi arraylisti alacağız");
        calisma.ArrayList a=new calisma.ArrayList();
        System.out.println("bitis....");
    }
}
class Kahve{
    private int siparis_sayisi;
    private Kahve(){
        
    }
    private void kahve_hazirla(){
        System.out.println(siparis_sayisi+ " adet kahve hazırlandı");
    }
    public static Kahve siparisGarson(int sayi){
        Kahve kahve=new Kahve();
        kahve.siparis_sayisi=sayi;
        kahve.kahve_hazirla();
        return kahve;
    }
}
class Musteri{
    public static void main(String[] args) {
        Kahve kh=Kahve.siparisGarson(5);
    }
}

class Kedi  {
    protected int ayak_sayisi=4;
public void yakala_Av(){
    System.out.println("kedi sınıfı avını yakadı");
}    
    public static void main(String[] args) {
        Kedi k=new Kedi();
        k.yakala_Av();
    }
    public Kedi(){
        System.out.println("kedi oluşturuluyor..");
        
}
}
class Kaplan extends Kedi{
    public static void main(String[] args) {
        Kaplan kap=new Kaplan();
        kap.yakala_Av();
        System.out.println("ayak sayısı: "+kap.ayak_sayisi);
    }
}
class Deneme1{
    static int y=new Integer(5);
    public static void main(String[] args) {
        System.out.println("y= "+y);
        y=new Integer(77);
        System.out.println("y degerini degiştirdik ");
        System.out.println("y= "+y);
        
    }
}

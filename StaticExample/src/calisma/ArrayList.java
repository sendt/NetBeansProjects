
package calisma;

public class ArrayList {
    final int x;
    static Catal c1=new Catal(1, " static alan ");
    static Catal c2=new Catal(2, " static alan ");
    static Tabak t4=new Tabak(4, " static alan ");
    static Tabak t5=new Tabak(5, " static alan ");
    Tabak t1=new Tabak(1," static olmayan ");
    protected String a="Hayvan.a";
    String b="Hayvan.b";
    private String c="Hayvan.c";
    public String d="Hayvan.d";
    public ArrayList(){
        System.out.println("calis adı altındaki arraylist sınfının yapılanndırıcısı");
        this.x=5;
    }
    public void islem_tamam(){
        System.out.println("işlem tamam");
    }
    public static void main(String[] args) {
      
     ArrayList a=new ArrayList();
     a.islem_tamam();
      System.out.println("x= "+a.x);
    }
    
//    public static void main(String[] args) {
//        static Catal c1=new Catal(1, " static alan ");
//        static Catal c2=new Catal(2, " static alan ");
//        static Tabak t4=new Tabak(4, " static alan ");
//        static Tabak t5=new Tabak(5, " static alan ");
//    }
    
}
  class Hayvan{
    protected String a="Hayvan.a";
    String b="Hayvan.b";
    private String c="Hayvan.c";
    public String d="Hayvan.d";
}
class Peynir{
    public Peynir(int i, String tur){
        System.out.println("PEynir ( "+i+" ) ---> "+tur);
    }
}
class Tabak{
    static Peynir p1=new Peynir(1," statik olan ");
    Peynir p2=new Peynir(2, " statik olmayan alan ");
    public Tabak(int i, String tur){
        System.out.println("Tabak ( "+i+" ) ---> "+tur);
    }
    
}
class Catal{
    public Catal(int i, String tur){
        System.out.println("Catal ( "+i+" ) ---> "+tur);
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object2;

/**
 *
 * @author aytaj.veyisli
 */

 
public class Object2 {
    
    
//  static  User u2 = new User();//(staticsiz)ne vaxt ki object2 classinin obyekti yaranar onda u2 de yaranar amma asagidaki main-in icindeki u yaranib cunki static main yaranan kimi icindekiler de yaranir
    
  
  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User.CompanyName="B2B Tech";//burda ancaq staticleri gorur cunki class yaranan kimi staticler de yaranib
        
        
        User u = new User();
        u.name="Aytaj";//diger instance variable-lari da gorur cunki onlar da static deyil obyekt yarananda yaranir
        
       // u.foo();//static foo-nu gorur cunki foo class yarananda uje yaranib
        
      //  u.foo2();//static olmayan foo2-ni de gorur cunki obyekt yarananda static olmayan ne varsa yaranir
        
        
        u.CompanyName="B2B Tech 2";
       // System.out.println("u.CompanyName= "+u.CompanyName);
        //System.out.println("u.name="+ u.name);
        
        User u2 = new User();
        u2.name="Oruj";
        u2.CompanyName="B2B Tech 3";
        
        
        
       // System.out.println("u2.CompanyName= "+ u2.CompanyName);
      //  System.out.println("u2.name=" + u2.name);
        
        User usr = null; //obyekt kimi gormur cunki obyekt deyil null-du yaddasda yer de ayrilmayib 
        usr.CompanyName="lorem ipsum"; //companyName class yaranan kimi yaranir deye onu obyektin bir hissesi kimi gormur sadece staticdi class yaranan kimi yaranir deye onu menimsede bilir
        usr.name="java"; //amma burda name instance variable oldugu ucun obyekt yaranmasa yaranasi deyil obyekt de yaratmamisiq null yazmisiq ona gore name de yaranmayib ona gore NullPointerException verecek
        
       // System.out.println(User.CompanyName);
       // System.out.println(usr.name);
        
        
        //=========================================================================================
        
        //referanslarin qirilmasi
        User user = new User(); //user burda referance-di yeni ki User obyektinin unvanini saxlayir 
        user.name="Aytac"; //hemin unvandaki obyekti tapir onun name-ne aytaci menimsedir
        
        
        user=new User(); // user artiq yeni obyektin referansini saxlayir yeni evvel saxladigi unvan yenilenir 
      //  System.out.println(user.name); // burda artiq yeni obyektin name-ni print edecek ona da hec ne menimsetmemisik deye null qaytaracaq amma yuxaridakini print etseydik Aytac qaytaracaqdi
      //  System.out.println(user.CompanyName); // Userin companyname-i isteyir  companyName staticsiz olsaydi yaranmis yeni obyektin companyName-ni isteyecekdi
  
      User person = new User();
        System.out.println(person.name); // null verecek cunki bosdu
        
        
        //Object2 m = new Object2(); change metodunun qarsisinda yazdigim asagida da olacaq m.change(person)
        
        change(person); //personun referansini gonderirik null deyisir olur changed
        System.out.println(person.name); //changed print olunacaq
      
      
    }
    
    
    public static void change(User u){ // eger bunu static elemese idim onda yuxarida cagirdigim change(person) error olacaqdi cunki onu cagirmaq ucun ya static olmalidi ya da daxil oldugu classin obyektini yaradib . qoyub cagirmaq lazimdi yeni ki Object2 m = new Object2 m.change(person), object2 daxilinde hem main hem de change metodlari staticdi bir birini cagira bilirler
        u.name="changed";
    }
}

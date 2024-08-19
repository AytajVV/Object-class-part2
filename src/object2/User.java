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
public class User {
    public String name;
    public String surname;
    public int age;
    public static String CompanyName;
    
    
    
    public static void foo(){
        //static olan foo ancaq static deyisenleri gorur cunki static olmayanlar hele yaranmayib bilinmir yaranacaq yoxsa yox
        
        //u obyektini de gore bilmez cunki main blokuna aiddi u obyekti 
     //   Object2.u2 //gorur cunki object2nin daxilinde staticdi eger static olmasa idi gormezdi
        
    }
    
    public void foo2(){
        User.CompanyName="l";//burda u obyektinin ozunu habele obyekte aid ne varsa staticsiz parametrleri de gormur cunki obyekt main classinin icindedi ve ona aiddi 
    //burda ancaq User.staticleri gorur cunki staticler user classi yaranan kimi yaranib
    
    }
}

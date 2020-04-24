
package  java.com.hbliti.example2;

import java.util.HashSet;
import java.util.Set;

/**
 * 学生类
 * @author lenovo
 *
 */
public class Student {

    public String id;
    
    public String name;
    
    //public Set<KeCheng> kecheng;
    
    public Student(String id,String name){
        this.id = id;
        this.name = name;
        //this.kecheng = new HashSet<KeCheng>();
    }
    
}
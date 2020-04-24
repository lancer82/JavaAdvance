package java.com.hbliti.example2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {

    //创建一个Map属性用来承装学生对象
    public Map<String,Student> student;
    
    /*
     * 在构造器中初始化学生属性
     */
    public MapTest(){
        this.student = new HashMap<String,Student>();
    }
    
    /*
     * 添加方法：输入学生ID，判断是否被占用，
     * 如果未被占用，则输入姓名，创建新学生对象，添加到student中
     */
    public void testPut(){
        //创建一个Scanner对象，输入学生ID
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(i<3){
            System.out.println("请输入学生ID：");
            String stuID = sc.next();
            Student stu = student.get(stuID);
            if(stu == null){
                System.out.println("请输入学生姓名：");
                String stuName = sc.next();
                Student newStudent = new Student(stuID,stuName);
                student.put(stuID, newStudent);
                System.out.println("成功添加学生："+student.get(stuID).name);
                i++;
            }else{
                System.out.println("该学生ID已被占用！");
                continue;
            }
            
        }
    }
    
    /*
     * 测试Map的keySet方法
     */
    public void testKeySet(){
        //通过keySet方法，返回Map中所有“键”的Set集合
        Set<String> keySet = student.keySet();
        //取得student的容量
        System.out.println("总共有"+student.size()+"个学生；");
        //遍历keySet，取得每一个键，再调用get方法取得每个键对应的value
        for (String stuID : keySet) {
            Student stu = student.get(stuID);
            if(stu != null){
                System.out.println("学生："+stu.name);
            }
        }
    }
    
    
    /*
     * 通过entrySet来遍历Map
     */
    public void testEntrySet(){
        //通过entrySet返回Map中所有的键值对
        Set<Entry<String,Student>> entrySet = student.entrySet();
        for(Entry<String,Student> entry:entrySet){
            System.out.println("取得键："+entry.getKey());
            System.out.println("对应的值为："+entry.getValue().name);
        }
    }
    
    
    /*
     * 删除Map中的映射
     */
    public void testRemove(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入要删除的学生ID：");
            String stuID = sc.next();
            //判断输入的ID是否存在对应的学生对象
            Student stu = student.get(stuID);
            if(stu == null){
                System.out.println("输入的学生ID不存在！");
                continue;
            }
            student.remove(stuID);
            System.out.println("成功删除学生"+stu.name);
            break;
        }
        testEntrySet();
    }
    
    
    /*
     * 使用put方法修改Map中已有的映射
     */
    public void testModify(){
        System.out.println("请输入要修改的学生ID：");
        Scanner sc = new Scanner(System.in);
        while(true){
            String id = sc.next();
            Student stu = student.get(id);
            if(stu == null){
                System.out.println("ID不存在！");
                continue;
            }
            System.out.println("当前学生是："+stu.name);
            System.out.println("请输入新的学生：");
            String name = sc.next();
            Student newStu = new Student(id,name);
            student.put(id, newStu);
            System.out.println("修改成功！");
            break;
        }
    }
    
    
    /*
     * 测试Map中是否存在某个key值或value值
     */
    public void testContainsKey(){
        System.out.println("请输入学生ID：");
        Scanner sc = new Scanner(System.in);
        String stuID = sc.next();
        //用containsKey()方法来判断是否存在某个key值
        System.out.println("输入的ID为："+stuID+",在学生列表中是否存在："+student.containsKey(stuID));
        if(student.containsKey(stuID)){
            System.out.println("学生的姓名为："+student.get(stuID).name);
        }
        
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        //用containsValue()方法来判断是否存在某个value值
        if(student.containsValue(new Student(null,name))){
            System.out.println("存在学生"+name);
        }else{
            System.out.println("学生不存在");
        }
    }
    
    
    
    public static void main(String[] args) {

        MapTest mt = new MapTest();
        mt.testPut();
        mt.testKeySet();
    }

}
package cm.hbliti.studentmis;

import java.util.Scanner;

public class Student {
   String name;
   int no;
   double score;
   public Student() {
	
   }
   
   Student(String name,int no,double score){
	   this.name=name;
	   this.no=no;
	   this.score=score;
   }
   
   
   Student input(){
	   Scanner fin = new Scanner(System.in);
	   String name=fin.next();
	   int no=fin.nextInt();
	   double score=fin.nextDouble();
	   Student stu=new Student(name,no,score);
	   return stu;
  }
   
   void show(Student stu){
	   System.out.println("姓名："+stu.name+"\n"+"学号"+stu.no+"\n"+"成绩"+stu.score);
   }
   void save(){
	   
   }
}

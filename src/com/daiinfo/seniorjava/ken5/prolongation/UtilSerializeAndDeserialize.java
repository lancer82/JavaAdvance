package com.daiinfo.seniorjava.ken5.prolongation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UtilSerializeAndDeserialize {
	 /**
     * 外部序列化teacher对象
     * @param teacher
     */
    static void serialize(Teacher teacher){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:\\teacher.dat"));
            oos.writeObject(teacher);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    static Teacher deserialize(){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:\\teacher.dat"));
            return (Teacher)ois.readObject();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}

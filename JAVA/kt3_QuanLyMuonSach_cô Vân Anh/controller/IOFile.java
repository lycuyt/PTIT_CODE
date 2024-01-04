/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.ObjectInputStream;

/**
 *
 * @author Admin
 */
import java.io.ObjectOutputStream;
public class IOFile {
    // doc tu file va luu vao danh sach
    public static  <T> List <T> doc(String fname){
        List <T> list = new ArrayList<>();
        try{
            ObjectInputStream o = new ObjectInputStream(new FileInputStream(fname)) ;
            list = (List<T>)o.readObject();
            o.close();
        }catch(IOException e)
        {
            System.out.println(e);
            
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        return list;
    }
    // tu danh sach luu vao file
    public static <T> void viet(String fname, List<T> arr)
    {
        try{
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(fname)) ;
            o.writeObject(arr);
            o.close();
        }catch(IOException e)
        {
            System.out.println(e);
            
        }
    }
            
}

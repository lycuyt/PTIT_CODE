/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khiabaolophinhchunhat;

/**
 *
 * @author Lycuy
 */
public class hinhchunhat {
    private double width;
    private double height;
    private String color;
    
    public hinhchunhat(){
        height =1;
        width =1;
    }
    
    public hinhchunhat(double width, double height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }
    
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    
    public double findArea(){
        return width*height;
    }
    public double findPerimeter(){
        return 2*(width+height);
    }
    
}

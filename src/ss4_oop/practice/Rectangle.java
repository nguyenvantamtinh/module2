package ss4_oop.practice;

public  class Rectangle {
    double width,height;
    public Rectangle(){

    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return  this.width * this.height;
    }
    public double getPerimeter(){
        return (this.height+this.width)*2;
    }

}

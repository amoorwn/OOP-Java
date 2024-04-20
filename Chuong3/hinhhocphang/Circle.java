/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hinhhocphang;

/**
 *
 * @author Admin
 */
class Circle extends HinhHocPhang  {

    private float R;

    public Circle(float R) {
        this.R = R;
    }

    @Override
    public double tinhChuVi(){
        return 2*Math.PI*R;
    }
    
    @Override
    public double tinhDienTich(){
        return Math.PI*R*R;
    }
}

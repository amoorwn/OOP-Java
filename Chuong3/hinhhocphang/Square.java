/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hinhhocphang;

/**
 *
 * @author Admin
 */
class Square extends HinhHocPhang{
    private float Canh;

    public Square(float Canh) {
        this.Canh = Canh;
    }
    
    @Override
    public double tinhChuVi(){
        return Canh*4;
    }
    @Override
    public double tinhDienTich(){
        return Canh*Canh;
    }
}

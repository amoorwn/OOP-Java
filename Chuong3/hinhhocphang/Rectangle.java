/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hinhhocphang;

/**
 *
 * @author Admin
 */
class Rectangle extends HinhHocPhang {
    private float Dai;
    private float Rong;

    public Rectangle(float Dai, float Rong) {
        this.Dai = Dai;
        this.Rong = Rong;
    }
    
    @Override
    public double tinhDienTich(){
        return Dai*Rong;
    }
    @Override
    public double tinhChuVi(){
        return (Dai+Rong)*2;
    }
}

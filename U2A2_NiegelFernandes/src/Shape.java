/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Niegel
 */
public abstract class Shape {
    private double dimension1;
    private double dimension2;
    
    public abstract double calculateArea();

    // Getter and Setter methods for dimensions
    public void setDimensions(double dim1, double dim2) {
        this.dimension1 = dim1;
        this.dimension2 = dim2;
    }
}
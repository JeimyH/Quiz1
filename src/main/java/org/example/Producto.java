package org.example;

public class Producto {
    private int codigoProducto;
    private String nombreProducto;
    private int precioProducto;
    private int cantidadStock;

    public Producto() {
    }

    public Producto(int codigoProducto, String nombreProducto, int precioProducto, int cantidadStock) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.cantidadStock = cantidadStock;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precio) {
        this.precioProducto = precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    // Metodos


    public int VenderProducto(int stock, int nvendido){
        if(nvendido<=stock) {
            stock = stock - nvendido;
        }else{
            System.out.println("Cantidad insuficiente de productos");
        }
        return stock;
    }

    public int ReponerStock(int sumar){
        return this.cantidadStock=this.cantidadStock+sumar;
    }

    public int AplicarDescuento(){
        int total;
        int descuento;
        descuento=(this.precioProducto*2)/100;
        total=this.precioProducto-descuento;
        return total;
    }

    public void Informacion(){
        System.out.println("Código del producto: "+this.codigoProducto+"\n"+
                "Nombre del Producto: "+this.nombreProducto+"\n"+
                "Precio del Producto: "+this.precioProducto+"\n"+
                "Cantidad en Stock: "+this.cantidadStock+"\n");
    }

    public int AumentarPrecio(){
        int total;
        int porcentaje;
        porcentaje=(this.precioProducto*6)/100;
        total=this.precioProducto-porcentaje;
        return total;
    }

    public int Inventario(){
        int totalInv;
        totalInv=this.cantidadStock*this.precioProducto;
        return totalInv;
    }

    public void EliminarProducto(int cod){

    }
}

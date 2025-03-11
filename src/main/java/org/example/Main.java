package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int op, cod, precio, stock, pro;
        String nombre;
        Producto pd=null;
        Scanner teclado = new Scanner(System.in);
        List<Producto> productos=new ArrayList<>();
        System.out.println("Bienvenido a tu Inventario");
        do{
            System.out.println("Menu\n" +
                    "1. Crear producto\n" +
                    "2. Vender producto\n" +
                    "3. Reponer stock\n" +
                    "4. Aplicar descuento\n" +
                    "5. Mostrar información\n" +
                    "6. Aumentar precio\n" +
                    "7. Calcular valor total en inventario\n" +
                    "8. Eliminar producto\n" +
                    "9. Salir\n" +
                    "Selecciona una de las opciones");
            op=teclado.nextInt();
            switch (op){
                case 1:
                        System.out.println("Vas a crear un nuevo producto\n" +
                                "Escribe el codigo del nuevo Producto: ");
                        cod = teclado.nextInt();
                        System.out.println("Escribe el nombre del nuevo Producto: ");
                        nombre = teclado.next();
                        System.out.println("Escribe el precio por unidad del nuevo Producto: ");
                        precio = teclado.nextInt();
                        System.out.println("Escribe la cantidad que vas a guardar en inventario del nuevo Producto: ");
                        stock = teclado.nextInt();
                        productos.add(new Producto(cod, nombre, precio, stock));
                        for(int i=0; i<productos.size(); i++){
                            System.out.println("Código del Producto: "+productos.get(i).getCodigoProducto()+"\n" +
                                "Nombre del Producto: "+productos.get(i).getNombreProducto()+"\n"+
                                "Precio del Producto por unidad: "+productos.get(i).getPrecioProducto()+"\n"+
                                "Cantidad en Stock: "+productos.get(i).getCantidadStock()+"\n");
                        }
                    break;
                case 2:
                    int st, s;
                    String n;
                    System.out.println("Lista de Productos a vender");
                    for(int i=0; i<productos.size(); i++){
                        System.out.println("Código del Producto: "+productos.get(i).getCodigoProducto()+"\n" +
                                "Nombre del Producto: "+productos.get(i).getNombreProducto()+"\n"+
                                "Precio del Producto por unidad: "+productos.get(i).getPrecioProducto()+"\n"+
                                "Cantidad en Stock: "+productos.get(i).getCantidadStock()+"\n");
                    }
                    System.out.println("Escribe el nombre del producto que vas a vender\n ");
                    nombre=teclado.next();
                    System.out.println("Escribe la cantidad que vas vender del Producto "+nombre+"\n");
                    stock=teclado.nextInt();
                    for(int i=0; i<productos.size(); i++){
                        st=productos.get(i).getCantidadStock();
                        System.out.println("Antes de vender "+st);
                        n=productos.get(i).getNombreProducto();
                        if(n.equalsIgnoreCase(nombre)){
                            s=productos.get(i).VenderProducto(st,stock);
                            productos.get(i).setCantidadStock(s);
                            System.out.println("Despues de vender "+productos.get(i).getCantidadStock());
                            break;
                        }
                    }
                    for(int i=0; i<productos.size(); i++){
                        System.out.println("Código del Producto: "+productos.get(i).getCodigoProducto()+"\n" +
                                "Nombre del Producto: "+productos.get(i).getNombreProducto()+"\n"+
                                "Precio del Producto por unidad: "+productos.get(i).getPrecioProducto()+"\n"+
                                "Cantidad en Stock: "+productos.get(i).getCantidadStock()+"\n");
                    }
                    break;
                case 3:
                    System.out.println("Escribe el nombre del producto del cual vas a aumentar el stock\n ");
                    nombre=teclado.next();
                    System.out.println("Escribe la cantidad que vas a ingresar del Producto "+nombre+"\n");
                    stock=teclado.nextInt();
                    for(int i=0; i<productos.size(); i++){
                        n=productos.get(i).getNombreProducto();
                        if(n.equalsIgnoreCase(nombre)){
                            System.out.println("Stock inicial: "+productos.get(i).getCantidadStock()+"\n");
                            st=productos.get(i).ReponerStock(stock);
                            productos.get(i).setCantidadStock(st);
                            System.out.println("Stock final: "+productos.get(i).getCantidadStock()+"\n");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Escribe el nombre del producto del cual vas a aplicar el descuento\n ");
                    nombre=teclado.next();
                    for(int i=0; i<productos.size(); i++){
                        n=productos.get(i).getNombreProducto();
                        if(n.equalsIgnoreCase(nombre)){
                            System.out.println("Valor del producto antes de aplicar el descuento: "+productos.get(i).getPrecioProducto());
                            productos.get(i).AplicarDescuento();
                            System.out.println("Valor del producto antes de aplicar el descuento: "+productos.get(i).getPrecioProducto());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Escribe el nombre del producto del cual vas a mostrar la información\n ");
                    nombre=teclado.next();
                    for(int i=0; i<productos.size(); i++){
                        n=productos.get(i).getNombreProducto();
                        if(n.equalsIgnoreCase(nombre)){
                            productos.get(i).Informacion();
                        }
                    }
                    break;
                case 6:
                    System.out.println("Escribe el nombre del producto del cual vas a aplicar el descuento\n ");
                    nombre=teclado.next();
                    for(int i=0; i<productos.size(); i++){
                        n=productos.get(i).getNombreProducto();
                        if(n.equalsIgnoreCase(nombre)){
                            System.out.println("Valor del producto antes de aplicar el aumento: "+productos.get(i).getPrecioProducto());
                            productos.get(i).AplicarDescuento();
                            System.out.println("Valor del producto antes de aplicar el aumento: "+productos.get(i).getPrecioProducto());
                        }
                    }
                    break;
                case 7:
                    System.out.println("Inventario Total");
                    for(int i=0; i<productos.size(); i++){
                        System.out.println("Código del Producto: "+productos.get(i).getCodigoProducto()+"\n" +
                                "Nombre del Producto: "+productos.get(i).getNombreProducto()+"\n"+
                                "Precio del Producto por unidad: "+productos.get(i).getPrecioProducto()+"\n"+
                                "Cantidad en Stock: "+productos.get(i).getCantidadStock()+"\n" +
                                "Valor total: "+productos.get(i).Inventario());
                    }
                    break;
                case 8:System.out.println("Escribe el nombre del producto del cual vas a aplicar el descuento\n ");
                    nombre=teclado.next();
                    for(int i=0; i<productos.size(); i++){
                        n=productos.get(i).getNombreProducto();
                        if(n.equalsIgnoreCase(nombre)){
                            productos.remove(i);
                        }
                    }
                    break;
                default: System.out.println("Haz salido de tu inventario");
            }
        }while(op!=9);
    }
}
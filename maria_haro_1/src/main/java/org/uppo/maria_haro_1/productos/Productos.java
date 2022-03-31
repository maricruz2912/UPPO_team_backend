package org.uppo.maria_haro_1.productos;

public class Productos {
	private String nombre;
	private String caracteristicas;
	private String precio_producto;
	private int stock;
	private String imagen;
	private String categoria;
	private int id;
	private static int total = 0;
	
	public Productos(String nombre, String caracteristicas, String precio_producto, int stock, String imagen,
			String categoria) {
		super();
		this.nombre = nombre;
		this.caracteristicas = caracteristicas;
		this.precio_producto = precio_producto;
		this.stock = stock;
		this.imagen = imagen;
		this.categoria = categoria;
	}//Productos
	

	
	public Productos() {
		total++;
		this.id = total;
	}// Productos




	public String getNombre() {
		return nombre;
	}// getNombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre
	public String getCaracteristicas() {
		return caracteristicas;
	}//getCaracteristicas
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}//setCaracteristicas
	public String getPrecio_producto() {
		return precio_producto;
	}//getPrecio_producto
	public void setPrecio_producto(String precio_producto) {
		this.precio_producto = precio_producto;
	}//setPrecio_producto
	public int getStock() {
		return stock;
	}// getStock
	public void setStock(int stock) {
		this.stock = stock;
	}//setStock
	public String getImagen() {
		return imagen;
	}//getImagen
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}//setImagen
	public String getCategoria() {
		return categoria;
	}//getCategoria
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}//setCategoria
	public int getId() {
		return id;
	}//getId
	
   
	

	@Override
	public String toString() {
		return "Productos [nombre=" + nombre + ", caracteristicas=" + caracteristicas + ", precio_producto="
				+ precio_producto + ", stock=" + stock + ", imagen=" + imagen + ", categoria=" + categoria + ", id="
				+ id + "]";
	}//toString

	
	

	
	
	
	
	
}//Productos 



	

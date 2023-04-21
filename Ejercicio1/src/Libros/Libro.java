package Libros;

import java.util.Set;

public class Libro {
public static void main(String[] args) {

}
	int paginas;
	String Titulo;
	String Autor;
	String ISBN;
	Libro(int n1, int n2,int n3){
	
	
	Titulo = getTitulo(n1);
	Autor = getAutor(n2);
	ISBN = getISBN(n3);
	paginas = getpaginas(ISBN);
	}

public String toString() {
	return "the" + Titulo + "of" + Autor;
}
public String getTitulo(int i) {
	if(i == 1) return "ace rices";
	if(i == 2) return "king";
	return "error";
}
public String getAutor(int i) {
	if(i==1) return "pablo";
	if(i == 2) return "maicol";
	return "error";
}
public String getISBN(int i) {
	if(i==1) return "cero";
	if(i==2) return "uno";
	return "error";
}
public int getpaginas(String n) {
	if(n== "uno"|| n== "cero")
		return 20;
return paginas;
	
	
}
}

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class MiClase
{
	int x;
	public MiClase(int x) {
		this.x = x;
	}
};

public class Ejercicios {
	Scanner s = new Scanner (System.in);

	//Devuelve la division entre 'a' y 'b'
	//Se deben manejar las excepciones en caso de dividir entre 0
	static int dividir(int a, int b)
	{
		try //se hace un "try" para hacer la operacion.
		{
			return a/b; // Se escribe la division del ejercicio.
		}catch(ArithmeticException mi_exception) //Se pone el catch y se establece el error
		{
			System.out.println("Error: no se puede dividir entre 0");
			
		}
		return a/b; // Devuelve la respuesta
		
	}
	
	//Devuelve el valor almacenado en 'arreglo' en la posicion 'pos'
	//Se deben manejar las excepciones en caso la posicion se salga de los limites
	static int getNumero(int arreglo[], int pos)
	{
		try // Se hace un "try" para establecer lo que queremos
		{
		return arreglo[pos]; // devuelve el valor en la posicion "pos" del arreglo
		}catch(InputMismatchException mi_exception) //Con catch se establece un error 
		{
			System.out.println("Error: No se ingreso un entero. ");
			
		}catch(Exception mi_exception) //Con un segundo catch se establece el error general 
		{
			System.out.println("Error posicion fuera de limite.");
			
		}
		return arreglo[pos]; // Devuelve la respuesta
		
	}
	
	//Devuelve la variable 'x' de 'mi_clase'
	//Se debe manejar las excepciones en caso que 'mi_clase' sea igual a null
	static int getX(MiClase mi_clase)
	{
		
		try // Se hace un "try" para devolver la variable hecha al principio del codigo
		{
			return mi_clase.x; // devuelve la variable
		}catch (Exception e) // Se hace "catch" para establecer un error general
		{
			System.out.println("Valor a devolver es Nulo");
		}
		return mi_clase.x; //Devuelve la respuesta
	}
	
	//Devuelve el promedio de todos los elementos de 'mi_lista'
	static int getPromedio(ArrayList<Integer> mi_lista)
	{
		// idea del ejercicio sacada de: https://espanol.answers.yahoo.com/question/index?qid=20080919173628AAfbWG9
		
		int prom = 0; // Se hace una variable para el promedio
		int numeros = 0; // se hace una variable para indicar el total de numeros
		int cantidad = 0; // se hace una variable para ir sumandose con el array
		
		for(int i = 0;i < mi_lista.size(); i++)// se hace un "for" para declarar contador y para recorrer toda la lista
		{
			numeros = cantidad + mi_lista.get(i); //Se saca el total de numeros para dividir
			prom = numeros/mi_lista.get(i); // Se saca el promedio diviendo numeros(total) entre la cantidad
		}
		return prom; // devuelve la respuesta
	}
	
	//Devuelve el numero mayor almacenado en 'mi_lista'
	static int getMayor(ArrayList<Integer> mi_lista)
	{
		int mayor = 0; // Se hace una variable para ir evaluar si es la mayor
		
		for(int i = 0; i < mi_lista.size(); i++)
		{
			if (mayor < mi_lista.get(i))// Se evalua si la variable es mayor a numero que tire la lista
			{
				mayor = mi_lista.get(i); // Si el numero de la lista es mayor se convierte en el valor de la variable
			}
		}
		return mayor; // Devuelve la respuesta
	}
	
	//Devuelve true si 'mi_lista' contiene 'str' de lo contrario devuelve false
	static boolean existe(ArrayList<String> mi_lista, String str)
	{
		for(int i = 0; i < mi_lista.size(); i++) //Se hace "for" para hacer un contador y recorrer la lista 
		{
			if (mi_lista.get(i) == str); // Se comparan las strings para ver si es igual a str 
			{
				return true; // Si esta condicion se cumple se hace verdad 
			}
		}
		return false; // Si la condicion no se cumple devuelve falso
	}
	
	public static void main(String[] args)
	{ 
	
	}

}

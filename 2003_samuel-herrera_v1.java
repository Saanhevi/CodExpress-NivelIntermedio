import java.util.Scanner;
class Stack<T>{
    //Se implementará la pila con el uso de un arreglo
    T arreglo [];
    int size;
    int capacidad;
    
    public Stack(int capacidad){
        this.capacidad = capacidad;
        arreglo = (T[]) new Object[capacidad];
        size = 0;
    }
    
    
    //La complejidad será O(1) debido a que se tiene un apuntador al top de la pila
    public T peek(){
        if(size() == 0){
            throw new RuntimeException("La pila esta vacia");
            
        }
        
        return arreglo[size-1];
    }
    
    //La complejidad es O(1) ya que tambien se usa el mismo apuntador al top de la pila
    public void push(T item){
        if(size == capacidad){
            throw new RuntimeException("La pila esta llena");
        }

        arreglo[size] = item;
        size++;
    }
    
    //La complejidad es O(1) ya que tambien se usa el mismo apuntador al top de la pila
    public T pop(){
        if(size == 0){
            throw new RuntimeException("La pila esta vacia");
        }
        
        T valor = arreglo[size-1];
        size--;
        return valor;
    }
    
    //La complejidad es O(1) ya que tambien se usa el mismo apuntador al top de la pila
    public int size(){
        return size;
    }
    
    
}


public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Stack stack = new Stack<Integer>(10);
	    
	    System.out.println("Puedes usar los siguientes comandos: ");
	    System.out.print("PUSH , POP , PEEK, SIZE");
	    
	    while(sc.hasNext()){
	        String comando = sc.nextLine().trim();
	        
	        if(comando.startsWith("PUSH")){
	            String numero = comando.substring(5);
	            stack.push(Integer(numero));
	            
	        }else if(comando.startsWith("POP")){
	            stack.pop();
	        }else if(comando.startsWith("PEEK")){
	            System.out.println(stack.peek());
	            
	        }else if(comando.startsWith("SIZE")){
	            System.out.println(stack.size());
	            
	        }else{
	            System.out.println("Error de comando");
	        }
	        
	        
	    }
	}
	
	/*Casos de prueba
	Caso 1:
	Entrada:
	PUSH 5
    PUSH 10
    SIZE
    PEEK
    POP
    POP
    
    Salida esperada:
    2
    10
    10
    5

	Caso 2:
	Entrada:
	PUSH 7
    PUSH 9
    PEEK
    SIZE
    POP
    SIZE
    
    Salida esperada:
    9
    2
    9
    1
    
    Caso 3:
    Entrada:
    PUSH 3
    PUSH 8
    PUSH 12
    SIZE
    PEEK
    POP
    PUSH 5
    PEEK
    SIZE
    POP
    POP
    POP
    
    Salida esperada:
    3
    12
    12
    5
    3
    5
    8
    3

	*/
}

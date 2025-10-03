import java.util.ArrayList;
import java.util.Scanner;

class ContactBook{
    
    ArrayList<Contact> listaContactos;
    int numContactos;
    public ContactBook(){
        listaContactos = new ArrayList<>();
        numContactos = 0;
    }
    
    //Inner class o clase interna
    private class Contact{
        private String nombre;
        private String apellido;
        private String email;
        private String telefono;
        
        public Contact(String nombre, String apellido, String email, String telefono){
            this.nombre = nombre;
            this.apellido = apellido;
            this.email = email;
            this.telefono = telefono;
        }
        
        //Se sobre escribe el toString para poder imprimirlo cuando se haga el List
        public String toString(){
            return apellido + "," +nombre +" <" +email +"> " +telefono;
        }
        
        public String getEmail(){
            return email;
        }
        
        public String getApellido(){
            return apellido;
        }
        
        public String getNombre(){
            return nombre;
        }
        
        public String getTelefono(){
            return telefono;
        }
    }
    
    public void addContact(String nom, String ape, String email, String tel ){
        for(int i=0; i<numContactos; i++){
            if(listaContactos.get(i).getEmail().equals(email)){
                throw new RuntimeException ("ERROR: DUP");
            }
            
        }
        
        Contact contacto = new Contact(nom, ape, email, tel);
        
        //Se busca la posicion de inserción
        int pos = numContactos;
        for(int i=0; i<numContactos; i++){
            Contact actual = listaContactos.get(i);
            int comparador = ape.compareTo(actual.getApellido());
            
            if(comparador < 0 || (comparador == 0 && nom.compareTo(actual.getNombre()) < 0)){
                //Se encuentra la posicion
                pos = i;
                break;
            }
            
        }
        
        
        listaContactos.add(pos, contacto);
        numContactos++;
    }
    
    public void deleteContact(String email){
        boolean encontrado = false;
        for(int i=0; i<numContactos; i++ ){
            if(listaContactos.get(i).getEmail().equals(email)){
                encontrado = true;
                listaContactos.remove(i);
                numContactos--;
            }
        }
        
        if(!encontrado){
            throw new RuntimeException("No existe el email " +email);
        }
    }
    
    public void listContact(){
        for(int i=0; i<numContactos;i++){
            System.out.println(listaContactos.get(i));
        }
    }
    
    public void findContact(String dato){
        String d = dato.toLowerCase();
        
        for(int i=0; i<numContactos; i++){
            if(listaContactos.get(i).getNombre().toLowerCase().contains(d) || 
            listaContactos.get(i).getApellido().toLowerCase().contains(d) ||
            listaContactos.get(i).getEmail().toLowerCase().contains(d) ){
                System.out.println((listaContactos.get(i)));
            }
            
        }
        
    }
    
    
}


public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ContactBook book = new ContactBook();
		String comando;
		
		System.out.println("Este programa es un ContactBook y sirve para hacer CRUD");
		System.out.println("Estan disponibles los siguientes comandos: ");
		System.out.print("ADD , DEL, FIND Y LIST \n");
		
		System.out.println("Haga un comando disponible: ");
		
		while(scanner.hasNextLine()){
		    comando = scanner.nextLine().trim();
		    
		    if(comando.startsWith("ADD")){
		        String atributos[] = comando.substring(4).split(";");
		        book.addContact(atributos[0],atributos[1],atributos[2],atributos[3]);
		        
		        
		    }else if (comando.startsWith("DEL")){
		        String email = comando.substring(4);
		        book.deleteContact(email);
		        
		    }else if (comando.startsWith("FIND")){
		        String dato = comando.substring(5);
		        book.findContact(dato);
		        
		    }else if (comando.startsWith("LIST")){
		        book.listContact();
		        
		    }else{
		        System.out.println("Error en el comando");
		        
		    }
		    
		/*
		    Caso 1:
		    Entrada:
		    ADD Juan;Perez;juan@gmail.com;1234
        ADD Maria;Lopez;maria@gmail.com;5678
        ADD Jose;Martinez;juan@gmail.com;9212
        
        Salida Esperada:
        Exception in thread "main" java.lang.RuntimeException: ERRO: DUP
        at ContactBook.addContact(Main.java:52)
        at Main.main(Main.java:135)
        
        Caso 2:
        Entrada:
        ADD Ana;Suarez;ana@mail.com;1111
        ADD Luis;Gomez;luis@mail.com;2222
        DEL ana@mail.com
        FIND Luis
        FIND Ana
        
        Salida Esperada:
        Gomez,Luis <luis@mail.com> 2222
        
        Caso 3:
        Entrada:
        ADD Pedro;Lopez;pedro@mail.com;3333
        ADD Ana;Gomez;ana@mail.com;4444
        ADD Marta;Gomez;marta@mail.com;5555
        LIST
        
        Salida Esperada:
        Gomez,Ana <ana@mail.com> 4444
        Gomez,Marta <marta@mail.com> 5555
        Lopez,Pedro <pedro@mail.com> 3333

		*/
		  
		}
	}
}

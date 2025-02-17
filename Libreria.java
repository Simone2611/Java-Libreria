import java.util.*;

public class Libreria{
    private Libro[] arr;
    // private int dim;

    public Libreria(){
        arr = new Libro[3];
    }

    public Libreria(int dim){
        arr = new Libro[dim];
    }

    public void Popola(){
        for(int i = 0; i < arr.length; i++){
            // arr[i] = new Libro();

          
        }
        arr[0] = new Libro("ciao", "ciao2", "ciao3", 1999);
        arr[1] = new Libro("Aiao2", "kgkgkg", "adasdasddsa", 2001);
        arr[2] = new Libro("bsdasdas", "Pino", "lkadkasd", 22222);
    }

    public Libreria(Libro[] arr) { // this.arr quello che gli do e arr è quello che gli passo tra parentesi per farli uguali
        this.arr = new Libro[arr.length];
        for(int i=0; i<arr.length; i++) {
            this.arr[i] = arr[i];
        }
    } 

    public String toString(){
        String print = "";
        for(int i = 0; i < arr.length; i++){
           print += "\n" + arr[i].toString();
        }
        return print;
    }

    public boolean equals(Libreria x){
        boolean check = true;

        if(x.arr.length != arr.length){
            check = false;
        }

        for(int i = 0; i < arr.length && check; i++ ){
            if(arr[i] != x.arr[i]){
                check = false;
            }
        }
        return check;
    }



    public void orderLibreria(){
        Arrays.sort(arr, new Comparator<Libro>() {

            @Override
            public int compare(Libro l1, Libro l2) {
               return l1.getAutore().compareTo(l2.getAutore());
            }
            
        });
    }

    public void orderYear(){
        Arrays.sort(arr, new Comparator<Libro>() {

            @Override
            public int compare(Libro l1, Libro l2) {
               return Integer.valueOf(l1.getYear()).compareTo(l2.getYear());
            }
            
        });
    }

    public Libro[] cercaLibroPerTitolo(String searchTitle){
        Libro[] find = new Libro[this.arr.length];
        

        for (int i = 0; i < this.arr.length; i++) {
            if(this.arr[i].getName().equals(searchTitle)){
                find[i] = this.arr[i];
            }
            
        }

        return find;
    }

    public Libro[] cercaLibroPerAutore(String searchAutore){
        Libro[] find = new Libro[this.arr.length];
        
        System.out.println(this.arr[1].getAutore());
        for (int i = 0; i < this.arr.length; i++) {
            if(this.arr[i].getAutore().equals(searchAutore)){
                find[i] = this.arr[i];
            }
            
        }

        return find;
    }

    
    public void delete(String ISBN){
        Libro[] find = new Libro[this.arr.length -1];
        

        for (int i = 0; i < this.arr.length; i++) {
            if(this.arr[i].getISBN().equals(ISBN)){
                
            }else{
                find[i] = this.arr[i];
            }
        }
        this.arr =  find;

    }

    public static void main(String[] args) {
        Libreria a;
        a = new Libreria();
        // b = new Libreria();
        a.Popola();
        // b.Popola();
        /* 
        a.orderYear();
        Libro[] find = a.cercaLibroPerTitolo("ciao");
       
        for (Libro libro : find) {
            if(libro != null){
                System.out.println(libro + "\n\n");
            }
           
        }

        Libro[] findAutore = a.cercaLibroPerAutore("Pino");
       
        for (Libro libro : findAutore) {
            if(libro != null){
                System.out.println(libro + "\n\n");
            }
           
        }

        a.delete("adasdasddsa");
        */
        Libro[] find = a.cercaLibroPerAutore("kgkgkg");
       

        for (Libro libro : find) {
            if(libro != null){
                System.out.println(libro.toString() + "\n\n");
            }
            
        }

        Libro[] findTitolo = a.cercaLibroPerTitolo("bsdasdas");
       

        for (Libro libro : findTitolo) {
            if(libro != null){
                System.out.println(libro.toString() + "\n\n");
            }
            
        }

        a.delete("lkadkasd");
        
        a.orderYear();
        System.out.println(a.toString() + "\n\n");
        // b.orderLibreria();
        // System.out.println(a.toString() + "\n\n");
        // if(a.equals(b)){
        //     System.out.println("banane sono tante, ma i kiwi sono pochi");
        // }
    }
}



// {nome: asdasdasd...nome: aaaa}, {nome: bbbbb....}

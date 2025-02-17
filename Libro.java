import java.util.*;


public class Libro {
    private String name;
    private String autore;
    private String ISBN;
    private int year;

    public Libro(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inserisci il nome: ");
        name = input.nextLine();

        System.out.println("Inserisci l'autore: ");
        autore = input.nextLine();
       
        System.out.println("Inserisci l'ISBN: ");
        ISBN = input.nextLine();

        System.out.println("Anno uscita: ");
        year = input.nextInt();

    }

    public Libro(String name,String autore,String ISBN,int year){
        this.name = name;
        this.autore = autore;
        this.ISBN = ISBN;
        this.year = year;

    }

    public Libro(Libro x){ // Serve per copiare qualcosa in 2 parti differenti della memoria quindi se modifico uno dei 2 l'altro non fa nulla
        name = x.getName();
        autore = x.getAutore();
        ISBN = x.getISBN();
        year = x.getYear();
    }

    public String getName(){
        return name;
    }
    public String getAutore(){
        return autore;
    }
    public String getISBN(){
        return ISBN;
    }
    public int getYear(){
        return year;
    }

    public void setNome(String name){
        this.name = name; // this.name si riferisce al nome di chi usa il metodo es: A.setNome("PINO") quindi il corrente nome di A diventa "PINO"
    }
    public void setAutore(String autore){
        this.autore = autore;
    }
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    public void setYear(int year){
        this.year = year;
    }

    public String toString(){
        return "Nome: " + name + "\nAutore: " + autore + "\nISBN: " + ISBN + "\nYear: " + year;
    }

    public boolean equals(Libro x){
        return x.name.equals(name) && x.autore.equals(autore) && x.ISBN.equals(ISBN) && x.year == year;
    }

    public boolean equalName(Libro x){
        return x.name.equals(name);
    }

    public boolean equalYear(Libro x){
        return x.year == year;
    }

    public static void main(String[] args) {
        Libro a,b,c; 
        a = new Libro(); // Dichiaro che al suo interno c'è un Libro() che poi verrà riempito dal codice di class Libro()
        b = new Libro("aaaa", "aaa2", "AAA_2222", 1999);
        c = new Libro(a);

       System.out.println( a.toString() + "\n\n" + b.toString() + "\n\n" + c.toString());
       if(c.equals(b) == true){
        System.out.println("Banane non più in vedita però ci sono i kiwi"); 
       }
    }

    // @Override
    // public int compareTo(Libro x) {
    //     return this.name.compareTo(x.name);
    // }
}

public class Libreria{
    private Libro[] arr;
    // private int dim;

    public Libreria(){
        arr = new Libro[2];
    }

    public Libreria(int dim){
        arr = new Libro[dim];
    }

    public void Popola(){
        for(int i = 0; i < arr.length; i++){
            arr[i] = new Libro();
        }
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

    public static void main(String[] args) {
        Libreria A,B;
        A = new Libreria();
        B = new Libreria();
        A.Popola();
        B.Popola();
        System.out.println(A.toString() + "\n\n" + B.toString());
        if(A.equals(B)){
            System.out.println("banane sono tante, ma i kiwi sono pochi");
        }
    }
}
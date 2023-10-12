public class Bingo {
    String B, I, N, G, O, Clap;
    static int M = 0;

    public Bingo(String B, String I, String N, String G, String O, String Clap){
        this.B = B;
        this.I = I;
        this.N = N;
        this.G = G;
        this.O = O;
        this.Clap = Clap;
        M++;
    }

    public void display(){
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
        if(M == 1){
            System.out.println(B+"-"+I+"-"+N+"-"+G+"-"+O);
            System.out.println(B+"-"+I+"-"+N+"-"+G+"-"+O);
            System.out.println(B+"-"+I+"-"+N+"-"+G+"-"+O);            
        }else if(M == 2){
            System.out.println(Clap+"-"+I+"-"+N+"-"+G+"-"+O);
            System.out.println(Clap+"-"+I+"-"+N+"-"+G+"-"+O);
            System.out.println(Clap+"-"+I+"-"+N+"-"+G+"-"+O);
        }else if(M == 3){
            System.out.println(Clap+"-"+Clap+"-"+N+"-"+G+"-"+O);
            System.out.println(Clap+"-"+Clap+"-"+N+"-"+G+"-"+O);
            System.out.println(Clap+"-"+Clap+"-"+N+"-"+G+"-"+O);
        }else if(M == 4){
            System.out.println(Clap+"-"+Clap+"-"+Clap+"-"+G+"-"+O);
            System.out.println(Clap+"-"+Clap+"-"+Clap+"-"+G+"-"+O);
            System.out.println(Clap+"-"+Clap+"-"+Clap+"-"+G+"-"+O);
        }else if(M == 5){
            System.out.println(Clap+"-"+Clap+"-"+Clap+"-"+Clap+"-"+O);
            System.out.println(Clap+"-"+Clap+"-"+Clap+"-"+Clap+"-"+O);
            System.out.println(Clap+"-"+Clap+"-"+Clap+"-"+Clap+"-"+O);
        }else if(M == 6){
            System.out.println(Clap+"-"+Clap+"-"+Clap+"-"+Clap+"-"+Clap);
            System.out.println(Clap+"-"+Clap+"-"+Clap+"-"+Clap+"-"+Clap);
            System.out.println(Clap+"-"+Clap+"-"+Clap+"-"+Clap+"-"+Clap);
        }
        System.out.println("And Bingo was his name-o.");
        System.out.println("");
    }
}

public class Matematika implements InterfaceMatematika{
    int hasil;

    public void pertambahan(int a, int b){
        hasil = a+b;
        System.out.println("Pertambahan : "+a+" + "+b+" = "+hasil);
    }

    public void pengurangan(int a, int b){
        hasil = a-b;
        System.out.println("Pengurangan : "+a+" - "+b+" = "+hasil);
    }

    public void perkalian(int a, int b){
        hasil = a*b;
        System.out.println("Perkalian : "+a+" * "+b+" = "+hasil);
    }

    public void pembagian(int a, int b){
        hasil = a/b;
        System.out.println("Pembagian : "+a+" / "+b+" = "+hasil);
    }
}
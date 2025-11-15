class Laptop{
    String Brand;
    int RAM;
    int Price;
    Laptop(String Brand,int RAM,int Price){
        this.Brand=Brand;
        this.RAM=RAM;
        this.Price=Price;
    }
        void display(){
            System.out.println("Laptop Name:"+" "+Brand);
            System.out.println("Ram:"+" "+RAM);
            System.out.println("Price:"+" "+Price);
        }
}
public class LaptopWithBrand{
    public static void main(String[] args) {
        Laptop L1=new Laptop("hp 435 g8",16,150000);
        
    Laptop L2=new Laptop("ASUS vivo",15,53000);
    // 
        L1.display();
        L2.display();
    }
}
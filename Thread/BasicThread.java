class myThread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i+"Raunak wa");
            try{   //isko run time me time lene ke liye use kiya jata  hai sleep ka use katre 
                Thread.sleep(3000);

                
            } catch (Exception e) {
            }
        }
    }

}
class BasicThread{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
         myThread obj =new myThread();
        obj.start();
        try {  //isko pahle raun karne ke liye join ka use kiya jata hai......
            obj.join();
        } catch (Exception e) {
        }
        for(int i=0;i<5;i++){
            System.out.println(i+"Raj wa");
        }
       
    }
}
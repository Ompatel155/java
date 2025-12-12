// Linear Search : - isme ek Array or ek variable lete hai or us variable 
//  ki value ko compare karte hai ki Array me hai ki nahi
class LinearSearch{
    public static void main(String[] args) {
        int arr[]={2,3,5,7,11,13,17,23,29};
        int x=2;
        boolean flag =false;
       for(int i=0;i<arr.length;i++){
        if(arr[i]==x){
            flag=true;
            break;

        }
       }
       if(flag==false){
        System.out.println("nahi milaaaaa..");
       }
       else{
        System.out.println("mil gayaaa......");
       }
            
        }
            
        }
    

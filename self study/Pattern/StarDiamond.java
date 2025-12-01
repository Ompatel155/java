class StarDiamond{
    public static void main(String[] args) {
        for(int i=0;i<6;i++){
            for(int j=6;j>i;j--){
                System.out.print("  ");
            }
            for(int k=1;k<i;k++){
                System.out.print("* ");
            }
            for(int l=0;l<i;l++){
                System.out.print("* ");
            }
            System.err.println("");  
        }
        for(int i=0;i<6;i++){
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            for(int k=5;k>i;k--){
                System.out.print("* ");
            }
            for(int l=6;l>i;l--){
                System.out.print("* ");
            }
            System.err.println("");
        }
        }
    }

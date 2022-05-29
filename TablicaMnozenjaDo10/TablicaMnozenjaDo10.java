class TablicaMnozenjaDo10{
    public static void main(String[] args){
        for(int vrsta = 1; vrsta <= 10; vrsta++){
            for(int kolona = 1; kolona <= 10; kolona++)
                System.out.printf("%5d", vrsta * kolona);
            System.out.println();
        }
    }
}
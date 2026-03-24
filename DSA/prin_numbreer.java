public class prin_numbreer {
    static void printname(int num){
        if(num == 0){
            return;
        }
        printname(num - 1);
        System.out.println(num);
        
    }
    public static void main(String[] args) {
            printname(5);
        
    }
}

public class Question15 {
    public static void main(String[] args) throws InterruptedException {
//make a Christmas tree
        String space = " ";
        String star = "* ";
        int row = 6;
        for (int i =row; i>=0; i--){
            for (int j=i; j>0; j--){
                System.out.print(space);
                Thread.sleep(150);
            }for (int k=i; k<row; k++){
                System.out.print(star);
                Thread.sleep(150);
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int one=scanner.nextInt();
        int one1=(int) Math.sqrt(one);
        int on2=(int) Math.pow(one1,2);
        if (one!=on2){
            throw new Error();
        }else {
            System.out.println("kvadrat");
        }



    }
}
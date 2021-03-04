import java.util.Scanner;

class Questions{
    public void Q1(){
        Scanner r=new Scanner(System.in);

        int a = r.nextInt();
        // we can solve the later problem by introducint r.nextLine() here so that the enter press goes here and the string goes in to the memory location.
        String str = r.nextLine();
        char ch = str.charAt(0); // this will error because after entering the number when we press enter, the nextLine() function takes the enter or return as the input throws an exception of IndexOutOfBoundsException.
        System.out.println(ch);
    }
}

public class ScannerQuestions{
    public static void main(String[] args){
        Questions questions=new Questions();

        questions.Q1();
    }
}
class Questions{
    public void Q1(){

        // operator precedence is (*, /, %) > (+,-)

        int a = 2 * 3 % 2; // since they have same precedence, the expression would be evaluated form left to right.
        int b = 10 * 20 / 10 + 3 - 2 ;  // since *, / have the same precedence and + and - have the same precedence the compiler would start the evaluation from left to right. 

        System.out.println(a);
        System.out.println(b);
    }

    public void Q2(){
        double a = 2/5; // since both are integers, the answer will be a integer.
        double b = 2.0/5; // will be converted automatically to double because double takes 8 bytes and int takes 4 bytes.

        System.out.println(a);
        System.out.println(b);
    }
}


public class ArithmeticOperationsQuestions{
    public static void main(String[] args){
        Questions questions=new Questions();

        questions.Q2();
    }
}
class Questions{
    public void Q1(){
        int x = 0;

        if(x){ // this will give compilation error because if can only take boolean values.
            System.out.println("Inside If");
        }
        else{
            System.out.println("Inside Else");
        }
    }
}


public class ConditionalsQuestions{
    public static void main(String[] args){
        Questions questions = new Questions();

        questions.Q1();
    }
}
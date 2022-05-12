package exception_handling;

public class MinAge_CustomException {

    public String EligibleAge(int age) throws AgeEligibility_Custom_Exception{

        if(age<18){
            //throws exception

            throw new AgeEligibility_Custom_Exception("Minimum age for voting is 18");
        }
        else{
            return"Eligible for voting";
        }
    }

    public static void main(String[] args) {
        MinAge_CustomException obj= new MinAge_CustomException();
        try {
            System.out.println(obj.EligibleAge(17));
        } catch (AgeEligibility_Custom_Exception e) {
            e.printStackTrace();
        }

    }
}

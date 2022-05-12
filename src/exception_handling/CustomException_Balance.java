package exception_handling;

public class CustomException_Balance {

    public String openAccount(double balance) throws MinBalanceException{

        if(balance<5000){

            //throw exceptions

            throw new MinBalanceException("Minimum amount should be 5000 to open an account ");
        }
        else
        {
            return "Account opened successfully";
        }
    }

    public static void main(String[] args) {

        CustomException_Balance obj = new CustomException_Balance();
        try {
            System.out.println(obj.openAccount(5000));
        } catch (MinBalanceException e) {
            e.printStackTrace();
        }
    }
}

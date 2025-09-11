public class Method_Overriding {
    static class Bank{
        public void RateOfInterest(){
            System.out.println("Rate is 5%");
        }
    }
    static class SBI extends Bank{
        public void RateOfInterest(){
            System.out.println("Rate is 7%");
        }
    }
    public static void main(String[] args) {
        SBI obj=new SBI();
        obj.RateOfInterest();
    }
}

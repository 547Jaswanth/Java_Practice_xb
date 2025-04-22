package javaPractice;

public class OtpGenarator {
    public static void main(String[] args) {
        int min=100000;
        int max=999999;

        System.out.println((int)(Math.random()*(max-min+1))+min);
    }
}

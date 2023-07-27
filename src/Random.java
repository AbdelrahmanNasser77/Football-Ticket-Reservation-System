public class Random {


    public static String getRandomNumberCategoryA() {
        int num = (int) (Math.random() * 100);
        String numStr = String.format("%02d", num);
        return "1" + numStr;
    }

    public static String getRandomNumberCategoryB() {
        int number = (int) (Math.random() * 300 + 100);
        return String.valueOf(number);
    }

    public static String getRandomNumberCategoryC() {
        int secondDigit = (int) (Math.random() * 10);
        int thirdDigit = (int) (Math.random() * 10);
        int firstDigit = (int) (Math.random() * 2 + 1);
        int number = firstDigit * 100 + secondDigit * 10 + thirdDigit;
        return String.valueOf(number);
    }


}

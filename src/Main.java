public class Main {
    public static void main(String[] args) {
        String phone = "59604157537";
        if (phone.length() ==10) {
            phone = "+7" + phone;
        } else if (phone.length() >11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length()<10) {
            throw  new RuntimeException(" Телефон слишком короткий");
            
        } else if ((phone.length() == 11) && (phone.charAt(0) != '7')) {
            throw new RuntimeException("Среди нас посторонний");
        }
        System.out.println("phone = " + phone);


    }
}
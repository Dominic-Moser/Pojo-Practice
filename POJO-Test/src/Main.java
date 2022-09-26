public class Main {
    public static void main(String[] args) throws Exception {
        Baby newBaby1 = new Baby("Danial", 8.4);
        System.out.println(newBaby1.getBabyName());
        newBaby1.setBabyName("Benjamin");
        System.out.println(newBaby1.getBabyName());
    }
}

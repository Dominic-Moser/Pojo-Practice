public class Baby {
    private String babyName;
    private double babyWeight;

    public Baby(String a, double b)
    {
        babyName = a;
        babyWeight = b;
    }
    public String getBabyName()
    {
        return babyName;
    }
    public double getBabyWeight()
    {
        return babyWeight;
    }
    
    public void setBabyName(String a)
    {
        babyName = a;
    }
    public void setBabyWeight(double b)
    {
        babyWeight = b;
    }

    public static void babyCry()
    {
        System.out.println("WAAAAAAAAAAAAAAAA");
    }
}

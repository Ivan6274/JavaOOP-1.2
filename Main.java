public class Main {
    public static void main(String[] args) {
        IWBService service = new IWBService();
        float ibw = service.calculate( 90.7f,182.5f);
        System.out.println("Your IBW = " + ibw);
    }
}
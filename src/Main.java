public class Main {
    //введите рост в метрах
    // а вес в килограммах
    public static void main(String[] args) {
        BmiService service =new BmiService();
        double weight=65.6;
        double growth=1.78;
        double res= service.calculate(weight,growth);
        System.out.println("Индекс массы тела: "+ res);
    }
}

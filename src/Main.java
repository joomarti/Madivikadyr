//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Country country = new Country("kyrgyz",2000,7000,"kyrgyz");
        Country country1 = new Country("kazak",3000,10000,"kazak");
        Country country2= new Country("ozbek",1500,1500,"ozbek");
        Country[] arrau =  {country2,country1,country};
        Country[] countries =  {country,country1,country2};
        for (Country country3: countries){
            System.out.println(country3);

        }
        System.out.println(Country.getaian(arrau)+":-------uzun aiant");

    }
}
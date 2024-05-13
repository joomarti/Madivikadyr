public class Country {
    private String aty;
    private int ayanty;
    private int kalky;
    private String tili;


    public Country(String aty, int ayanty, int kalky, String tili) {
        this.aty = aty;
        this.ayanty = ayanty;
        this.kalky = kalky;
        this.tili = tili;

    }



    public static int getaian(Country[] arrau) {
        int max = arrau.length;
        for (int i = 1; i < arrau.length; i++) {
            if (arrau[i].ayanty > max) {
                max = arrau[i].ayanty;
            }
        }
        return max;
    }

    @Override
    public String toString() {
        return "Country{" +
                "aty='" + aty + '\'' +
                ", ayanty=" + ayanty +
                ", kalky=" + kalky +
                ", tili='" + tili + '\'' +
                '}';
    }
}





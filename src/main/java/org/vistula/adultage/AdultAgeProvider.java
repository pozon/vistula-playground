package org.vistula.adultage;

public class AdultAgeProvider {

    public static int getAdultAge(String country){

        if (country.equals("")) {
            throw new RuntimeException("Pusty kraj!");
        }
//elo 420
        if (country.equals("USA") || country.equals("United States") ){
            return 21;
        }
        else{
            return 18;
        }
    }
}

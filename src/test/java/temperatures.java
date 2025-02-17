public class temperatures {
    public static void main(String[] args) {
        // Find the Highest temp and Lowest temp

        double [] temperature={97.0, 88.0, 66.0};

        double highTemp=temperature[0];
        double lowtemp=temperature[0];
        for (int t=0; t<temperature.length; t++){
            if(temperature[t]>highTemp){
                highTemp=temperature[t];
            }
            if (temperature[t]<lowtemp){
                lowtemp=temperature[t];
            }
        }
        System.out.println("Highest temperature :"+highTemp);
        System.out.println("Lowest temperature :"+lowtemp);

    }

}

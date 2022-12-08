public class Plane {
    private String[] passengerNames = new String[6];

    public void setPassengerNames(String[] passengerNames) { this.passengerNames = passengerNames;
    }
        public String [] getPassengerNames () { return passengerNames;}

    public String getPassenger (int index) {
        return passengerNames[index];}
}

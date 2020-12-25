public class Hotel {
    private int rentDay;
    private String kindOfRom;
    private Person client;


    public Hotel(int rentDay, String kindOfRom, Person client) {
        this.rentDay = rentDay;
        this.kindOfRom = kindOfRom;
        this.client = client;
    }
    public String getClientId(){
        return this.client.getPeopleID();
    }
    public int getTotalMoney(){
        return rentDay*setPrice();
    }

    public int setPrice() {
        int price = 0;
        switch (this.kindOfRom){
            case "small":
                price = 2000;
                break;
            case "normal":
                price = 3000;
                break;
            case "luxury":
                price = 4000;
                break;
        }
        return price;
    }

    public Person getClient() {
        return client;
    }

    @Override
    public String toString() {

        return  "Hotel{" +
                "rentDay = " + rentDay +
                ", kindOfRom = '" + kindOfRom + '\'' +
                ", priceOfRom = " + setPrice() +
                ", person = " + client +
                '}' + "\n";
    }
}

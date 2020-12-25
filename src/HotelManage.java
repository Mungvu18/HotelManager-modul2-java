import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HotelManage {
    Map<String,Hotel> listClients = new TreeMap<>();
    public void addNew(Hotel hotel){
        String key = hotel.getClientId();
        listClients.put(key,hotel);
    }
    public void displayAll(){
        System.out.println(listClients);
    }
    public void priceOfClient(String clientId){
        Set<String> listClientId = listClients.keySet();
        for (String id: listClientId) {
            Hotel hotel = listClients.get(id);
            boolean isTrueClientId = hotel.getClientId().equals(clientId);
            if(isTrueClientId){
                int totalMoney = hotel.getTotalMoney();
                String nameOfClient = hotel.getClient().getName();
                System.out.println("Money of client "+ nameOfClient +" is "+totalMoney);
                listClients.remove(id);
            }
        }
    }
}

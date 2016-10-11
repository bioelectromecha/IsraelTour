package roman.com.israeltour.data.datasources;

import java.util.ArrayList;
import java.util.List;

import roman.com.israeltour.data.dataobjects.Food;
import roman.com.israeltour.data.dataobjects.History;
import roman.com.israeltour.data.dataobjects.Person;
import roman.com.israeltour.data.dataobjects.Place;


public final class DataLoader {

    /**
     * load the places data into a list
     * @return a list of place objects
     */
    public static List<Place> getPlaceList() {
        List<Place> placesList = new ArrayList<>();
        for (PlaceData placeData : PlaceData.values()) {
            Place tempPlaceListObject = new Place(placeData.getName(), placeData.getDescription(), placeData.getDrawableId());
            placesList.add(tempPlaceListObject);
        }
        return placesList;
    }

    /**
     * load the people data into a list
     * @return
     */
    public static List<Person> getPersonList() {
        List<Person> personList = new ArrayList<>();
        for (PersonData personData : PersonData.values()) {
            Person personObject = new Person(personData.getNameId(), personData.getDescriptionId());
            personList.add(personObject);
        }
        return personList;
    }

    /**
     * load the history data into a list
     * @return
     */
    public static List<History> getHistoryList() {
        List<History> personList = new ArrayList<>();
        for (HistoryData historyData : HistoryData.values()) {
            History historyObj = new History(historyData.getNameId(), historyData.getDescriptionId());
            personList.add(historyObj);
        }
        return personList;
    }

    /**
     * load the food data into a list
     * @return
     */
    public static List<Food> getFoodList() {
        List<Food> foodList = new ArrayList<>();
        for (FoodData foodData : FoodData.values()) {
            Food foodObj = new Food(foodData.getNameId(), foodData.getDescriptionId());
            foodList.add(foodObj);
        }
        return foodList;
    }


}

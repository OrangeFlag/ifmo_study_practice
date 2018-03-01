package model;

import java.util.List;

public class Dish {
    private String name;
    private String descriptions;
    private List<String> listOfIngridients;
    private String recipe;

    public Dish(String name)
    {
        this.name = name;
        descriptions = null;
        listOfIngridients = null;
        recipe = null;
    };
    public Dish(String name, String descriptions, List<String> listOfIngridients, String recipe)
    {
        this.name = name;
        this.descriptions = descriptions;
        this.listOfIngridients = listOfIngridients;
        this.recipe = recipe;
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public List<String> getListOfIngridients() {
        return listOfIngridients;
    }

    public void setListOfIngridients(List<String> listOfIngridients) {
        this.listOfIngridients = listOfIngridients;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

}

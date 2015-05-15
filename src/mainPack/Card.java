package mainPack;

/**
 * Created by Dan Blocker on 5/14/2015.
 */
public class Card {
    private String name;
    private String type;
    private String power;
    private String tough;
    private String color;
    private String rarity;
    private String specialKey;

    public Card(){

    }
    public Card(String name, String type, String power, String tough, String color, String rarity, String specialKey){
        this.type = type;
        this.power = power;
        this.tough = tough;
        this.color = color;
        this.rarity = rarity;
        this.specialKey = specialKey;
        this.name = name;
    }

    public String getType(){
        return type;
    }
    public String getColor(){
        return color;
    }
    public String getPower(){
        return power;
    }
    public String getTough(){
        return tough;
    }
    public String getRarity(){
        return rarity;
    }
    public String getSpecialKey(){
        return specialKey;
    }
    public String getName(){
        return name;
    }
}

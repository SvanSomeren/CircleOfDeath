package svansomeren.circleofdeath.models;

public class Card {
    private String type;
    private String number;
    private String rule;

    public Card(){

    }

    public Card(String type, String number, String rule) {
        this.type = type;
        this.number = number;
        this.rule = rule;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }
}

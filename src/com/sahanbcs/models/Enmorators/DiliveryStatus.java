package com.sahanbcs.models.Enmorators;

//import com.fasterxml.jackson.annotation.JsonCreator;

public enum DiliveryStatus {
    DELIVERYREPORTNOTREQUIRED("0"), DELIVERYREPORTREQUIRED("1");

    private String text;

    DiliveryStatus(String text) {
        this.text=text;
    }

    public String getText(){return this.text;}


    @Override
    public String toString() {
        return text;
    }

//    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static DiliveryStatus fromText(String text){
        for(DiliveryStatus r : DiliveryStatus.values()){
            if(r.getText().equals(text)){
                return r;
            }
        }
        throw new IllegalArgumentException();
    }

}

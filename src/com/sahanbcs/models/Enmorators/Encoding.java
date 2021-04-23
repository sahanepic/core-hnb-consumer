package com.sahanbcs.models.Enmorators;


//import com.fasterxml.jackson.annotation.JsonCreator;

public enum Encoding {
    Text("0") , Flashsms("240"), Binarysms("245");
    private String text;

    Encoding(String text) {
        this.text=text;
    }

    public String getText(){return this.text;}


    @Override
    public String toString() {
        return text;
    }

//    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static Encoding fromText(String text){
        for(Encoding r : Encoding.values()){
            if(r.getText().equals(text)){
                return r;
            }
        }
        throw new IllegalArgumentException();
    }
}

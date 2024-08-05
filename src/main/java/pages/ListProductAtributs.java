package pages;

public  class ListProductAtributs {
    private String name;
    private String size;
    private String color;
    private String price;

    void setName(String aName){
        name=aName;
    }
    public String getName(){
        return name;
    }

    void setSize(String aSize){
        size=aSize;
    }
    public String getSize(){
         return size;
    }
    void setColor(String aColor){
        color=aColor;
    }
    public String getColor(){
        return color;
    }
    void setPrice(String aPrice){
        price=aPrice;
    }
    public String getPrice(){
        return price;
    }

}

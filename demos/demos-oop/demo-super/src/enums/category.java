package enums;
public enum category {
    FOOD("Alimentación"), DRUGSTORE("Droguería"), HYGYIENE("Higiene"), PETS("Mascotas");
    String name;
    category(String name){
        this.name=name;
    }
    @Override
    public String toString(){
        return this.name;
    }
}





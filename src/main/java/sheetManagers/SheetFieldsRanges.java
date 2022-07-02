package sheetManagers;

public enum SheetFieldsRanges {
    TEST_RANGE("Arkusz1!A1");

   private String value;


    private SheetFieldsRanges(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }

//    public void setValue(String value){
//        this.value = value;
//    }
}

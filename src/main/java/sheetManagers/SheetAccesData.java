package sheetManagers;

public enum SheetAccesData {
    API_KEY("AIzaSyCX6ENX6MGx0hhCfwlPYRVY5EkcIsYygY8"),
    APPLICATION_NAME("Hello Futurum"),
    SPREADSHEET_ID("1JuRx1GO7fH9ynSLzhLZ4FVE_MTyzO9Xbx79G-k8op4A");

   private String value;


    private SheetAccesData(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }

   // public void setValue(String value){this.value = value;}
}

package run;

import sheetManagers.GetValues;
import sheetManagers.SheetAccesData;
import sheetManagers.SheetFieldsRanges;

import java.io.IOException;
import java.util.List;

public class Test {

    public static void main(String[] args) throws IOException {

        GetValues gV = new GetValues();
        List<List<Object>> l1 = gV.getValues(SheetAccesData.SPREADSHEET_ID.getValue(), SheetFieldsRanges.TEST_RANGE.getValue());

        System.out.println(l1.get(0).get(0));

    }
}

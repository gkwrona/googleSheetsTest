package sheetManagers;

import com.google.api.client.googleapis.json.GoogleJsonError;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.ValueRange;
import com.google.auth.http.HttpCredentialsAdapter;
import com.google.auth.oauth2.GoogleCredentials;

import java.io.IOException;
import java.util.Collections;
import java.util.List;



/* Class to demonstrate the use of Spreadsheet Get Values API */
public class GetValues {

    private Sheets getSheets() {
        NetHttpTransport transport = new NetHttpTransport.Builder().build();
        JacksonFactory jsonFactory = JacksonFactory.getDefaultInstance();
        HttpRequestInitializer httpRequestInitializer = request -> {
            request.setInterceptor(intercepted -> intercepted.getUrl().set("key", SheetAccesData.API_KEY.getValue()));
        };

        return new Sheets.Builder(transport, jsonFactory, httpRequestInitializer)
                .setApplicationName(SheetAccesData.APPLICATION_NAME.getValue())
                .build();
    }

    public List<List<Object>> getValues(String spreadsheetId, String range) throws IOException {
        return getSheets()
                .spreadsheets()
                .values()
                .get(spreadsheetId, range)
                .execute()
                .getValues();
    }


}
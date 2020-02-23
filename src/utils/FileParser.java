package utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.*;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class FileParser {

    private final static String mockJSON = "C:\\Users\\Admin\\IdeaProjects\\test-jdbc-one-otomazia\\MOCK_DATA.json";

    public static ArrayList<DataTable> parser() throws IOException, ParseException {
        ArrayList<DataTable> dataTables = new ArrayList<>();
        Gson gson = new Gson();
        Type listType = new TypeToken<List<DataTable>>(){}.getType();
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(mockJSON)));
        List<DataTable> dataTableList = gson.fromJson(reader, listType);

        for (DataTable element : dataTableList) {
            DataTable dataTable = new DataTable.Builder()
                    .setMga_dc_banks_activity(new MGA_DC_BANKS_ACTIVITY.Builder()
                            .setDEPARTMENT_ID(element.getMga_dc_banks_activity().getDEPARTMENT_ID())
                            .setDEBTS_ACTIVITY_ID(element.getMga_dc_banks_activity().getDEBTS_ACTIVITY_ID())
                            .setBANK_ID(element.getMga_dc_banks_activity().getBANK_ID())
                            .setREQUEST_TYPE_ID(element.getMga_dc_banks_activity().getREQUEST_TYPE_ID()).build())
                    .setMga_dc_debts(new MGA_DC_DEBTS.Builder()
                            .setIDENTIFIER(element.getMga_dc_debts().getIDENTIFIER())
                            .setSERVICE_TYPE(element.getMga_dc_debts().getSERVICE_TYPE())
                            .setSOURCE_ID(element.getMga_dc_debts().getSOURCE_ID())
                            .setDEBT_ID(element.getMga_dc_debts().getDEBT_ID())
                            .setLOAD_GROUP_ID(element.getMga_dc_debts().getLOAD_GROUP_ID()).build())
                    .setMga_dc_debts_activities(new MGA_DC_DEBTS_ACTIVITIES.Builder()
                            .setDEPARTMENT_ID(element.getMga_dc_debts_activities().getDEPARTMENT_ID())
                            .setDEBT_GROUP_ID(element.getMga_dc_debts_activities().getDEBT_GROUP_ID())
                            .setMAIN_PRO_ID(element.getMga_dc_debts_activities().getMAIN_PRO_ID())
                            .setSUB_PRO_ID(element.getMga_dc_debts_activities().getSUB_PRO_ID())
                            .setSTATUS_ID(element.getMga_dc_debts_activities().getSTATUS_ID()).build())
                    .setMga_dc_load_groups(new MGA_DC_LOAD_GROUPS.Builder()
                            .setSOURCE_ID(element.getMga_dc_load_groups().getSOURCE_ID())
                            .setLOAD_GROUP_TYPE_ID(element.getMga_dc_load_groups().getLOAD_GROUP_TYPE_ID()).build())
                    .build();
            dataTables.add(dataTable);
        }
        for (DataTable dataTable: dataTables) {
            dataTable.toString();
        }
        return dataTables;
    }
}

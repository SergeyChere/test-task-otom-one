package utils;

import com.google.gson.*;
import model.*;

import java.lang.reflect.Type;

public class DataTableDeserialization implements JsonDeserializer<DataTable> {
    @Override
    public DataTable deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        DataTable dataTable = new DataTable.Builder()
                .setMga_dc_banks_activity(new MGA_DC_BANKS_ACTIVITY.Builder()
                        .setBANK_ACTIVITY_ID(jsonObject.get("BANK_ACTIVITY_ID").getAsInt())
                        .setDEPARTMENT_ID(jsonObject.get("DEPARTMENT_ID").getAsInt())
                        .setDEBTS_ACTIVITY_ID(jsonObject.get("DEBTS_ACTIVITY_ID").getAsInt())
                        .setBANK_ID(jsonObject.get("BANK_ID").getAsInt())
                        .setREQUEST_TYPE_ID(jsonObject.get("REQUEST_TYPE_ID").getAsInt())
                        .build())
                .setMga_dc_debts(new MGA_DC_DEBTS.Builder()
                        .setDEBTOR_ID(jsonObject.get("DEBTOR_ID").getAsInt())
                        .setIDENTIFIER(jsonObject.get("IDENTIFIER").getAsInt())
                        .setSERVICE_TYPE(jsonObject.get("SERVICE_TYPE").getAsInt())
                        .setSOURCE_ID(jsonObject.get("SOURCE_ID").getAsInt())
                        .setSOURCE_ID(jsonObject.get("DEBT_ID").getAsInt())
                        .setLOAD_GROUP_ID(jsonObject.get("LOAD_GROUP_ID").getAsInt())
                        .build())
                .setMga_dc_debts_activities(new MGA_DC_DEBTS_ACTIVITIES.Builder()
                        .setDEBTS_ACTIVITY_ID(jsonObject.get("DEBTS_ACTIVITY_ID").getAsInt())
                        .setDEPARTMENT_ID(jsonObject.get("DEPARTMENT_ID").getAsInt())
                        .setDEBT_GROUP_ID(jsonObject.get("DEBT_GROUP_ID").getAsInt())
                        .setMAIN_PRO_ID(jsonObject.get("MAIN_PRO_ID").getAsInt())
                        .setSUB_PRO_ID(jsonObject.get("SUB_PRO_ID").getAsInt())
                        .setSTATUS_ID(jsonObject.get("STATUS_ID").getAsInt())
                        .build())
                .setMga_dc_load_groups(new MGA_DC_LOAD_GROUPS.Builder()
                        .setLOAD_GROUP_ID(jsonObject.get("LOAD_GROUP_ID").getAsInt())
                        .setSOURCE_ID(jsonObject.get("SOURCE_ID").getAsInt())
                        .setLOAD_GROUP_TYPE_ID(jsonObject.get("LOAD_GROUP_TYPE_ID").getAsInt())
                        .build())
                .build();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String prettyJson = gson.toJson(dataTable);
        System.out.println(prettyJson);
        return dataTable;
    }
}

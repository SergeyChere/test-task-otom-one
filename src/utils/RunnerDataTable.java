package utils;

import model.*;

import java.util.ArrayList;
import java.util.Random;

public class RunnerDataTable {
    ArrayList<DataTable> dataTables = new ArrayList<>();
    Random random = new Random();
    public ArrayList<DataTable> createDataTables() {
        for (int i = 0; i<1000; i++) {
            DataTable dataTable = new DataTable.Builder()
                    .setMga_dc_banks_activity(new MGA_DC_BANKS_ACTIVITY.Builder()
                            .setDEPARTMENT_ID(random.nextInt())
                            .setDEBTS_ACTIVITY_ID(random.nextInt())
                            .setBANK_ID(random.nextInt())
                            .setREQUEST_TYPE_ID(random.nextInt())
                            .build())
                    .setMga_dc_debts(new MGA_DC_DEBTS.Builder()
                            .setIDENTIFIER(random.nextInt())
                            .setSERVICE_TYPE(random.nextInt())
                            .setSOURCE_ID(random.nextInt())
                            .setDEBT_ID(random.nextInt())
                            .setLOAD_GROUP_ID(random.nextInt())
                            .build())
                    .setMga_dc_debts_activities(new MGA_DC_DEBTS_ACTIVITIES.Builder()
                            .setDEPARTMENT_ID(random.nextInt())
                            .setDEBT_GROUP_ID(random.nextInt())
                            .setMAIN_PRO_ID(random.nextInt())
                            .setSUB_PRO_ID(random.nextInt())
                            .setSTATUS_ID(random.nextInt())
                            .build())
                    .setMga_dc_load_groups(new MGA_DC_LOAD_GROUPS.Builder()
                            .setSOURCE_ID(random.nextInt())
                            .setLOAD_GROUP_TYPE_ID(random.nextInt())
                            .build())
                    .build();
            dataTables.add(dataTable);
        }
        return dataTables;
    }
}

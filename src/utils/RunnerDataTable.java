package utils;

import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/*
This class just create data for insertion to tables
 */
public class RunnerDataTable {

    private ArrayList<DataTable> dataTables = new ArrayList<>();
    private Random random = new Random();
    /*
    This method create data main insertion
     */
    public ArrayList<DataTable> createDataTables() {
        for (int i = 0; i<50; i++) {
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
                    .setMga_dc_load_groups(listMGA_DC_LOAD_GROUPS())
                    .build();
            dataTables.add(dataTable);
        }
        return dataTables;
    }
    /*
    This method create List of MGA_DC_LOAD_GROUPS that contain DataTable
     */
    private List<MGA_DC_LOAD_GROUPS> listMGA_DC_LOAD_GROUPS() {
        List<MGA_DC_LOAD_GROUPS> mga_dc_load_groups = new ArrayList<>();
        for (int i=0; i<10; i++) {
            mga_dc_load_groups.add(new MGA_DC_LOAD_GROUPS.Builder().setSOURCE_ID(random.nextInt())
                    .setLOAD_GROUP_TYPE_ID(random.nextInt())
                    .setMga_dc_debts_activities(listMGA_DC_DEBTS_ACTIVITIES())
                    .build());
        }
        return mga_dc_load_groups;
    }
    /*
    This method create List of MGA_DC_DEBTS_ACTIVITIES that contain MGA_DC_LOAD_GROUPS
     */
    private List<MGA_DC_DEBTS_ACTIVITIES> listMGA_DC_DEBTS_ACTIVITIES() {
        List<MGA_DC_DEBTS_ACTIVITIES> mga_dc_debts_activities = new ArrayList<>();
        for (int i=0; i<10; i++) {
            mga_dc_debts_activities.add(new MGA_DC_DEBTS_ACTIVITIES.Builder()
                    .setDEPARTMENT_ID(random.nextInt())
                    .setDEBT_GROUP_ID(random.nextInt())
                    .setMAIN_PRO_ID(random.nextInt())
                    .setSUB_PRO_ID(random.nextInt())
                    .setSTATUS_ID(random.nextInt())
                    .build());
        }
        return mga_dc_debts_activities;
    }
    /*
    This method create data for updating row in the table MGA_DC_BANKS_ACTIVITY by id=1
     */
    public DataTable updateMGA_DC_BANKS_ACTIVITY() {
        return new DataTable.Builder()
                .setMga_dc_banks_activity(new MGA_DC_BANKS_ACTIVITY.Builder()
                        .setDEPARTMENT_ID(1)
                        .setDEBTS_ACTIVITY_ID(1)
                        .setBANK_ID(1)
                        .setREQUEST_TYPE_ID(1)
                        .build())
                .build();
    }
}

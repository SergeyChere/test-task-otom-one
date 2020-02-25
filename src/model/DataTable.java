package model;

import java.util.List;

public class DataTable {

    private MGA_DC_BANKS_ACTIVITY mga_dc_banks_activity;
    private MGA_DC_DEBTS mga_dc_debts;
    private List<MGA_DC_LOAD_GROUPS> mga_dc_load_groups;

    public DataTable() {}

    public DataTable(MGA_DC_BANKS_ACTIVITY mga_dc_banks_activity,
                     MGA_DC_DEBTS mga_dc_debts,
                     List<MGA_DC_LOAD_GROUPS> mga_dc_load_groups) {
        this.mga_dc_banks_activity=mga_dc_banks_activity;
        this.mga_dc_debts=mga_dc_debts;
        this.mga_dc_load_groups=mga_dc_load_groups;
    }

    public MGA_DC_BANKS_ACTIVITY getMga_dc_banks_activity() {
        return mga_dc_banks_activity;
    }

    public MGA_DC_DEBTS getMga_dc_debts() {
        return mga_dc_debts;
    }

    public List<MGA_DC_LOAD_GROUPS> getMga_dc_load_groups() {
        return mga_dc_load_groups;
    }

    public static class Builder {

        private MGA_DC_BANKS_ACTIVITY mga_dc_banks_activity;
        private MGA_DC_DEBTS mga_dc_debts;
        private List<MGA_DC_LOAD_GROUPS> mga_dc_load_groups;

        public Builder(){}

        public DataTable.Builder setMga_dc_banks_activity(MGA_DC_BANKS_ACTIVITY mga_dc_banks_activity) {
            this.mga_dc_banks_activity = mga_dc_banks_activity;
            return this;
        }

        public DataTable.Builder setMga_dc_debts(MGA_DC_DEBTS mga_dc_debts) {
            this.mga_dc_debts = mga_dc_debts;
            return this;
        }

        public DataTable.Builder setMga_dc_load_groups(List<MGA_DC_LOAD_GROUPS> mga_dc_load_groups) {
            this.mga_dc_load_groups = mga_dc_load_groups;
            return this;
        }

        public DataTable build() {
            return new DataTable(mga_dc_banks_activity, mga_dc_debts, mga_dc_load_groups);
        }
    }
}

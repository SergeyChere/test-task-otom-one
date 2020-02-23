package model;

public class DataTable {

    private MGA_DC_BANKS_ACTIVITY mga_dc_banks_activity;
    private MGA_DC_DEBTS mga_dc_debts;
    private MGA_DC_DEBTS_ACTIVITIES mga_dc_debts_activities;
    private MGA_DC_LOAD_GROUPS mga_dc_load_groups;

    public DataTable() {}

    public DataTable(MGA_DC_BANKS_ACTIVITY mga_dc_banks_activity,
                     MGA_DC_DEBTS mga_dc_debts,
                     MGA_DC_DEBTS_ACTIVITIES mga_dc_debts_activities,
                     MGA_DC_LOAD_GROUPS mga_dc_load_groups) {
        this.mga_dc_banks_activity=mga_dc_banks_activity;
        this.mga_dc_debts=mga_dc_debts;
        this.mga_dc_debts_activities=mga_dc_debts_activities;
        this.mga_dc_load_groups=mga_dc_load_groups;
    }

    public MGA_DC_BANKS_ACTIVITY getMga_dc_banks_activity() {
        return mga_dc_banks_activity;
    }

    public MGA_DC_DEBTS getMga_dc_debts() {
        return mga_dc_debts;
    }

    public MGA_DC_DEBTS_ACTIVITIES getMga_dc_debts_activities() {
        return mga_dc_debts_activities;
    }

    public MGA_DC_LOAD_GROUPS getMga_dc_load_groups() {
        return mga_dc_load_groups;
    }

    public static class Builder {
        private MGA_DC_BANKS_ACTIVITY mga_dc_banks_activity;
        private MGA_DC_DEBTS mga_dc_debts;
        private MGA_DC_DEBTS_ACTIVITIES mga_dc_debts_activities;
        private MGA_DC_LOAD_GROUPS mga_dc_load_groups;

        public Builder(){}

        public Builder setMga_dc_banks_activity(MGA_DC_BANKS_ACTIVITY mga_dc_banks_activity) {
            this.mga_dc_banks_activity = mga_dc_banks_activity;
            return this;
        }

        public Builder setMga_dc_debts(MGA_DC_DEBTS mga_dc_debts) {
            this.mga_dc_debts = mga_dc_debts;
            return this;
        }

        public Builder setMga_dc_debts_activities(MGA_DC_DEBTS_ACTIVITIES mga_dc_debts_activities) {
            this.mga_dc_debts_activities = mga_dc_debts_activities;
            return this;
        }

        public Builder setMga_dc_load_groups(MGA_DC_LOAD_GROUPS mga_dc_load_groups) {
            this.mga_dc_load_groups = mga_dc_load_groups;
            return this;
        }

        public DataTable build() {
            return new DataTable(mga_dc_banks_activity, mga_dc_debts, mga_dc_debts_activities, mga_dc_load_groups);
        }
    }

    @Override
    public String toString() {
        return "DataTable{" +
                "mga_dc_banks_activity=" + mga_dc_banks_activity +
                ", mga_dc_debts=" + mga_dc_debts +
                ", mga_dc_debts_activities=" + mga_dc_debts_activities +
                ", mga_dc_load_groups=" + mga_dc_load_groups +
                '}';
    }
}

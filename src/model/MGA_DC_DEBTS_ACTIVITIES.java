package model;

public class MGA_DC_DEBTS_ACTIVITIES {

    private int DEBTS_ACTIVITY_ID;
    private int DEPARTMENT_ID;
    private int DEBT_GROUP_ID;
    private int MAIN_PRO_ID;
    private int SUB_PRO_ID;
    private int STATUS_ID;

    public MGA_DC_DEBTS_ACTIVITIES() {}

    public MGA_DC_DEBTS_ACTIVITIES(int DEBTS_ACTIVITY_ID, int DEPARTMENT_ID, int DEBT_GROUP_ID, int MAIN_PRO_ID, int SUB_PRO_ID, int STATUS_ID) {
        this.DEBTS_ACTIVITY_ID=DEBTS_ACTIVITY_ID;
        this.DEPARTMENT_ID=DEPARTMENT_ID;
        this.DEBT_GROUP_ID=DEBT_GROUP_ID;
        this.MAIN_PRO_ID=MAIN_PRO_ID;
        this.SUB_PRO_ID=SUB_PRO_ID;
        this.STATUS_ID=STATUS_ID;
    }

    public MGA_DC_DEBTS_ACTIVITIES(int DEPARTMENT_ID, int DEBT_GROUP_ID, int MAIN_PRO_ID, int SUB_PRO_ID, int STATUS_ID) {
        this.DEPARTMENT_ID=DEPARTMENT_ID;
        this.DEBT_GROUP_ID=DEBT_GROUP_ID;
        this.MAIN_PRO_ID=MAIN_PRO_ID;
        this.SUB_PRO_ID=SUB_PRO_ID;
        this.STATUS_ID=STATUS_ID;
    }

    public int getDEBT_GROUP_ID() {
        return DEBT_GROUP_ID;
    }

    public int getDEBTS_ACTIVITY_ID() {
        return DEBTS_ACTIVITY_ID;
    }

    public int getDEPARTMENT_ID() {
        return DEPARTMENT_ID;
    }

    public int getMAIN_PRO_ID() {
        return MAIN_PRO_ID;
    }

    public int getSTATUS_ID() {
        return STATUS_ID;
    }

    public int getSUB_PRO_ID() {
        return SUB_PRO_ID;
    }

    public static class Builder {

        private int DEBTS_ACTIVITY_ID;
        private int DEPARTMENT_ID;
        private int DEBT_GROUP_ID;
        private int MAIN_PRO_ID;
        private int SUB_PRO_ID;
        private int STATUS_ID;

        public Builder() {}

        public MGA_DC_DEBTS_ACTIVITIES.Builder setDEBT_GROUP_ID(int DEBT_GROUP_ID) {
            this.DEBT_GROUP_ID = DEBT_GROUP_ID;
            return this;
        }

        public MGA_DC_DEBTS_ACTIVITIES.Builder setDEBTS_ACTIVITY_ID(int DEBTS_ACTIVITY_ID) {
            this.DEBTS_ACTIVITY_ID = DEBTS_ACTIVITY_ID;
            return this;
        }

        public MGA_DC_DEBTS_ACTIVITIES.Builder setDEPARTMENT_ID(int DEPARTMENT_ID) {
            this.DEPARTMENT_ID = DEPARTMENT_ID;
            return this;
        }

        public MGA_DC_DEBTS_ACTIVITIES.Builder setMAIN_PRO_ID(int MAIN_PRO_ID) {
            this.MAIN_PRO_ID = MAIN_PRO_ID;
            return this;
        }

        public MGA_DC_DEBTS_ACTIVITIES.Builder setSTATUS_ID(int STATUS_ID) {
            this.STATUS_ID = STATUS_ID;
            return this;
        }

        public MGA_DC_DEBTS_ACTIVITIES.Builder setSUB_PRO_ID(int SUB_PRO_ID) {
            this.SUB_PRO_ID = SUB_PRO_ID;
            return this;
        }

        public MGA_DC_DEBTS_ACTIVITIES build() {
            return new MGA_DC_DEBTS_ACTIVITIES(DEBTS_ACTIVITY_ID, DEPARTMENT_ID, DEBT_GROUP_ID, MAIN_PRO_ID, SUB_PRO_ID, STATUS_ID);
        }

    }
}

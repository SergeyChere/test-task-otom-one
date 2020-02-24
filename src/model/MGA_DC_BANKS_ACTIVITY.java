package model;

public class MGA_DC_BANKS_ACTIVITY {

    private int BANK_ACTIVITY_ID;
    private int DEPARTMENT_ID;
    private int DEBTS_ACTIVITY_ID;
    private int BANK_ID;
    private int REQUEST_TYPE_ID;

    public MGA_DC_BANKS_ACTIVITY() {}

    public MGA_DC_BANKS_ACTIVITY(int BANK_ACTIVITY_ID, int DEPARTMENT_ID, int DEBTS_ACTIVITY_ID, int BANK_ID, int REQUEST_TYPE_ID) {
        this.BANK_ACTIVITY_ID=BANK_ACTIVITY_ID;
        this.DEPARTMENT_ID=DEPARTMENT_ID;
        this.DEBTS_ACTIVITY_ID=DEBTS_ACTIVITY_ID;
        this.BANK_ID=BANK_ID;
        this.REQUEST_TYPE_ID=REQUEST_TYPE_ID;
    }

    public MGA_DC_BANKS_ACTIVITY(int DEPARTMENT_ID, int DEBTS_ACTIVITY_ID, int BANK_ID, int REQUEST_TYPE_ID) {
        this.DEPARTMENT_ID=DEPARTMENT_ID;
        this.DEBTS_ACTIVITY_ID=DEBTS_ACTIVITY_ID;
        this.BANK_ID=BANK_ID;
        this.REQUEST_TYPE_ID=REQUEST_TYPE_ID;
    }

    public int getDEPARTMENT_ID() {
        return DEPARTMENT_ID;
    }

    public int getDEBTS_ACTIVITY_ID() {
        return DEBTS_ACTIVITY_ID;
    }

    public int getBANK_ACTIVITY_ID() {
        return BANK_ACTIVITY_ID;
    }

    public int getBANK_ID() {
        return BANK_ID;
    }

    public int getREQUEST_TYPE_ID() {
        return REQUEST_TYPE_ID;
    }

    public static class Builder {

        private int BANK_ACTIVITY_ID;
        private int DEPARTMENT_ID;
        private int DEBTS_ACTIVITY_ID;
        private int BANK_ID;
        private int REQUEST_TYPE_ID;

        public Builder(){}

        public MGA_DC_BANKS_ACTIVITY.Builder setDEPARTMENT_ID(int DEPARTMENT_ID) {
            this.DEPARTMENT_ID = DEPARTMENT_ID;
            return this;
        }

        public MGA_DC_BANKS_ACTIVITY.Builder setDEBTS_ACTIVITY_ID(int DEBTS_ACTIVITY_ID) {
            this.DEBTS_ACTIVITY_ID = DEBTS_ACTIVITY_ID;
            return this;
        }

        public MGA_DC_BANKS_ACTIVITY.Builder setBANK_ACTIVITY_ID(int BANK_ACTIVITY_ID) {
            this.BANK_ACTIVITY_ID = BANK_ACTIVITY_ID;
            return this;
        }

        public MGA_DC_BANKS_ACTIVITY.Builder setBANK_ID(int BANK_ID) {
            this.BANK_ID = BANK_ID;
            return this;
        }

        public MGA_DC_BANKS_ACTIVITY.Builder setREQUEST_TYPE_ID(int REQUEST_TYPE_ID) {
            this.REQUEST_TYPE_ID = REQUEST_TYPE_ID;
            return this;
        }

        public MGA_DC_BANKS_ACTIVITY build() {
            return new MGA_DC_BANKS_ACTIVITY(BANK_ACTIVITY_ID, DEPARTMENT_ID, DEBTS_ACTIVITY_ID, BANK_ID, REQUEST_TYPE_ID);
        }
    }
}

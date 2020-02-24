package model;

public class MGA_DC_DEBTS {

    private int DEBTOR_ID;
    private int IDENTIFIER;
    private int SERVICE_TYPE;
    private int SOURCE_ID;
    private int DEBT_ID;
    private int LOAD_GROUP_ID;

    public MGA_DC_DEBTS() {}

    public MGA_DC_DEBTS(int DEBTOR_ID, int IDENTIFIER, int SERVICE_TYPE, int SOURCE_ID, int DEBT_ID, int LOAD_GROUP_ID) {
        this.DEBTOR_ID=DEBTOR_ID;
        this.IDENTIFIER=IDENTIFIER;
        this.SERVICE_TYPE=SERVICE_TYPE;
        this.SOURCE_ID=SOURCE_ID;
        this.DEBT_ID=DEBT_ID;
        this.LOAD_GROUP_ID=LOAD_GROUP_ID;
    }

    public MGA_DC_DEBTS(int IDENTIFIER, int SERVICE_TYPE, int SOURCE_ID, int DEBT_ID, int LOAD_GROUP_ID) {
        this.IDENTIFIER=IDENTIFIER;
        this.SERVICE_TYPE=SERVICE_TYPE;
        this.SOURCE_ID=SOURCE_ID;
        this.DEBT_ID=DEBT_ID;
        this.LOAD_GROUP_ID=LOAD_GROUP_ID;
    }

    public int getSOURCE_ID() {
        return SOURCE_ID;
    }

    public int getLOAD_GROUP_ID() {
        return LOAD_GROUP_ID;
    }

    public int getDEBT_ID() {
        return DEBT_ID;
    }

    public int getDEBTOR_ID() {
        return DEBTOR_ID;
    }

    public int getIDENTIFIER() {
        return IDENTIFIER;
    }

    public int getSERVICE_TYPE() {
        return SERVICE_TYPE;
    }

    public static class Builder {

        private int DEBTOR_ID;
        private int IDENTIFIER;
        private int SERVICE_TYPE;
        private int SOURCE_ID;
        private int DEBT_ID;
        private int LOAD_GROUP_ID;

        public Builder() {}

        public MGA_DC_DEBTS.Builder setSOURCE_ID(int SOURCE_ID) {
            this.SOURCE_ID = SOURCE_ID;
            return this;
        }

        public MGA_DC_DEBTS.Builder setLOAD_GROUP_ID(int LOAD_GROUP_ID) {
            this.LOAD_GROUP_ID = LOAD_GROUP_ID;
            return this;
        }

        public MGA_DC_DEBTS.Builder setDEBT_ID(int DEBT_ID) {
            this.DEBT_ID = DEBT_ID;
            return this;
        }

        public MGA_DC_DEBTS.Builder setDEBTOR_ID(int DEBTOR_ID) {
            this.DEBTOR_ID = DEBTOR_ID;
            return this;
        }

        public MGA_DC_DEBTS.Builder setIDENTIFIER(int IDENTIFIER) {
            this.IDENTIFIER = IDENTIFIER;
            return this;
        }

        public MGA_DC_DEBTS.Builder setSERVICE_TYPE(int SERVICE_TYPE) {
            this.SERVICE_TYPE = SERVICE_TYPE;
            return this;
        }

        public MGA_DC_DEBTS build() {
            return new MGA_DC_DEBTS(DEBTOR_ID, IDENTIFIER, SERVICE_TYPE, SOURCE_ID, DEBT_ID, LOAD_GROUP_ID);
        }
    }
}

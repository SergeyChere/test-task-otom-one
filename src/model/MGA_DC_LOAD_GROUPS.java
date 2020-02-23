package model;

public class MGA_DC_LOAD_GROUPS {

    private int LOAD_GROUP_ID;
    private int SOURCE_ID;
    private int LOAD_GROUP_TYPE_ID;

    public MGA_DC_LOAD_GROUPS() {}

    public MGA_DC_LOAD_GROUPS(int LOAD_GROUP_ID, int SOURCE_ID, int LOAD_GROUP_TYPE_ID) {
        this.LOAD_GROUP_ID=LOAD_GROUP_ID;
        this.SOURCE_ID=SOURCE_ID;
        this.LOAD_GROUP_TYPE_ID=LOAD_GROUP_TYPE_ID;
    }

    public MGA_DC_LOAD_GROUPS(int SOURCE_ID, int LOAD_GROUP_TYPE_ID) {
        this.SOURCE_ID=SOURCE_ID;
        this.LOAD_GROUP_TYPE_ID=LOAD_GROUP_TYPE_ID;
    }

    public int getLOAD_GROUP_ID() {
        return LOAD_GROUP_ID;
    }

    public int getSOURCE_ID() {
        return SOURCE_ID;
    }

    public int getLOAD_GROUP_TYPE_ID() {
        return LOAD_GROUP_TYPE_ID;
    }

    public static class Builder {

        private int LOAD_GROUP_ID;
        private int SOURCE_ID;
        private int LOAD_GROUP_TYPE_ID;

        public Builder() {}

        public MGA_DC_LOAD_GROUPS.Builder setLOAD_GROUP_ID(int LOAD_GROUP_ID) {
            this.LOAD_GROUP_ID = LOAD_GROUP_ID;
            return this;
        }

        public MGA_DC_LOAD_GROUPS.Builder setSOURCE_ID(int SOURCE_ID) {
            this.SOURCE_ID = SOURCE_ID;
            return this;
        }

        public MGA_DC_LOAD_GROUPS.Builder setLOAD_GROUP_TYPE_ID(int LOAD_GROUP_TYPE_ID) {
            this.LOAD_GROUP_TYPE_ID = LOAD_GROUP_TYPE_ID;
            return this;
        }

        public MGA_DC_LOAD_GROUPS build() {
            return new MGA_DC_LOAD_GROUPS(LOAD_GROUP_ID, SOURCE_ID, LOAD_GROUP_TYPE_ID);
        }

    }

    @Override
    public String toString() {
        return "MGA_DC_LOAD_GROUPS{" +
                "LOAD_GROUP_ID=" + LOAD_GROUP_ID +
                ", SOURCE_ID=" + SOURCE_ID +
                ", LOAD_GROUP_TYPE_ID=" + LOAD_GROUP_TYPE_ID +
                '}';
    }
}

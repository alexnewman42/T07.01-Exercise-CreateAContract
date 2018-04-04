package com.example.android.waitlist.data;

import android.provider.BaseColumns;

public final class WaitlistContract {

    private WaitlistContract() {}

    public final static class WaitlistEntry implements BaseColumns {
        public static final String TABLE_NAME = "waitlist";
        public static final String COLUMN_GUEST_NAME = "guestName";
        public static final String COLUMN_PARTY_SIZE = "partySize";
        public static final String COLUMN_TIMESTAMP = "timestamp";

    }

}

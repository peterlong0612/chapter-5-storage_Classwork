package com.camp.bit.todolist.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.nfc.NfcAdapter;
import android.provider.BaseColumns;

/**
 * Created on 2019/1/22.
 *
 * @author xuyingyi@bytedance.com (Yingyi Xu)
 */
public final class TodoContract {

    // TODO 定义表结构和 SQL 语句常量

    public static class TodoNote implements BaseColumns{
        public static final String TABLE_NAME = "note";
        public static final String COLUMN_CONTENT = "content";
        public static final String COLUMN_DATE = "date";
        public static final String COLUMN_STATE = "state";
        
    }
    public static final String SQL_CREATE_NOTES = "CREATE TABLE note(_id INTEGER PRIMARY KEY AUTOINCREMENT, date INTEGER, state INTEGER, content TEXT)";
    //
    public static final String SQL_DELETE_NOTES =
            "DROP TABLE IF EXISTS " + TodoNote.TABLE_NAME;

    private TodoContract() {
    }

}

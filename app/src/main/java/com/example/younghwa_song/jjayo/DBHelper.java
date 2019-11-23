package com.example.younghwa_song.jjayo;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.HashSet;


public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE TEST3 (_id INTEGER PRIMARY KEY AUTOINCREMENT, character TEXT, meaning TEXT, pronunciation TEXT, stage INTEGER, image INTEGER);");
        db.execSQL("CREATE TABLE HSK (_id INTEGER PRIMARY KEY AUTOINCREMENT, character TEXT, meaning TEXT, pronunciation TEXT, stage INTEGER);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    //스테이지 단어 INSERT

    public void insert(String character, String meaning, String pronunciation, int stage, int image) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("INSERT INTO TEST3 VALUES(null, '" + character + "', '" + meaning + "', '" + pronunciation + "', '" + stage + "', " + image + ");");
        db.close();
    }
    //HSK  단어 INSERT
    public void hsk_insert(String character, String meaning, String pronunciation, int stage) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("INSERT INTO HSK VALUES(null, '" + character + "', '" + meaning + "', '" + pronunciation + "', '" + stage + "');");
        db.close();
    }

    public void deleteTable() {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DROP TABLE TEST3");
        onCreate( db );
    }

    /*public String getResult(int stage, int number) {
        SQLiteDatabase db = getReadableDatabase();
        String result = "";

        Cursor cursor = db.rawQuery("SELECT * FROM TEST3 WHERE stage = " + stage + ";", null);
        cursor.moveToPosition(number);
        result += cursor.getString(0)
                + " : "
                + cursor.getString(1)
                + " | "
                + cursor.getString(2)
                + " | "
                + cursor.getString(3)
                + " | "
                + cursor.getInt(4)
                + " | "
                + cursor.getInt(5)
                + "\n";

        return result;
    }*/

    public HashSet<Word> getWordData(int stage) {
        SQLiteDatabase db = getReadableDatabase();
        HashSet<Word> words = new HashSet<>();

        Cursor cursor = db.rawQuery("SELECT character, pronunciation, meaning FROM TEST3 WHERE stage = " + stage + ";", null);

        while(cursor.moveToNext()) {
            words.add(new Word(cursor.getString(cursor.getColumnIndex("character")), cursor.getString(cursor.getColumnIndex("pronunciation")), cursor.getString(cursor.getColumnIndex("meaning"))));

        }

        return words;

    }

    //hsk 한자 단어
    public ArrayList<Word> getHskWordData(int stage) {
        SQLiteDatabase db = getReadableDatabase();
        ArrayList<Word> words = new ArrayList<>();

        Cursor cursor = db.rawQuery("SELECT character, pronunciation, meaning FROM HSK WHERE stage = " + stage + ";", null);

        while(cursor.moveToNext()) {
            words.add(new Word(cursor.getString(cursor.getColumnIndex("character")), cursor.getString(cursor.getColumnIndex("pronunciation")), cursor.getString(cursor.getColumnIndex("meaning"))));

        }

        return words;

    }

    public String getCharacter(int stage, int number) {
        SQLiteDatabase db = getReadableDatabase();
        String result = "";

        Cursor cursor = db.rawQuery("SELECT character FROM TEST3 WHERE stage = " + stage + ";", null);
        cursor.moveToPosition(number);
        result += cursor.getString(0)
                + "\n";

        return result;
    }

    public String getMeaning(int stage, int number) {
        SQLiteDatabase db = getReadableDatabase();
        String result = "";

        Cursor cursor = db.rawQuery("SELECT meaning FROM TEST3 WHERE stage = " + stage + ";", null);
        cursor.moveToPosition(number);
        result += cursor.getString(0)
                + "\n";

        return result;
    }

    public String getPronunciation(int stage, int number) {
        SQLiteDatabase db = getReadableDatabase();
        String result = "";

        Cursor cursor = db.rawQuery("SELECT pronunciation FROM TEST3 WHERE stage = " + stage + ";", null);
        cursor.moveToPosition(number);
        result += cursor.getString(0)
                + "\n";

        return result;
    }

    public int getImageRoute(int stage, int number) {
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT image FROM TEST3 WHERE stage = " + stage + ";", null);
        cursor.moveToPosition(number);

        int imageroute = cursor.getInt(0);
        return imageroute;
    }

}
package br.unigran.provasub.bancodeDados;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(@Nullable Context context) {
        super(context, "ListaAbastecimento", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String querySQL =
                "create table listaAbastecimento(" +
                        "quilometragem float," +
                        "quantidadeAbastecida float," +
                        "data varchar(15)," +
                        "valor float)";

        sqLiteDatabase.execSQL(querySQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

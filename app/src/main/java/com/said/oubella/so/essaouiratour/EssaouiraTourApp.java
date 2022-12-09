package com.said.oubella.so.essaouiratour;

import android.app.Application;

import com.said.oubella.so.essaouiratour.data.DataSource;
import com.said.oubella.so.essaouiratour.data.DataSourceImpl;

public final class EssaouiraTourApp extends Application {

    private DataSource dataSource;

    @Override
    public void onCreate() {
        super.onCreate();
        dataSource = new DataSourceImpl(this);
    }

    public DataSource dataSource() {
        return dataSource;
    }
}

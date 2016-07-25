package com.example.hzg.contentproviderdemo1;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by hzg on 16-7-25.
 */
public class MyContentProvider extends ContentProvider {

//    在ContentProvider创建后被调用
    @Override
    public boolean onCreate() {
        return false;
    }

//    根据Uri查询出Selection指定的条件所匹配的全部记录，并且可以指定查询哪些列，以什么方式（order）排序
    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] strings, @Nullable String s, @Nullable String[] strings1, @Nullable String s1) {
        return null;
    }

    //返回当前uri的MIME类型，如果该URI对应的数据可能包括多条记录
    //那么MIME类型字符串 就是以vnd.android.dir/开头
//	如果该URI对应的数据只有一条记录 该MIME类型字符串 就是以vnd.android.cursor.item/开头
    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    //根据Uri插入Values对应的数据
    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    //根据Uri删除selection指定的条件所匹配的全部记录
    @Override
    public int delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] strings) {
        return 0;
    }

    //根据uri修改selection指定的条件所匹配的全部记录
    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String selection, @Nullable String[] strings) {
        return 0;
    }
}

package com.droid.sendingobjecttodifferentactivity;

import android.os.Parcel;
import android.os.Parcelable;

public class Data implements Parcelable {
    String name;
    String lName;
    int age;

    Data() {

    }

    Data(String name, String lName, int age) {
        this.name = name;
        this.lName = lName;
        this.age = age;
    }

    protected Data(Parcel in) {
        name = in.readString();
        lName = in.readString();
        age = in.readInt();
    }

    public static final Creator<Data> CREATOR = new Creator<Data>() {
        @Override
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }

        @Override
        public Data[] newArray(int size) {
            return new Data[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(lName);
        parcel.writeInt(age);
    }
}

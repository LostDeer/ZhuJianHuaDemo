package meng.app_library;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by LiChaoBo on 2017/7/4.
 */

public class TestEntity implements Parcelable {
    private String a;

    public TestEntity(int b, String a) {
        this.b = b;
        this.a = a;
    }

    private int b;

    @Override
    public String toString() {
        return "TestEntity{" +
                "a='" + a + '\'' +
                ", b=" + b +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.a);
        dest.writeInt(this.b);
    }

    protected TestEntity(Parcel in) {
        this.a = in.readString();
        this.b = in.readInt();
    }

    public static final Creator<TestEntity> CREATOR = new Creator<TestEntity>() {
        public TestEntity createFromParcel(Parcel source) {
            return new TestEntity(source);
        }

        public TestEntity[] newArray(int size) {
            return new TestEntity[size];
        }
    };
}

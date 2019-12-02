package id.ac.polinema.dtsfit.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

// TODO: Implementasikan parcelable
public class Calory implements Parcelable {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("food")
    @Expose
    private String food;
    @SerializedName("calory")
    @Expose
    private Integer calory;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Integer getCalory() {
        return calory;
    }

    public void setCalory(Integer calory) {
        this.calory = calory;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}

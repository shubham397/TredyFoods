package com.example.user.trendy.Category;

import android.databinding.BaseObservable;

import java.io.Serializable;

public class SubCategoryModel  extends BaseObservable implements Serializable  {
    String id, title, image;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

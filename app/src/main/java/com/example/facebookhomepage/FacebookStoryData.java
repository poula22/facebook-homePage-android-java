package com.example.facebookhomepage;

public class FacebookStoryData {
    int imageId;
    String profileName;

    public FacebookStoryData(int imageId) {
        this.imageId = imageId;
    }

    public FacebookStoryData(int imageId, String profileName) {
        this.imageId = imageId;
        this.profileName = profileName;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }
}

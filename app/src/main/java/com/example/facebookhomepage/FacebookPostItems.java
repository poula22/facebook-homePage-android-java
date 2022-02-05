package com.example.facebookhomepage;

public class FacebookPostItems {
    private int profileIconId;
    private int postIamgeId;
    private String profileName;
    private String profileTime;
    private String postText;
    private String postReactionCount;
    private int postReactionIcon;

    private String reactionButtonText;
    private String commentButtonText;
    private String shareButtonText;

    private int reactionButtonIcon;
    private int commentButtonIcon;
    private int shareButtonIcon;

    public FacebookPostItems(int profileIconId, int postIamgeId, String profileName, String profileTime, String postText,
                             String postReactionCount, int postReactionIcon, String reactionButtonText, String commentButtonText,
                             String shareButtonText, int reactionButtonIcon, int commentButtonIcon, int shareButtonIcon) {

        this.profileIconId = profileIconId;
        this.postIamgeId = postIamgeId;
        this.profileName = profileName;
        this.profileTime = profileTime;
        this.postText = postText;
        this.postReactionCount = postReactionCount;
        this.postReactionIcon = postReactionIcon;
        this.reactionButtonText = reactionButtonText;
        this.commentButtonText = commentButtonText;
        this.shareButtonText = shareButtonText;

        this.reactionButtonIcon = reactionButtonIcon;
        this.commentButtonIcon = commentButtonIcon;
        this.shareButtonIcon = shareButtonIcon;
    }

    public int getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(int profileIconId) {
        this.profileIconId = profileIconId;
    }

    public int getPostIamgeId() {
        return postIamgeId;
    }

    public void setPostIamgeId(int postIamgeId) {
        this.postIamgeId = postIamgeId;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileTime() {
        return profileTime;
    }

    public void setProfileTime(String profileTime) {
        this.profileTime = profileTime;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getPostReactionCount() {
        return postReactionCount;
    }

    public void setPostReactionCount(String postReactionCount) {
        this.postReactionCount = postReactionCount;
    }

    public int getPostReactionIcon() {
        return postReactionIcon;
    }

    public void setPostReactionIcon(int postReactionIcon) {
        this.postReactionIcon = postReactionIcon;
    }

    public String getReactionButtonText() {
        return reactionButtonText;
    }

    public void setReactionButtonText(String reactionButtonText) {
        this.reactionButtonText = reactionButtonText;
    }

    public String getCommentButtonText() {
        return commentButtonText;
    }

    public void setCommentButtonText(String commentButtonText) {
        this.commentButtonText = commentButtonText;
    }

    public String getShareButtonText() {
        return shareButtonText;
    }

    public void setShareButtonText(String shareButtonText) {
        this.shareButtonText = shareButtonText;
    }

    public int getReactionButtonIcon() {
        return reactionButtonIcon;
    }

    public void setReactionButtonIcon(int reactionButtonIcon) {
        this.reactionButtonIcon = reactionButtonIcon;
    }

    public int getCommentButtonIcon() {
        return commentButtonIcon;
    }

    public void setCommentButtonIcon(int commentButtonIcon) {
        this.commentButtonIcon = commentButtonIcon;
    }

    public int getShareButtonIcon() {
        return shareButtonIcon;
    }

    public void setShareButtonIcon(int shareButtonIcon) {
        this.shareButtonIcon = shareButtonIcon;
    }
}

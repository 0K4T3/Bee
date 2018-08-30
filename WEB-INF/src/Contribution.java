package Bee;

import java.io.Serializable;

public class Contribution implements Serializable {
    private String id;
    private String contributorId;
    private String text;
    private String offerNum;
    private String gitUrl;

    // initializer
    public Contribution() {
        this.id = null;
        this.contributorId = null;
        this.text = null;
        this.offerNum = null;
        this.gitUrl = null;
    }

    // getter
    public String getId() { return this.id; }
    public String getContributorId() { return this.contributorId; }
    public String getText() { return this.text; }
    public String getOfferNum() { return this.offerNum; }
    public String getGitUrl() { return this.gitUrl; }

    // setter
    public void setId(String id) { this.id = id; }
    public void setContributorId(String contributorId) { this.contributorId = contributorId; }
    public void setText(String text) { this.text = text; }
    public void setOfferNum(String offerNum) { this.offerNum = offerNum; }
    public void setGitUrl(String gitUrl) { this.gitUrl = gitUrl; }
}

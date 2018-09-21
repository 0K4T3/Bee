package Bee;

import java.io.Serializable;

public class Contribution implements Serializable {
  private int id;
  private int contributorId;
  private String title;
  private String text;
  private int offerNum;
  private String gitUrl;

  // initializer
  public Contribution() {
    this.id = 0;
    this.contributorId = 0;
    this.title = null;
    this.text = null;
    this.offerNum = 0;
    this.gitUrl = null;
  }

  // getter
  public int getId() { return this.id; }
  public int getContributorId() { return this.contributorId; }
  public String getTitle() { return this.title; }
  public String getText() { return this.text; }
  public int getOfferNum() { return this.offerNum; }
  public String getGitUrl() { return this.gitUrl; }

  // setter
  public void setId(int id) { this.id = id; }
  public void setContributorId(int contributorId) { this.contributorId = contributorId; }
  public void setTitle(String title) { this.title = title; }
  public void setText(String text) { this.text = text; }
  public void setOfferNum(int offerNum) { this.offerNum = offerNum; }
  public void setGitUrl(String gitUrl) { this.gitUrl = gitUrl; }
}

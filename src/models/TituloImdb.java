package models;

public final class TituloImdb {

    private String id;
    private Integer rank;
    private String title;
    private String fullTitle;
    private Integer year;
    private String image;
    private String crew;
    private Integer imDbRating;
    private Integer imDbRatingCount;

    public TituloImdb(String id, Integer rank, String title, String fullTitle, Integer year, String image, String crew, Integer imDbRating, Integer imDbRatingCount) {
        this.id = id;
        this.rank = rank;
        this.title = title;
        this.fullTitle = fullTitle;
        this.year = year;
        this.image = image;
        this.crew = crew;
        this.imDbRating = imDbRating;
        this.imDbRatingCount = imDbRatingCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFullTitle() {
        return fullTitle;
    }

    public void setFullTitle(String fullTitle) {
        this.fullTitle = fullTitle;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public Integer getImDbRating() {
        return imDbRating;
    }

    public void setImDbRating(Integer imDbRating) {
        this.imDbRating = imDbRating;
    }

    public Integer getImDbRatingCount() {
        return imDbRatingCount;
    }

    public void setImDbRatingCount(Integer imDbRatingCount) {
        this.imDbRatingCount = imDbRatingCount;
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this || obj != null && obj.getClass() == this.getClass();
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "TituloImdb[]";
    }

}

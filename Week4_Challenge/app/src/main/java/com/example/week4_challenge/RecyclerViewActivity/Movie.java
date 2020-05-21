package com.example.week4_challenge.RecyclerViewActivity;

public class Movie {
    private String name;
    private String productionCompany;
    private String urlImage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductionCompany() {
        return productionCompany;
    }

    public void setProductionCompany(String productionCompany) {
        this.productionCompany = productionCompany;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", productionCompany='" + productionCompany + '\'' +
                ", urlImage='" + urlImage + '\'' +
                '}';
    }
}

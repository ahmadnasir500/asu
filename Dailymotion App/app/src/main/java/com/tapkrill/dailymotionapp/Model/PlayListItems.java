package com.tapkrill.dailymotionapp.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlayListItems {

    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("limit")
    @Expose
    private Integer limit;
    @SerializedName("explicit")
    @Expose
    private Boolean explicit;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("has_more")
    @Expose
    private Boolean hasMore;
    @SerializedName("list")
    @Expose
    private java.util.List<List> list = null;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Boolean getExplicit() {
        return explicit;
    }

    public void setExplicit(Boolean explicit) {
        this.explicit = explicit;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public java.util.List<List> getList() {
        return list;
    }

    public void setList(java.util.List<List> list) {
        this.list = list;
    }

    public class List {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("embed_url")
        @Expose
        private String embedUrl;
        @SerializedName("embed_html")
        @Expose
        private String embedHtml;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("thumbnail_180_url")
        @Expose
        private String thumbnail180Url;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getEmbedUrl() {
            return embedUrl;
        }

        public void setEmbedUrl(String embedUrl) {
            this.embedUrl = embedUrl;
        }

        public String getEmbedHtml() {
            return embedHtml;
        }

        public void setEmbedHtml(String embedHtml) {
            this.embedHtml = embedHtml;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getThumbnail180Url() {
            return thumbnail180Url;
        }

        public void setThumbnail180Url(String thumbnail180Url) {
            this.thumbnail180Url = thumbnail180Url;
        }

    }
}

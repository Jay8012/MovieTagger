package de.jay8012.models;

import java.util.Arrays;

public class TMDBResponse {
    private long page;
    private Metadata[] results;
    private long total_pages;
    private long total_results;

    public long getPage() {
        return page;
    }

    public void setPage(long page) {
        this.page = page;
    }

    public Metadata[] getResults() {
        return results;
    }

    public void setResults(Metadata[] results) {
        this.results = results;
    }

    public long getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(long total_pages) {
        this.total_pages = total_pages;
    }

    public long getTotal_results() {
        return total_results;
    }

    public void setTotal_results(long total_results) {
        this.total_results = total_results;
    }

    @Override
    public String toString() {
        return "TMDBResult{" +
               "page=" + page +
               ", results=" + Arrays.toString(results) +
               ", total_pages=" + total_pages +
               ", total_results=" + total_results +
               '}';
    }
}

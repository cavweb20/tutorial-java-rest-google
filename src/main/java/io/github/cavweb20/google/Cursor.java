package io.github.cavweb20.google;

import java.util.Set;

/**
 *
 * @author cavweb20
 */
public class Cursor
{

    private int currentPageIndex;
    private String estimatedResultCount;
    private String resultCount;
    private String moreResultsUrl;
    private String searchResultTime;
    private Set<Page> pages;

    /**
     * Get the value of pages
     *
     * @return the value of pages
     */
    public Set<Page> getPages()
    {
        return pages;
    }

    /**
     * Set the value of pages
     *
     * @param pages new value of pages
     */
    public void setPages(Set<Page> pages)
    {
        this.pages = pages;
    }

    /**
     * Get the value of searchResultTime
     *
     * @return the value of searchResultTime
     */
    public String getSearchResultTime()
    {
        return searchResultTime;
    }

    /**
     * Set the value of searchResultTime
     *
     * @param searchResultTime new value of searchResultTime
     */
    public void setSearchResultTime(String searchResultTime)
    {
        this.searchResultTime = searchResultTime;
    }

    /**
     * Get the value of moreResultsUrl
     *
     * @return the value of moreResultsUrl
     */
    public String getMoreResultsUrl()
    {
        return moreResultsUrl;
    }

    /**
     * Set the value of moreResultsUrl
     *
     * @param moreResultsUrl new value of moreResultsUrl
     */
    public void setMoreResultsUrl(String moreResultsUrl)
    {
        this.moreResultsUrl = moreResultsUrl;
    }

    /**
     * Get the value of estimatedResultCount
     *
     * @return the value of estimatedResultCount
     */
    public String getEstimatedResultCount()
    {
        return estimatedResultCount;
    }

    /**
     * Set the value of estimatedResultCount
     *
     * @param estimatedResultCount new value of estimatedResultCount
     */
    public void setEstimatedResultCount(String estimatedResultCount)
    {
        this.estimatedResultCount = estimatedResultCount;
    }

    /**
     * Get the value of currentPageIndex
     *
     * @return the value of currentPageIndex
     */
    public int getCurrentPageIndex()
    {
        return currentPageIndex;
    }

    /**
     * Set the value of currentPageIndex
     *
     * @param currentPageIndex new value of currentPageIndex
     */
    public void setCurrentPageIndex(int currentPageIndex)
    {
        this.currentPageIndex = currentPageIndex;
    }

    /**
     * Get the value of resultCount
     *
     * @return the value of resultCount
     */
    public String getResultCount()
    {
        return resultCount;
    }

    /**
     * Set the value of resultCount
     *
     * @param resultCount new value of resultCount
     */
    public void setResultCount(String resultCount)
    {
        this.resultCount = resultCount;
    }

}

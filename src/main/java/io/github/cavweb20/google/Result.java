package io.github.cavweb20.google;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author cavweb20
 */
public class Result
{
    
    @JsonProperty("GsearchResultClass") private String GsearchResultClass = null;
    private String unescapedUrl = null;
    private String url = null;
    private String visibleUrl = null;
    private String cacheUrl = null;
    private String title = null;
    private String titleNoFormatting = null;
    private String content = null;

    public String getGsearchResultClass()
    {
        return GsearchResultClass;
    }

    public void setGsearchResultClass(String gsearchResultClass)
    {
        GsearchResultClass = gsearchResultClass;
    }

    public String getUnescapedUrl()
    {
        return unescapedUrl;
    }

    public void setUnescapedUrl(String unescapedUrl)
    {
        this.unescapedUrl = unescapedUrl;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getVisibleUrl()
    {
        return visibleUrl;
    }

    public void setVisibleUrl(String visibleUrl)
    {
        this.visibleUrl = visibleUrl;
    }

    public String getCacheUrl()
    {
        return cacheUrl;
    }

    public void setCacheUrl(String cacheUrl)
    {
        this.cacheUrl = cacheUrl;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitleNoFormatting()
    {
        return titleNoFormatting;
    }

    public void setTitleNoFormatting(String titleNoFormatting)
    {
        this.titleNoFormatting = titleNoFormatting;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

}

package io.github.cavweb20.google;

import java.util.Set;

/**
 *
 * @author cavweb20
 */
public class ResponseData
{
    private Set<Result> results;
    private Cursor cursor;

    public Set<Result> getResults()
    {
        return results;
    }

    public void setResults(Set<Result> results)
    {
        this.results = results;
    }

    public Cursor getCursor()
    {
        return cursor;
    }

    public void setCursor(Cursor cursor)
    {
        this.cursor = cursor;
    }

}

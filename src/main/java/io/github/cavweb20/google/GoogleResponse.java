package io.github.cavweb20.google;

/**
 *
 * @author cavweb20
 */
public class GoogleResponse
{

    private ResponseData responseData = null;
    private String responseDetails = null;
    private int responseStatus;
    private Cursor cursor;

    public Cursor getCursor()
    {
        return cursor;
    }

    public void setCursor(Cursor cursor)
    {
        this.cursor = cursor;
    }

    public ResponseData getResponseData()
    {
        return responseData;
    }

    public void setResponseData(ResponseData responseData)
    {
        this.responseData = responseData;
    }

    public String getResponseDetails()
    {
        return responseDetails;
    }

    public void setResponseDetails(String responseDetails)
    {
        this.responseDetails = responseDetails;
    }

    public int getResponseStatus()
    {
        return responseStatus;
    }

    public void setResponseStatus(int responseStatus)
    {
        this.responseStatus = responseStatus;
    }

}

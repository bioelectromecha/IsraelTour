package roman.com.israeltour.data.dataobjects;

import com.apkfuns.logutils.LogUtils;

/**
 * The class is a dataobject that holds a place
 */
public class Place {
    private int mImageId;
    private String mName;
    private String mDescription;


    /**
     *  main and only constructor
     * @param imageId resource id for the drawable image
     * @param name name of the place
     * @param description short description of what the place is about
     */
    public Place(String name, String description,int imageId) {
        mImageId = imageId;
        mName = name;
        mDescription = description;
    }

    /**
     * get the drawable resource id
     * @return  the drawable resource id
     */
    public int getImageId() {
        return mImageId;
    }

    /**
     *  set the drawable resource id
     * @param imageId the drawable resource id
     */
    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }


}

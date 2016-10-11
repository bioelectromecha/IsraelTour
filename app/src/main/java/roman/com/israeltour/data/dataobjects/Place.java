package roman.com.israeltour.data.dataobjects;

import com.apkfuns.logutils.LogUtils;

/**
 * The class is a dataobject that holds a place
 */
public class Place {
    private int mImageId;
    private int mNameId;
    private int mDescriptionId;


    /**
     *  main and only constructor
     * @param imageId resource id for the drawable image
     * @param name name of the place
     * @param description short description of what the place is about
     */
    public Place(int name, int description,int imageId) {
        mImageId = imageId;
        mNameId = name;
        mDescriptionId = description;
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

    public int getName() {
        return mNameId;
    }

    public void setName(int name) {
        mNameId = name;
    }

    public int getDescription() {
        return mDescriptionId;
    }

    public void setDescription(int description) {
        mDescriptionId = description;
    }


}

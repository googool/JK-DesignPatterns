package objectOriented.abstraction;

/**
 * Created by chenjinxin on 2021/3/5 下午1:37
 */

class Image {
}

class Picture {
}

class PictureMetaInfo {
}

interface IPictureStorage {
    void savePicture(Picture picture);

    Image getPicture(String pictureId);

    void deletePicture(String pictureId);

    void modifyMetaInfo(String pictureId, PictureMetaInfo metaInfo);
}

public class PictureStorage implements IPictureStorage {
    // ...省略其他属性...
    @Override
    public void savePicture(Picture picture) {
    }

    @Override
    public Image getPicture(String pictureId) {
        return new Image();
    }

    @Override
    public void deletePicture(String pictureId) {
    }

    @Override
    public void modifyMetaInfo(String pictureId, PictureMetaInfo metaInfo) {
    }
}

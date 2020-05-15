package org.launchcode.studio7;

public abstract class BaseDisc {

    int storageCapacityInMB;
    boolean rewriteable;
    boolean playableByCDDevice;
    boolean playableByDVDDevice;
    int spinSpeedLowRangeRPM;
    int spinSpeedHighRangeRPM;
    String manufacturer;
    String id;

    public BaseDisc(int storageCapacityInMB, boolean rewriteable, boolean playableByCDDevice, boolean playableByDVDDevice, int spinSpeedLowRangeRPM, int spinSpeedHighRangeRPM, String manufacturer, String id) {
        this.storageCapacityInMB = storageCapacityInMB;
        this.rewriteable = rewriteable;
        this.playableByCDDevice = playableByCDDevice;
        this.playableByDVDDevice = playableByDVDDevice;
        this.spinSpeedLowRangeRPM = spinSpeedLowRangeRPM;
        this.spinSpeedHighRangeRPM = spinSpeedHighRangeRPM;
        this.manufacturer = manufacturer;
        this.id = id;
    }

    public BaseDisc(int storageCapacityInMB, boolean rewriteable, String id) {
        this.storageCapacityInMB = storageCapacityInMB;
        this.rewriteable = rewriteable;
        this.id = id;
    }

    public int getStorageCapacityInMB() {
        return storageCapacityInMB;
    }

    public void setStorageCapacityInMB(int storageCapacityInMB) {
        this.storageCapacityInMB = storageCapacityInMB;
    }

    public boolean isRewriteable() {
        return rewriteable;
    }

    public void setRewriteable(boolean rewriteable) {
        this.rewriteable = rewriteable;
    }

    public boolean isPlayableByCDDevice() {
        return playableByCDDevice;
    }

    public void setPlayableByCDDevice(boolean playableByCDDevice) {
        this.playableByCDDevice = playableByCDDevice;
    }

    public boolean isPlayableByDVDDevice() {
        return playableByDVDDevice;
    }

    public void setPlayableByDVDDevice(boolean playableByDVDDevice) {
        this.playableByDVDDevice = playableByDVDDevice;
    }

    public int getSpinSpeedLowRangeRPM() {
        return spinSpeedLowRangeRPM;
    }

    public void setSpinSpeedLowRangeRPM(int spinSpeedLowRangeRPM) {
        this.spinSpeedLowRangeRPM = spinSpeedLowRangeRPM;
    }

    public int getSpinSpeedHighRangeRPM() {
        return spinSpeedHighRangeRPM;
    }

    public void setSpinSpeedHighRangeRPM(int spinSpeedHighRangeRPM) {
        this.spinSpeedHighRangeRPM = spinSpeedHighRangeRPM;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    //getting overridden by the DVD/CD classes
    public void spinDisc() {
        System.out.println("I like to spin between " + this.spinSpeedLowRangeRPM + " and " + this.spinSpeedHighRangeRPM + " RPMs.");
    }
    public void breakDisc() {
        System.out.println("CD, DVD...we all break the same.");
    }
    public void coasterizeDisc() {
        System.out.println("CD, DVD...we all make good coasters.");
    }
    public void playMedia() {
        System.out.println("Enjoy playing your copy of " + this.id);
    }
}

package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {
    public DVD(int storageCapacityInMB, boolean rewriteable, boolean playableByCDDevice, boolean playableByDVDDevice, int spinSpeedLowRangeRPM, int spinSpeedHighRangeRPM, String manufacturer, String id) {
        super(storageCapacityInMB, rewriteable, playableByCDDevice, playableByDVDDevice, spinSpeedLowRangeRPM, spinSpeedHighRangeRPM, manufacturer, id);
    }

    public DVD(int storageCapacityInMB, boolean rewriteable, String id) {
        super(storageCapacityInMB, rewriteable, id);
    }

    @Override
    public void spinDisc() {
        System.out.println("I'm a DVD and I like to spin between " + this.spinSpeedLowRangeRPM + " and " + this.spinSpeedHighRangeRPM + " RPMs.");
    }

    @Override
    public void reportOnLoading() {
        System.out.println("I'm a DVD and I can hold "+this.storageCapacityInMB+" MB worth of stuff.");
    }

//    @Override
//    public void breakDisc() {
//
//    }

//    @Override
//    public void coasterizeDisc() {
//
//    }

//    @Override
//    public void playMedia() {
//
//    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}

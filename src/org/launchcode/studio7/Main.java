package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        CD nevermind = new CD(700,false,true,true,200,500,"SubPop","Nevermind");
        DVD ventureBrosSeason1 = new DVD(4700,false,false,true,570,1600,"Adult Swim","Venture Brothers Season 1");

        // TODO: Call each CD and DVD method to verify that they work as expected.

        nevermind.spinDisc();
        nevermind.reportOnLoading();
        nevermind.playMedia();
        nevermind.breakDisc();
        nevermind.coasterizeDisc();

        ventureBrosSeason1.spinDisc();
        ventureBrosSeason1.reportOnLoading();
        ventureBrosSeason1.playMedia();
        ventureBrosSeason1.breakDisc();
        ventureBrosSeason1.coasterizeDisc();


    }
}

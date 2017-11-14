package com.zisal.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created on 7/18/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class RequestReconcileContentDTO  implements Serializable {
    /**
     *
     *
     */
    private static final long serialVersionUID = -2943037919665874331L;

    @JsonProperty("plaza")
    private String plaza;

    @JsonProperty("lane")
    private String lane;

    @JsonProperty("shifdate")
    private String shifdate;

    @JsonProperty("shift")
    private String shift;

    @JsonProperty("perioda")
    private String perioda;

    @JsonProperty("idpull")
    private int idpull;

    @JsonProperty("idkspt")
    private int idkspt;

    @JsonProperty("waktubuka")
    private String waktubuka;

    @JsonProperty("waktututup")
    private String waktututup;

    @JsonProperty("lalinjmpass1")
    private int lalinjmpass1;

    @JsonProperty("lalinjmpass2")
    private int lalinjmpass2;

    @JsonProperty("lalinjmpass3")
    private int lalinjmpass3;

    @JsonProperty("lalinjmpass4")
    private int lalinjmpass4;

    @JsonProperty("lalinjmpass5")
    private int lalinjmpass5;

    @JsonProperty("rpjmpass")
    private int rpjmpass;

    @JsonProperty("revisitariff")
    private String revisitariff;

    @JsonProperty("flag1")
    private int flag1;

    @JsonProperty("flag2")
    private int flag2;

    @JsonProperty("flag3")
    private int flag3;

    @JsonProperty("signature")
    private String signature;

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public String getShifdate() {
        return shifdate;
    }

    public void setShifdate(String shifdate) {
        this.shifdate = shifdate;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getPerioda() {
        return perioda;
    }

    public void setPerioda(String perioda) {
        this.perioda = perioda;
    }

    public int getIdpull() {
        return idpull;
    }

    public void setIdpull(int idpull) {
        this.idpull = idpull;
    }

    public int getIdkspt() {
        return idkspt;
    }

    public void setIdkspt(int idkspt) {
        this.idkspt = idkspt;
    }

    public String getWaktubuka() {
        return waktubuka;
    }

    public void setWaktubuka(String waktubuka) {
        this.waktubuka = waktubuka;
    }

    public String getWaktututup() {
        return waktututup;
    }

    public void setWaktututup(String waktututup) {
        this.waktututup = waktututup;
    }

    public int getLalinjmpass1() {
        return lalinjmpass1;
    }

    public void setLalinjmpass1(int lalinjmpass1) {
        this.lalinjmpass1 = lalinjmpass1;
    }

    public int getLalinjmpass2() {
        return lalinjmpass2;
    }

    public void setLalinjmpass2(int lalinjmpass2) {
        this.lalinjmpass2 = lalinjmpass2;
    }

    public int getLalinjmpass3() {
        return lalinjmpass3;
    }

    public void setLalinjmpass3(int lalinjmpass3) {
        this.lalinjmpass3 = lalinjmpass3;
    }

    public int getLalinjmpass4() {
        return lalinjmpass4;
    }

    public void setLalinjmpass4(int lalinjmpass4) {
        this.lalinjmpass4 = lalinjmpass4;
    }

    public int getLalinjmpass5() {
        return lalinjmpass5;
    }

    public void setLalinjmpass5(int lalinjmpass5) {
        this.lalinjmpass5 = lalinjmpass5;
    }

    public int getRpjmpass() {
        return rpjmpass;
    }

    public void setRpjmpass(int rpjmpass) {
        this.rpjmpass = rpjmpass;
    }

    public String getRevisitariff() {
        return revisitariff;
    }

    public void setRevisitariff(String revisitariff) {
        this.revisitariff = revisitariff;
    }

    public int getFlag1() {
        return flag1;
    }

    public void setFlag1(int flag1) {
        this.flag1 = flag1;
    }

    public int getFlag2() {
        return flag2;
    }

    public void setFlag2(int flag2) {
        this.flag2 = flag2;
    }

    public int getFlag3() {
        return flag3;
    }

    public void setFlag3(int flag3) {
        this.flag3 = flag3;
    }

    @Override
    public String toString() {
        return "RequestReconcileContentDTO{" +
                "plaza='" + plaza + '\'' +
                ", lane='" + lane + '\'' +
                ", shifdate='" + shifdate + '\'' +
                ", shift='" + shift + '\'' +
                ", perioda='" + perioda + '\'' +
                ", idpull=" + idpull +
                ", idkspt=" + idkspt +
                ", waktubuka='" + waktubuka + '\'' +
                ", waktututup='" + waktututup + '\'' +
                ", lalinjmpass1=" + lalinjmpass1 +
                ", lalinjmpass2=" + lalinjmpass2 +
                ", lalinjmpass3=" + lalinjmpass3 +
                ", lalinjmpass4=" + lalinjmpass4 +
                ", lalinjmpass5=" + lalinjmpass5 +
                ", rpjmpass=" + rpjmpass +
                ", revisitariff='" + revisitariff + '\'' +
                ", flag1=" + flag1 +
                ", flag2=" + flag2 +
                ", flag3=" + flag3 +
                ", signature='" + signature + '\'' +
                '}';
    }
}

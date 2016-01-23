package com.ko.domain;

/**
 * Created by IntelliJ IDEA.
 * User: ammmoho
 * Date: 12 พ.ค. 2553
 * Time: 14:10:48
 * To change this template use File | Settings | File Templates.
 */
public class VSRList {
    private String arrest_qty;
    private String legislation_name;
    private String guilt_bast;
    private String exhibit;
    private String compare_fine;

    public String getArrest_qty() {
        return arrest_qty;
    }

    public void setArrest_qty(String arrest_qty) {
        this.arrest_qty = arrest_qty;
    }

    public String getLegislation_name() {
        return legislation_name;
    }

    public void setLegislation_name(String legislation_name) {
        this.legislation_name = legislation_name;
    }

    public String getGuilt_bast() {
        return guilt_bast;
    }

    public void setGuilt_bast(String guilt_bast) {
        this.guilt_bast = guilt_bast;
    }

    public String getExhibit() {
        return exhibit;
    }

    public void setExhibit(String exhibit) {
        this.exhibit = exhibit;
    }

    public String getCompare_fine() {
        return compare_fine;
    }

    public void setCompare_fine(String compare_fine) {
        this.compare_fine = compare_fine;
    }
}